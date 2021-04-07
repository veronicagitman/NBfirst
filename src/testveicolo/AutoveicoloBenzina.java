package testveicolo;

import java.util.*;

public class AutoveicoloBenzina extends AutoveicoloTradizionale {
    
    public AutoveicoloBenzina(String marca, String modello, String targa, int anno, int potenza, int passeggeri) {
        super(marca, modello, targa, anno, potenza, passeggeri);
        super.alimentazione = "benzina";
    }

}