package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "partner")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @Column(name = "logo_name")
    private String logoName; // New field to store the name of the uploaded logo image

    // Constructors
    public Partner() {
    }

    public Partner(Long id, String name, String logoName) {
        this.id = id;
        this.name = name;
        this.logoName = logoName;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }
}