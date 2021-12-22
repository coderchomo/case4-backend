package com.example.practiceassignment.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="nation")
public class Nation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nationName;

}
