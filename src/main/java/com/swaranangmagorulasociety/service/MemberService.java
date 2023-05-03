package com.swaranangmagorulasociety.service;

import com.swaranangmagorulasociety.model.Dependant;
import com.swaranangmagorulasociety.model.Member;
import com.swaranangmagorulasociety.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public List<Member> getMemberBySurname(String surname) {
        return memberRepository.findBySurname(surname);
    }

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    public Member updateMember(Member member){
        return memberRepository.save(member);
    }


}
