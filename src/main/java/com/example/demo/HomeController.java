package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    CosRepository cosRepository;

    @RequestMapping("/")
    public String listCosmetics(Model model){
        model.addAttribute("cosmetics", cosRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String cosForm(Model model){
        model.addAttribute("cosmetic", new Cosmetic());
        return "cosForm";
    }

    @PostMapping("/process")
    public String processForm(@Valid Cosmetic cosmetic, BindingResult result){

        if (result.hasErrors()){
            return "cosForm";
        }
        cosRepository.save(cosmetic);
        return "redirect:/";

    }


}
