package com.example.sweater.services;

import com.example.sweater.domain.PopulationGrowth;
import com.example.sweater.repos.PopulationGrowthRepo;
import com.example.sweater.services.help_class.GrowthInCountry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PopulationGrowthService {
    @Autowired
    private PopulationGrowthRepo populationGrowthRepo;
    private final ArrayList<GrowthInCountry> growthInCountry = new ArrayList<>();
    private final List<Integer> years = new ArrayList<>();
    private void processDataList(List<PopulationGrowth> growths)
    {
        int cnt = 0;
        while(growths.get(cnt).getCountry() == growths.get(cnt + 1).getCountry()) {
            years.add(growths.get(cnt).getYear());
            ++cnt;
        }
        years.add(growths.get(cnt).getYear());

        for(int i = 0; i < growths.size(); ++i)
        {
            GrowthInCountry tmp = new GrowthInCountry();
            while(growths.get(i).getCountry() == growths.get(i+1).getCountry()) {
                tmp.addGrowth(growths.get(i).getCount());
                ++i;
            }
            tmp.addGrowth(growths.get(i).getCount());
            tmp.setCountry(growths.get(i).getCountry());
            growthInCountry.add(tmp);
        }
    }

    public void processFindAll()
    {
        List<PopulationGrowth> growths = populationGrowthRepo.findAll();
        processDataList(growths);
    }

    public List<GrowthInCountry> getGrowthInCountry() {return growthInCountry;}

    public List<Integer> getYears() {return years;}
}
