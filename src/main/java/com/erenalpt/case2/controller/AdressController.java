package com.erenalpt.case2.controller;

import com.erenalpt.case2.model.*;
import com.erenalpt.case2.service.AdressDetailService;
import com.erenalpt.case2.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AdressController {

    @Autowired
    private AdressService adressService;
    private AdressDetailService adressDetailService;

    @RequestMapping("/city")
    public City citySave(){
        City city = new City();
        city = adressDetailService.save(city);
        return city;
    }

    @RequestMapping("/country")
    public Country countrySave(){
        Country country = new Country();
        country = adressDetailService.save(country);
        return country;
    }

    @RequestMapping("/district")
    public District districtSave(){
        District district = new District();
        district = adressDetailService.save(district);
        return district;
    }

    @RequestMapping("/neighborhood")
    public Neighborhood neighborhoodSave(){
        Neighborhood neighborhood = new Neighborhood();
        neighborhood = adressDetailService.save(neighborhood);
        return neighborhood;
    }

    @RequestMapping("/street")
    public Street streetSave(){
        Street street = new Street();
        street = adressDetailService.save(street);
        return street;
    }

    @PostMapping
    public Adress save(){

        Adress adress = new Adress();

        adress = adressService.save(adress);
        return adress;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        adressService.deleteById(id);
        return ResponseEntity.ok(Void.TYPE);
    }

}
