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
}
