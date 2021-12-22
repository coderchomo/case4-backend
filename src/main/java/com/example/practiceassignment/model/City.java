package com.example.practiceassignment.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;
    private double cityArea;
    private double cityPopulation;
    private double cityGDP;
    private String description;

    @ManyToOne
    @JoinColumn(name="nation_id")
    private Nation nation;
}
