package com.omar.personnage;

public class Personnage {
    String orientation="nord";
    public String tourner(int fois){
        if(fois==1){
            orientation="est";
        }else if(fois==2){
            orientation="sud";
        } else if (fois==3) {
            orientation="ouest";
        }
        return orientation;
    }
}