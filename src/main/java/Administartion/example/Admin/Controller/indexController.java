package Administartion.example.Admin.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public static String main() {
        return "dashboard";
    }

    @GetMapping("login")

    public static String login() {
        return "login";
    }

}
