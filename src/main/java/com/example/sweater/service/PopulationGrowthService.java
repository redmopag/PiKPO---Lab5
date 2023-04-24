package com.example.sweater.service;

import com.example.sweater.domain.PopulationGrowth;
import com.example.sweater.repos.PopulationGrowthRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PopulationGrowthService {
    @Autowired
    private PopulationGrowthRepo populationGrowthRepo;
    /*public List<PopulationGrowth> getAll()
    {
        List<PopulationGrowth> growths = populationGrowthRepo.findAll();
        return;
    }
     */
}
