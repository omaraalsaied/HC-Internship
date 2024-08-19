package com.example.demo.controller;


import com.example.demo.service.TempConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class TempConverterController {
    @Autowired
    private TempConverter tempConverter;


    @GetMapping("/CelToFeh")
    public Double CelToFeh(@RequestParam Double cel)
    {
        return tempConverter.CelToFeh(cel);
    }

    @GetMapping("/FehToCel")
    public Double FehToCel(@RequestParam Double feh)
    {
        return tempConverter.FehToCel(feh);
    }

    @GetMapping("/CelToKel")
    public Double CelToKel(@RequestParam Double cel)
    {
        return tempConverter.CelToKel(cel);
    }

    @GetMapping("/KelToCel")
    public Double KelToCel(@RequestParam Double kel)
    {
        return tempConverter.KelToCel(kel);
    }

    @GetMapping("/KelToFeh")
    public Double KelToFeh(@RequestParam Double kel)
    {
        return tempConverter.KelToFeh(kel);
    }

    @GetMapping("/FehToKel")
    public Double FehToKel(@RequestParam Double feh)
    {
        return tempConverter.FehToKel(feh);
    }

}
