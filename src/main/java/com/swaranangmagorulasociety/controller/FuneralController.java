package com.swaranangmagorulasociety.controller;

import com.swaranangmagorulasociety.model.Funeral;
import com.swaranangmagorulasociety.service.FuneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuneralController {
    @Autowired
    private FuneralService funeralService;

    @PostMapping("/funeral")
    public Funeral addFuneral(@RequestBody Funeral funeral){
        return funeralService.addFuneral(funeral);
    }

    @GetMapping("/funeral")
    public List<Funeral> getFunerals(){
        return funeralService.getFuneral();
    }
}
