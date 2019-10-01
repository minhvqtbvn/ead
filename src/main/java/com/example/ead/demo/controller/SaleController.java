package com.example.ead.demo.controller;

import com.example.ead.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sale")
public class SaleController{
    @Autowired
    SaleRepository saleRepository;
    @RequestMapping(method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("sales", saleRepository.findAll());
        return "listSale";
    }
}
