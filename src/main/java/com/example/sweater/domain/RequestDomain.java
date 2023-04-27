package com.example.sweater.domain;

import lombok.Data;

@Data
public class RequestDomain {
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
