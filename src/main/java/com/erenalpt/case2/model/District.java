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
@Table(name = "DISTRICT")
public class District {

    @Id
    @GeneratedValue
    private long id;

    private String district;
    private long cityID;
}
