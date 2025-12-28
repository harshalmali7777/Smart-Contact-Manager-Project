package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController 
{
    @RequestMapping("/home")
    public String home(Model model)
    {
        System.out.println("Home page handler");

        //sending data to view
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("YoutubeChannel", "Learn");
        model.addAttribute("GithubRepository", "https://start.spring.io/");
        return "home";
    }

    //about 
    @RequestMapping("/about")
        public String aboutPage(Model model) {
            model.addAttribute("isLogin", false);
            System.out.println("About page loading");
            return "about";
    }

    //Services
    @RequestMapping("/services")
        public String servicesPage(){
            System.out.println("services page loading");
            return "services";
        }
}
