package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/anotherPath")
public class AdditionalController {

    @RequestMapping("/inputForm")
    public String getSecondPage() {
        return "secondPage";
    }

}
