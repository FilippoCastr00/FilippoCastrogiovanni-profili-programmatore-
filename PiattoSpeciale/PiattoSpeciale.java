package PiattoSpeciale;

import java.util.ArrayList;

public class PiattoSpeciale {
    // Variabili final
        final String panino1;
        final String panino2;
        private int[] prezzoPane;
        
    // Variabili pubbliche
    public String ingrediente1;
    public String ingrediente2;
    public String ingrediente3;
    public ArrayList prezzoIngredienti = new ArrayList<Integer>();

    // Costruttore
    public PiattoSpeciale(String panino1, String panino2,int[] prezzoPane ,String ingrediente1, String ingrediente2, String ingrediente3,ArrayList prezzoIngredienti) {
        this.panino1 = panino1;
        this.panino2 = panino2;
        this.prezzoPane= prezzoPane;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
        this.prezzoIngredienti = prezzoIngredienti;
    }

    // Metodi per accedere alle variabili final
    public String getPanino1() {
        return panino1;
    }

    public String getPanino2() {
        return panino2;
    }
    public int[] getPrezzoPane(){
        return prezzoPane;
    }
    public ArrayList getPrezzoIngredienti(){
        
        return prezzoIngredienti;
    } 
    
}

