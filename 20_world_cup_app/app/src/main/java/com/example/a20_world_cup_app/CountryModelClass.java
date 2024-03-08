package com.example.a20_world_cup_app;

public class CountryModelClass {
    private String countryName;
    private String cupCount;
    private int flagImg;

    public CountryModelClass(String countryName, String cupCount, int flagImg) {
        this.countryName = countryName;
        this.cupCount = cupCount;
        this.flagImg = flagImg;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCupCount() {
        return cupCount;
    }

    public void setCupCount(String cupCount) {
        this.cupCount = cupCount;
    }

    public int getFlagImg() {
        return flagImg;
    }

    public void setFlagImg(int flagImg) {
        this.flagImg = flagImg;
    }


}
