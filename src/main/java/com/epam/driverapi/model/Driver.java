package com.epam.driverapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Evgeny Borisov
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int age;
}
