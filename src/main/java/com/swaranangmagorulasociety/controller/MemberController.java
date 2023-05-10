package com.swaranangmagorulasociety.controller;

import com.swaranangmagorulasociety.model.Dependant;
import com.swaranangmagorulasociety.model.Member;
import com.swaranangmagorulasociety.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/member")
    public Member saveMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/member/surname/{surname}")
    public List<Member> getMemberBySurname(@PathVariable("surname") String surname) {
        return memberService.getMemberBySurname(surname);
    }

    @PutMapping("/member")
    public Member updateMember(@RequestBody Member member) {
        memberService.updateMember(member);
        return member;
    }

//    @PostMapping("/memberWithDependants")
//    public void saveMemberWithDependants(@RequestBody Member member, @RequestBody List<Dependant>dependants ){
//         memberService.addMemberWithDependants(member,dependants);
//
//    }
}
