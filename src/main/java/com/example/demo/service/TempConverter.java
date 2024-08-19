package com.example.demo.service;

public interface TempConverter {
    public Double CelToFeh(Double cel) throws Exception;
    public Double FehToCel(Double feh);
    public Double CelToKel(Double cel);
    public Double KelToCel(Double kel);
    public Double FehToKel(Double feh);
    public Double KelToFeh(Double kel) throws Exception;

}
