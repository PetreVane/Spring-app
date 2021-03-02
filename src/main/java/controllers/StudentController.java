package controllers;
import Models.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller()
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/registration")
    public String studentRegistration(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countries", student.getCountriesList());

        return "registration-form";
    }

    @RequestMapping("/confirmation")
    public String studentConfirmation(@ModelAttribute("student") Student student) {
        String firstName = student.getFirstName();
        String lastName = student.getLastName();
        System.out.println("Student name is: " + firstName + " " + lastName);
        return "confirmation-form";
    }

}
