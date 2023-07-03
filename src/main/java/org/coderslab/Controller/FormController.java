package org.coderslab.Controller;

import org.coderslab.Dao.ExerciseDao;
import org.coderslab.Dao.UserDao;
import org.coderslab.Dao.WorkoutDao;
import org.coderslab.Model.User;
import org.coderslab.Service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
@Controller
@RequestMapping("/form")
public class FormController {

    private final UserRepository userRepository;

    @Autowired
    public FormController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "registration-form";
    }

    @PostMapping("/register")
    public String processRegistrationForm(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("formErrors", bindingResult);
            return "registration-form";
        }
        if (!isNameValid(user.getName())) { // walidacja dla pola name
            bindingResult.rejectValue("name", "name.invalid", "Name should contain only letters");
            model.addAttribute("formErrors", bindingResult);
            return "registration-form";
        }

        // Sprawdzanie wartości pola "age" , celowo zmienilem typ na String , aby validacja
        // przyjmowala prawidlowe zalozenia poniewaz w przeciwnym wypadku stanie sie jak w przypadku Weight
        // czyli najpierw wywola sie NumberFormatException PRZYPADEK 2
        String ageString = String.valueOf(user.getAge());
        if (!ageString.matches("\\d+")) {
            bindingResult.rejectValue("age", "age.invalid", "Age should contain only digits");
            model.addAttribute("formErrors", bindingResult);
            return "registration-form";
        }

        // Walidacja pola "weight":próbuje przekonwertować wartość typu String (np. "sto kilogramów") // PRZYPADEK 3
        // na oczekiwany typ Integer dla pola "weight". W momencie konwersji, mechanizm walidacji
        // nie jest jeszcze aktywny i dlatego pojawia sie komunikat :
        //Failed to convert property value of type java.lang.String to required type java.lang.Double for property weight;
        // nested exception is java.lang.NumberFormatException: For input string.
        // komunikat "Type weight in numbers" pojawi sie w momencie pisania liczby ujemnej
        if (getWeight(user) <= 0) {
            bindingResult.rejectValue("weight", "weight.invalid", "Type weight in numbers");
            model.addAttribute("formErrors", bindingResult);
            return "registration-form";
        }

        userRepository.save(user);
        return "registration-success";
    }

    private boolean isNameValid(String name) {
        return name.matches("^[a-zA-Z]+$");
    }

    private double getWeight(User user) {
        // Implementacja metody getWeight
        return user.getWeight();
    }
}