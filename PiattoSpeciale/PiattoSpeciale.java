package PiattoSpeciale;

import java.util.ArrayList;

public class PiattoSpeciale {
    // Variabili final
    private final String panino1;
    private final String panino2;
    private final int prezzoPane1;
    private final int prezzoPane2;


    // Variabili pubbliche
    public String ingrediente1;
    public String ingrediente2;
    public String ingrediente3;
    public int prezzoIng1;
    public int prezzoIng2;
    public int prezzoIng3;


    // Costruttore
    public PiattoSpeciale(String panino1, String panino2,int prezzoPane1,int prezzoPane2, String ingrediente1, String ingrediente2, String ingrediente3,int prezzoIng1,int prezzoIng2,int prezzoIng3) {
        this.panino1 = panino1;
        this.panino2 = panino2;
        this.prezzoPane1 = prezzoPane1;
        this.prezzoPane2 = prezzoPane2;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
        this.prezzoIng1 = prezzoIng1;
        this.prezzoIng2 = prezzoIng2;
        this.prezzoIng3 = prezzoIng3;

    }

    // Metodo per ottenere il nome del primo panino
    public String getPanino1() {
        return panino1;
    }

    // Metodo per ottenere il nome del secondo panino
    public String getPanino2() {
        return panino2;
    }
    public int getPrezzoPane1(){
        return prezzoPane1;
    }
    public int getPrezzoPane2(){
        return prezzoPane2;
    }

    // Metodo per stampare lo stato dell'oggetto
    public void printStatus() {
        System.out.println("Panino 1: " + panino1);
        System.out.println("Panino 2: " + panino2);
        System.out.println("Ingrediente 1: " + ingrediente1);
        System.out.println("Ingrediente 2: " + ingrediente2);
        System.out.println("Ingrediente 3: " + ingrediente3);
    }
   
    // Metodo main per testare la classe
    public static void main(String[] args) {
        PiattoSpeciale panini = new PiattoSpeciale("Panino Semola", "Panino Cereali",5,7, "Prosciutto", "Salsiccia", "Mozzarella",6,8,7);
        panini.printStatus();
    }
}
    


