package com.example.demo;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cleaning extends JBC {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @Range(min=1,max=5)
    private int strength;

    public Cleaning() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        strength = strength;
    }
}
