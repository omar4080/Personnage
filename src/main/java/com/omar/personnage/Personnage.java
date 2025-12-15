package com.omar.personnage;

public class Personnage {
    String orientation;
    Personnage(){
        this.orientation = "nord";
    }
    public String tourner(int fois){
        return orientation;
    }
}