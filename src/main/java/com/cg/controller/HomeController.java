package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHomePage(Model model) {

        String name = "C0623";
        Long age = 100L;

        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "home";
    }
}
