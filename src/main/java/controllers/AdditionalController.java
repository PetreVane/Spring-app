package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anotherPath")
public class AdditionalController {

    @RequestMapping("/inputForm")
    public String getSecondPage() {
        return "secondPage";
    }
}
