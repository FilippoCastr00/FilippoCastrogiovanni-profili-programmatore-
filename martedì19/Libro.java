package martedì19;

public class Libro {
    private String titolo;
    private int copieDisponibili;
    private int copieInPrestito;

    public Libro(String titolo, int copieDisponibili) {
        this.titolo = titolo;
        this.copieDisponibili = copieDisponibili;
        this.copieInPrestito = 0;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getCopieDisponibili() {
        return copieDisponibili;
    }

    public int getCopieInPrestito() {
        return copieInPrestito;
    }

    public void presta() {
        if (copieDisponibili > 0) {
            copieDisponibili--;
            copieInPrestito++;
        } else {
            System.out.println("Non ci sono copie disponibili per questo libro.");
        }
    }

    public void restituisci() {
        if (copieInPrestito > 0) {
            copieDisponibili++;
            copieInPrestito--;
        } else {
            System.out.println("Non hai preso in prestito una copia di questo libro.");
        }
    }
}
