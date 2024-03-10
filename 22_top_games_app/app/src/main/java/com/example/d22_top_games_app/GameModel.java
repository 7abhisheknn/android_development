package com.example.d22_top_games_app;

public class GameModel {
    private String name;
    int image;

    public GameModel(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
