package com.example.d0001_recycler_view;

public class NumberModel {
    String english;
    String kannada;
    String kannadaSymbol;
    int image;

    public NumberModel(String english, String kannada, String kannadaSymbol, int image) {
        this.english = english;
        this.kannada = kannada;
        this.kannadaSymbol = kannadaSymbol;
        this.image = image;
    }

    public String getEnglish() {
        return english;
    }

    public String getKannada() {
        return kannada;
    }

    public String getKannadaSymbol() {
        return kannadaSymbol;
    }

    public int getImage() {
        return image;
    }
}
