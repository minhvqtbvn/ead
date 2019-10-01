package com.example.ead.demo.controller;

import com.example.ead.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sale")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(method= RequestMethod.POST,value = "create")
    public String getAll(Model model){
        model.addAttribute("products",productRepository.findAll());
        return "formproduct";
    }
    @RequestMapping(method= RequestMethod.POST,value = "create")
    public String getAll(Model model){
        model.addAttribute("products",productRepository.findAll());
        return "listproduct";
    }
}
