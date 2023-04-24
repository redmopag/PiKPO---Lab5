package com.example.sweater.controller;

import com.example.sweater.service.PopulationGrowthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private PopulationGrowthService populationGrowthService;

    @GetMapping("/form")
    public String getData(Model model)
    {
        populationGrowthService.processFindAll();
        model.addAttribute("years", populationGrowthService.getYears());
        model.addAttribute("growthInCountry", populationGrowthService.getGrowthInCountry());
        return "index";
    }
}
