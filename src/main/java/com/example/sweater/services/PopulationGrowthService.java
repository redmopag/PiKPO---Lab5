package com.example.sweater.services;

import com.example.sweater.domain.PopulationGrowth;
import com.example.sweater.repos.PopulationGrowthRepo;
import com.example.sweater.services.help_class.GrowthInCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PopulationGrowthService {
    @Autowired
    private PopulationGrowthRepo populationGrowthRepo;
    private final List<GrowthInCountry> growthsInCountries = new ArrayList<>();
    private final List<Integer> years = new ArrayList<>();
    private void processDataList(List<PopulationGrowth> growths)
    {
        int cnt = 1;
        while(Objects.equals(growths.get(cnt).getCountry(), growths.get(cnt - 1).getCountry())) {
            years.add(growths.get(cnt-1).getYear());
            ++cnt;
            if(cnt >= growths.size())
                break;
        }

        for(int i = 1; i < growths.size(); ++i)
        {
            GrowthInCountry tmp = new GrowthInCountry();
            while(Objects.equals(growths.get(i).getCountry(), growths.get(i - 1).getCountry())) {
                tmp.addGrowth(growths.get(i-1).getCount());
                ++i;
                if(i >= growths.size())
                    break;
            }
            tmp.setCountry(growths.get(i-1).getCountry());
            growthsInCountries.add(tmp);
        }
    }

    private void clean()
    {
        years.clear();
        growthsInCountries.clear();
    }
    public void processFindAll()
    {
        clean();
        List<PopulationGrowth> growths = populationGrowthRepo.findAll();
        processDataList(growths);
    }

    public void processFindByCountry(String name)
    {
        clean();
        List<PopulationGrowth> growths = populationGrowthRepo.findByCountry(name);
        processDataList(growths);
    }

    public List<GrowthInCountry> getGrowthsInCountries() {return growthsInCountries;}

    public List<Integer> getYears() {return years;}
}
