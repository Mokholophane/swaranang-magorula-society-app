package com.swaranangmagorulasociety.repository;

import com.swaranangmagorulasociety.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository <Member , Integer> {

    List<Member> findBySurname(String surname);
}
