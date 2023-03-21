package Administartion.example.Admin.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("Index")

    public static String index() {
        return "index";
    }
}
