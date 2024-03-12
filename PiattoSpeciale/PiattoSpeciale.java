package PiattoSpeciale;

public class PiattoSpeciale {
    // Variabili final
        final String panino1;
        final String panino2;

    // Variabili pubbliche
    public String ingrediente1;
    public String ingrediente2;
    public String ingrediente3;

    // Costruttore
    public PiattoSpeciale(String panino1, String panino2, String ingrediente1, String ingrediente2, String ingrediente3) {
        this.panino1 = panino1;
        this.panino2 = panino2;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
    }

    // Metodi per accedere alle variabili final
    public String getPanino1() {
        return panino1;
    }

    public String getPanino2() {
        return panino2;
    }
    
}

