package com.erenalpt.case2.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ADRESS")
public class Adress {
    /*
    * Country
City
District
Neighborhood
Street
Door number
Apartment number
    * */


    @Id
    @GeneratedValue
    private long id;

    // Nullable??
    //countryId, cityId ??
    private String country;
    private String city;
    private String district;
    private String neighborhood;
    private String street;
    private String doorNumber;
    private String apartmentNumber;

}
