package com.erenalpt.case2.repository;

import com.erenalpt.case2.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository  extends JpaRepository<City, Long> {
}
