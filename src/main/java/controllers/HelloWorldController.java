package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controller method to show the inital form

    @RequestMapping("/inputForm")
    public String showForm() {
        return "secondPage";
    }

    // need a controller method to process the form
    @RequestMapping("/outputForm")
    public String processForm() {
        return "thirdPage";
    }


    @RequestMapping("/additionalOutputForm")
    public String changeNameToCapitalLetters(HttpServletRequest request, Model model) {

        String parameter = request.getParameter("studentName");
        String capitalized = parameter.toUpperCase();
        String message = "Dude, WTF?! " + capitalized;
        model.addAttribute("message", message);

        return "thirdPage";
    }


    // using the @RequestParam("strudentName")
    @RequestMapping("/optionalForm")
    public String toCapitalLetters(@RequestParam("studentName") String student, Model model) {
        String capitalized = student.toUpperCase();
        String message = "Hello there " + capitalized;
        model.addAttribute("message", message);
        return "thirdPage";
    }
}
