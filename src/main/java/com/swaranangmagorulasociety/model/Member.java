package com.swaranangmagorulasociety.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Entity
@Table(name = "member")
public class Member{
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int memberId;

    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;

    @Column
    private  String fee;

    @Autowired
    @JoinTable(name = "dependant")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Dependant> dependants;


//    @Column
//    private LocalDate startDate = LocalDate.now();
//    @Column
//    private LocalDate endDate = LocalDate.MAX;


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public List<Dependant> getDependants() {
        return dependants;
    }

    public void setDependants(List<Dependant> dependants) {
        this.dependants = dependants;
    }

    //    public LocalDate getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(LocalDate startDate) {
//        this.startDate = startDate;
//    }
//
//    public LocalDate getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(LocalDate endDate) {
//        this.endDate = endDate;
//    }
}
