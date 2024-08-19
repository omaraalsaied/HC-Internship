package com.example.demo.service.impl;

import com.example.demo.service.TempConverter;
import org.springframework.stereotype.Service;

@Service
public class TempConverterImpl implements TempConverter {
    @Override
    public Double CelToFeh(Double cel) {
        return (cel * 9/5) + 32;
    }

    @Override
    public Double FehToCel(Double feh) {
        return (feh - 32) * 5/9;
    }

    @Override
    public Double CelToKel(Double cel) {
        return cel + 273.15;
    }

    @Override
    public Double KelToCel(Double kel) {
        return kel - 273.15;
    }

    @Override
    public Double FehToKel(Double feh) {
        return CelToKel(FehToCel(feh));
    }

    @Override
    public Double KelToFeh(Double kel) {
        return CelToFeh(CelToKel(kel));
    }
}
