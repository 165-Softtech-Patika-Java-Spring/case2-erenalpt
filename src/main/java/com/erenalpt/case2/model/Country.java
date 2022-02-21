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
@Table(name = "COUNTRY")
public class Country {
    @Id
    @GeneratedValue
    private long id;

    // Nullable??
    private String country;
}
