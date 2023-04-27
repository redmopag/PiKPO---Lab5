package com.example.sweater.controller;

<<<<<<< Updated upstream
import com.example.sweater.domain.PopulationGrowth;
import com.example.sweater.repos.PopulationGrowthRepo;
=======
import com.example.sweater.domain.RequestDomain;
import com.example.sweater.services.PopulationGrowthService;

>>>>>>> Stashed changes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
<<<<<<< Updated upstream
    private PopulationGrowthRepo populationGrowthRepo;
=======
    private PopulationGrowthService populationGrowthService;
    private void setModel(Model model){
        model.addAttribute("years", populationGrowthService.getYears());
        model.addAttribute("growthsInCountries", populationGrowthService.getGrowthsInCountries());
    }
>>>>>>> Stashed changes

    /*
    @GetMapping("/form")
    public String getGrowth(Model model)
    {
<<<<<<< Updated upstream
        List<PopulationGrowth> growths = populationGrowthRepo.findAll();
        model.addAttribute("growths", growths);
=======
        populationGrowthService.processFindAll();
        setModel(model);
        return "index";
    }
     */

    @PostMapping("filter")
    public String filter(@RequestParam String countryName, Model model)
    {
        if(countryName != null && !countryName.isEmpty()) {
            populationGrowthService.processFindByCountry(countryName);
            setModel(model);
        } else {
            populationGrowthService.processFindAll();
            setModel(model);
        }
>>>>>>> Stashed changes
        return "index";
    }
}
