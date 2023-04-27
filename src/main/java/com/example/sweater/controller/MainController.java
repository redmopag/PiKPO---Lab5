package com.example.sweater.controller;

import com.example.sweater.services.PopulationGrowthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private PopulationGrowthService populationGrowthService;

    public void setModel(Model model)
    {
        model.addAttribute("years", populationGrowthService.getYears());
        model.addAttribute("growthsInCountries", populationGrowthService.getGrowthsInCountries());
    }

    @PostMapping("filter")
    public String filter(@RequestParam String countryName, Model model)
    {
        if(countryName != null && !countryName.isEmpty())
        {
            populationGrowthService.processFindByCountry(countryName);
            setModel(model);
        } else {
            populationGrowthService.processFindAll();
            setModel(model);
        }
        return "index";
    }
}
