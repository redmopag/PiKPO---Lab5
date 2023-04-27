package com.example.sweater.repos;

import com.example.sweater.domain.PopulationGrowth;
import com.example.sweater.services.help_class.GrowthInCountry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PopulationGrowthRepo extends JpaRepository<PopulationGrowth, Integer> {
    List<PopulationGrowth> findByCountry(String country);
}