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
@Table(name = "NEIGHBORHOOD")
public class Neighborhood {
    @Id
    @GeneratedValue
    private long id;

    private String neighborhood;
    private long districtID;

}
