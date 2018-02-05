package com.example.demo;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Snacks extends JBC {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @Range(min = 1,max = 5)
    private int crunchy;

    public Snacks() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCrunchy() {
        return crunchy;
    }

    public void setCrunchy(int crunchy) {
        this.crunchy = crunchy;
    }
}
