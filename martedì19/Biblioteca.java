package martedì19;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   private List<Libro> libri;
    //metodo che aggiunge libri all'arraylist
    public Biblioteca() {
        this.libri = new ArrayList<>();
    }
    //metodo che aggiunge un libro e le copie dello stesso scelto dall'utenet
    public void aggiungiLibro(String titolo, int copieDisponibili) {
        Libro libro = new Libro(titolo, copieDisponibili);
        libri.add(libro);
    }
    //metodo che rimuove un libro dall'arraylist in base al titolo
    public void rimuoviLibro(String titolo) {
        for (Libro libro : libri) {
            if (libro.getTitolo().equals(titolo)) {
                libri.remove(libro);
                return;
            }
        }
        System.out.println("Il libro specificato non è presente nella biblioteca.");
    }
    //metodo che cicla l'arraylist e ritorna il libro scelto dall'utente rimuovendo una copia dal contatore
    public void prestaLibro(String titolo) {
        for (Libro libro : libri) {
            if (libro.getTitolo().equals(titolo)) {
                libro.presta();
                return;
            }
        }
        System.out.println("Il libro specificato non è presente nella biblioteca.");
    }
    //metodo che cicla l'arraylist e aggiunge le copie scelte dall'utente all'arraylist
    public void restituisciLibro(String titolo) {
        for (Libro libro : libri) {
            if (libro.getTitolo().equals(titolo)) {
                libro.restituisci();
                return;
            }
        }
        System.out.println("Il libro specificato non è presente nella biblioteca.");
    }
    //metodo per stampare i libri disponibili in bibliotyeca
    public void stampaLibriDisponibili() {
        System.out.println("Libri disponibili nella biblioteca:");
        for (Libro libro : libri) {
            System.out.println(libro.getTitolo() + " - Copie disponibili: " + libro.getCopieDisponibili());
        }
    }

    
}
