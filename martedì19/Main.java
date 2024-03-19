package martedì19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Aggiungo libri
        biblioteca.aggiungiLibro("Il signore degli anelli", 5);
        biblioteca.aggiungiLibro("Metal Gear Solid", 3);
        biblioteca.aggiungiLibro("It", 10);
        biblioteca.aggiungiLibro("Eden", 0);
        biblioteca.aggiungiLibro("I Malavoglia", 15);

        int scelta;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Presta libro");
            System.out.println("2. Restituisci libro");
            System.out.println("3. Aggiungi libro");
            System.out.println("4. Elimina libro");
            System.out.println("5. Stampa libri disponibili");
            System.out.println("6. Esci");

            System.out.print("Scegli un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il titolo del libro che desideri prendere in prestito: ");
                    String titoloPrestato = scanner.nextLine();
                    biblioteca.prestaLibro(titoloPrestato);
                    break;
                case 2:
                    System.out.print("Inserisci il titolo del libro che desideri restituire: ");
                    String titoloRestituisci = scanner.nextLine();
                    biblioteca.restituisciLibro(titoloRestituisci);
                    break;
                case 3:
                    System.out.print("Inserisci il titolo del nuovo libro: ");
                    String titoloNuovoLibro = scanner.nextLine();
                    System.out.print("Inserisci il numero di copie disponibili: ");
                    int copieDisponibiliNuovoLibro = scanner.nextInt();
                    biblioteca.aggiungiLibro(titoloNuovoLibro, copieDisponibiliNuovoLibro);
                    break;
                case 4:
                    System.out.print("Inserisci il titolo del libro da eliminare: ");
                    String titoloLibroDaEliminare = scanner.nextLine();
                    biblioteca.rimuoviLibro(titoloLibroDaEliminare);
                    break;
                case 5:
                    biblioteca.stampaLibriDisponibili();
                    break;
                case 6:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        } while (scelta != 6);

        scanner.close();
    }
}

