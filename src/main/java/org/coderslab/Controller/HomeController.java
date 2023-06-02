package org.coderslab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/parts")
    public String chooseparts() {
        return "parts";
    }

    @GetMapping("/cwiczenia")
    public String chooseExercise() {
        return "cwiczenia";
    }
    @GetMapping("/brzuch")
    public String chooseBrzuch() {
        return "brzuch";
    }
    @GetMapping("/gornePartie")
    public String chooseUp() {
        return "gornePartie";
    }
    @GetMapping("/dolnePartie")
    public String chooseDown() {
        return "dolnePartie";
    }
    @GetMapping("/barki")
    public String chooseBarki() {
        return "barki";
    }
    @GetMapping("/biceps")
    public String chooseBiceps() {
        return "biceps";
    }
    @GetMapping("/klata")
    public String chooseKlata() {
        return "klata";
    }
    @GetMapping("/plecy")
    public String choosePlecy() {
        return "plecy";
    }
    @GetMapping("/treningi")
    public String chooseTreningi() {
        return "treningi";
    }
    @GetMapping("/treningOgolnyLatwy")
    public String chooseTreningOgolnyLatwy() {
        return "treningOgolnyLatwy";
    }
    @GetMapping("/treningGornychPartiiTrudny")
    public String chooseTreningGornychPartiiTrudny() {return "treningGornychPartiiTrudny";
    }
    @GetMapping("/trainForm")
    public String chooseTrainForm() {
        return "trainForm";
    }

}


