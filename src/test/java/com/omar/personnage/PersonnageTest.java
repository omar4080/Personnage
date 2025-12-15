package com.omar.personnage;
import org.junit.jupiter.api.Test;           // Pour marquer les méthodes de test
import static org.junit.jupiter.api.Assertions.*;
public class PersonnageTest {
    @Test
    public void doit_retourner_est_lorsquoi_fois_est_1(){
        Personnage p= new Personnage();
        String place = p.tourner(1);
        assertEquals("est",place,"doit retourner est");
    }
    @Test
    public void doit_retourner_sud_lorsquoi_fois_est_2(){
        Personnage p= new Personnage();
        String place = p.tourner(2);
        assertEquals("sud",place,"doit retourner sud");
    }
    @Test
    public void doit_retourner_ouest_lorsquoi_fois_est_3(){
        Personnage p= new Personnage();
        String place = p.tourner(3);
        assertEquals("ouest",place,"doit retourner ouest");
    }
    @Test
    public void doit_retourner_ouest_lorsquoi_fois_est_4(){
        Personnage p= new Personnage();
        String place = p.tourner(4);
        assertEquals("nord",place,"doit retourner nord");
    }

}
