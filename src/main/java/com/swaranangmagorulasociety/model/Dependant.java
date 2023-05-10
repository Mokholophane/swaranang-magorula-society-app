package com.swaranangmagorulasociety.model;

import javax.persistence.*;

@Entity
@Table(name = "dependant")
public class Dependant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dependant_id")
    private int id;

    @Column
    private String name;
    @Column
    private String surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
