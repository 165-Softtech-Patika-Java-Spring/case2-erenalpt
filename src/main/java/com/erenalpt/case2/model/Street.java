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
@Table(name = "STREET")
public class Street {

    @Id
    @GeneratedValue
    private long id;

    private String street;
    private long neighborhoodID;
}
