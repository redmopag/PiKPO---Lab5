package com.example.sweater.repos;

import com.example.sweater.domain.DataFromDb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataFromDbRepo extends JpaRepository<DataFromDb, Integer> {

}
