package com.example.sweater.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "processed_data")
@Data
@ToString
public class PopulationGrowth {
    @Id
    @Column(name = "id")
    private Integer id;
    // Name of countries
    @Column(name = "country")
    private String country;
    // Year
    @Column(name = "yr")
    private Integer year;
    // Count of thr growth
    @Column(name = "cnt")
    private Float count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }
}
