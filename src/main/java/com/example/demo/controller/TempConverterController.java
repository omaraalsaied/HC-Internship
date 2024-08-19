package com.example.demo.controller;


import com.example.demo.service.TempConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class TempConverterController {
    @Autowired
    private TempConverter tempConverter;


    @GetMapping("/CelToFeh")
    public ResponseEntity<?> CelToFeh(@RequestParam(required = false) String value) throws Exception {
        if(value == null)
        {
            return ResponseEntity.badRequest().body("Request is missing `value` parameter");
        }
        try {
            Double CelVal = Double.parseDouble(value);
            double feh = tempConverter.CelToFeh(CelVal);
            return ResponseEntity.ok(feh);

        }catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/FehToCel")
    public Double FehToCel(@RequestParam(required = true) Double value)
    {
        return tempConverter.FehToCel(value);
    }

    @GetMapping("/CelToKel")
    public Double CelToKel(@RequestParam(required = true) Double value)
    {
        return tempConverter.CelToKel(value);
    }

    @GetMapping("/KelToCel")
    public Double KelToCel(@RequestParam(required = true) Double value)
    {
        return tempConverter.KelToCel(value);
    }

    @GetMapping("/KelToFeh")
    public Double KelToFeh(@RequestParam(required = true) Double value) throws Exception {
        return tempConverter.KelToFeh(value);
    }

    @GetMapping("/FehToKel")
    public Double FehToKel(@RequestParam(required = true) Double value)
    {
        return tempConverter.FehToKel(value);
    }

}
