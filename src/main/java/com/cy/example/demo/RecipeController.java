package com.cy.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
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

    @RequestMapping("/recipespage")
    public String recipespage(){
        return "recipespage";
    };

    @RequestMapping("/barapage")
    public String baraPage(){
        return "barapage";
    };

    @RequestMapping("/croquepage")
    public String croquepage(){
        return "croquepage";
    };

    @RequestMapping("/golabjamun")
    public String golabpage(){
        return "golabjamun";
    };


    @RequestMapping("/injerapage")
    public String injerapage(){
        return "injerapage";
    };



}
