package com.example.sweater.repos;

import com.example.sweater.domain.PopulationGrowth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopulationGrowthRepo extends JpaRepository<PopulationGrowth, Integer> {

}