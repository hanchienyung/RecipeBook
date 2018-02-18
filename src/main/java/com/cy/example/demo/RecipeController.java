package com.cy.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
    @RequestMapping("/")
    public String listRecipes(){
        return "mainpage";
    };

    @RequestMapping("/mainpage")
    public String mainPage(){
        return "mainpage";
    };

    @RequestMapping("/recipes")
    public String recipespage(){
        return "recipespage";
    };

    @RequestMapping("/bara")
    public String baraPage(){
        return "barapage";
    };

    @RequestMapping("/croque")
    public String croquepage(){
        return "croquepage";
    };

    @RequestMapping("/golabjamun")
    public String golabpage(){
        return "golabjamun";
    };


    @RequestMapping("/injera")
    public String injerapage(){
        return "injerapage";
    };



}
