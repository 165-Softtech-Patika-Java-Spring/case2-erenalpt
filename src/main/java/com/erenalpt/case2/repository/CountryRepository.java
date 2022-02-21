package com.erenalpt.case2.repository;

import com.erenalpt.case2.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
