package com.example.sweater.service.help_class;

import java.util.ArrayList;
import java.util.List;

public class GrowthInCountry {
    private String country;
    private List<Float> value = new ArrayList<>();

    public void setCountry(String country) {
        this.country = country;
    }
    public void addGrowth(Float toAdd)
    {
        value.add(toAdd);
    }
}
