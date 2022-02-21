package com.erenalpt.case2.service;

import com.erenalpt.case2.model.*;
import com.erenalpt.case2.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressDetailService {

    @Autowired
    private CityRepository cityRepository;
    private CountryRepository countryRepository;
    private DistrictRepository districtRepository;
    private NeighborhoodRepository neighborhoodRepository;
    private StreetRepository streetRepository;

    // Mantık hatası var.

    public City save(City city){
        return cityRepository.save(city);
    }

    public Country save(Country country){
        return countryRepository.save(country);
    }

    public District save(District district){
        return districtRepository.save(district);
    }

    public Neighborhood save(Neighborhood neighborhood){
        return neighborhoodRepository.save(neighborhood);
    }

    public Street save(Street street){
        return streetRepository.save(street);
    }
}
