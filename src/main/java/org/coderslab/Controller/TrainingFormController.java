package org.coderslab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TrainingFormController {

    @GetMapping("/wyborTreningu")
    public String showTrainingForm() {
        return "wyborTreningu";
    }

    @PostMapping("/wyborTreningu")
    public String processTrainingForm(@RequestParam("trainingLevel") String trainingLevel) {


        String redirec = "";
        if (trainingLevel.equals("hard")) {
            redirec = "treningGornychPartiiTrudny";
        } else if (trainingLevel.equals("easy")) {
            redirec = "treningOgolnyLatwy";
        }


        return redirec;
    }
}