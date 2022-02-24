package com.example.lotto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LottoController {

    @GetMapping(value = "/api/getname")
    public String getname(){
        return "Armmy Is Normal Test Test";
    }

}
