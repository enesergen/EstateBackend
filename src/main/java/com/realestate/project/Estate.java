package com.realestate.project;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Estate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String title;
    @Column
    private String city;
    @Column
    private String town;
    @Column
    private String district;
    @Column
    private String state;
    @Column
    private String price;
}
