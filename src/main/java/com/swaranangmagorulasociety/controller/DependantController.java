package com.swaranangmagorulasociety.controller;

import com.swaranangmagorulasociety.model.Dependant;
import com.swaranangmagorulasociety.service.DependantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DependantController {
    @Autowired
    private DependantService dependantService;

    @PostMapping("/dependant")
    public int saveDependant(@RequestBody Dependant dependant){
        dependantService.addDependant(dependant);
        return dependant.getId();
    }

    @GetMapping("dependant")
    public List<Dependant> allDependants(){
        return dependantService.getAllDependants();
    }

}
