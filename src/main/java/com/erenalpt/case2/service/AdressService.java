package com.erenalpt.case2.service;

import com.erenalpt.case2.model.Adress;
import com.erenalpt.case2.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AdressService {

    @Autowired
    private AdressRepository adressRepository;

    public Adress save(Adress adress){
        return adressRepository.save(adress);
    }


    private static HashMap<Integer, Adress> adressHashMap = getAdressHashMap();

    public static HashMap<Integer, Adress> getAdressHashMap() {
        return adressHashMap;
    }

    public void deleteById(Long id) {
        adressRepository.deleteById(id);
    }
}
