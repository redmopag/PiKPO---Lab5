package com.example.sweater.services.help_class;

import java.util.ArrayList;
import java.util.List;

public class GrowthInCountry {
    private String country;
    private List<Float> growths = new ArrayList<>();

    public GrowthInCountry() {}
    public GrowthInCountry(String country, List<Float> growths)
    {
        this.country = country;
        this.growths = growths;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void addGrowth(Float toAdd)
    {
        growths.add(toAdd);
    }
    public String getCountry() {return country;}
    public List<Float> getGrowths(){ return growths;}
}
