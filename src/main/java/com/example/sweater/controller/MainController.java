package com.example.sweater.controller;

import com.example.sweater.domain.PopulationGrowth;
import com.example.sweater.repos.PopulationGrowthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private PopulationGrowthRepo populationGrowthRepo;

    @GetMapping("/form")
    public String getGrowth(Model model)
    {
        List<PopulationGrowth> growths = populationGrowthRepo.findAll();
        model.addAttribute("growths", growths);
        return "index";
    }
}
