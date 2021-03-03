package controllers;


import Models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {


    @RequestMapping("registration")
    public String showRegistrationForm(Model model) {

        Customer customer = new Customer();
        model.addAttribute("customer", customer);

        return "customer-registration";
    }

    @RequestMapping("/confirmation")
    public String showConfirmationForm(@ModelAttribute("customer") Customer customer) {

        System.out.println("Your customer is named: " + customer.getFirstName());
        return "customer-confirmation";
    }
}
