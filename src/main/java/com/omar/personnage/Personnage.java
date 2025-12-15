package com.omar.personnage;

public class Personnage {
    String orientation;
    Personnage(){

        this.orientation = "nord";
    }
    public String tourner(int fois){
        if(fois==1){
            orientation="est";
        }else if(fois==2){
            orientation="sud";
        }
        return orientation;
    }
}