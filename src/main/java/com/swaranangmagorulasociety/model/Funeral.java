package com.swaranangmagorulasociety.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "funeral")
public class Funeral {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

//    @Column
//    private LocalDate dayOfBurial;

    @Column
    private String dateOfBurial;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member memberAffected;

    public Funeral(int id, Member memberAffected) {
        this.id = id;
        this.memberAffected = memberAffected;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // public LocalDate getDayOfBurial() {
//      return dayOfBurial;
//    }

//    public void setDayOfBurial(LocalDate dayOfBurial) {
//        this.dayOfBurial = dayOfBurial;
//    }


    public String getDateOfBurial() {
        return dateOfBurial;
    }

    public void setDateOfBurial(String dateOfBurial) {
        this.dateOfBurial = dateOfBurial;
    }

    public Member getMemberAffected() {
        return memberAffected;
    }

    public void setMemberAffected(Member memberAffected) {
        this.memberAffected = memberAffected;
    }
}

