package pl.coderslab.warsztat5katw01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("")
    @ResponseBody
    public String home() {
        return "You are in home!!!";
    }

}
