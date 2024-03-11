package lunedì11;

import java.util.Random;
import java.util.Scanner;

public class LoStadio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero casuale di weekend da 0 a 10: ");
        int weekend = scanner.nextInt();

        int totalePersone = 0;
        int totaleIncasso = 0;

        // Simula la presenza di persone in 10 weekend
        while (weekend > 0) {
            int personeWeekend = random.nextInt(100) + 1; // Genera un numero casuale di persone tra 1 e 100
            totalePersone += personeWeekend;
            totaleIncasso += personeWeekend * 20; //prezzo del biglietto 20$
            weekend--;
        }

        // Menu delle opzioni
        System.out.println("Scegli un'opzione:");
        System.out.println("1. Minimo spettatori");
        System.out.println("2. Massimo spettatori");
        System.out.println("3. Massimo incasso");
        System.out.println("4. Minimo incasso");
        System.out.print("Scelta: ");
        int scelta = scanner.nextInt();

        // Calcola e stampa dei risultati in base alla scelta
        switch (scelta) {
            case 1:
                System.out.println("Minimo numero di spettatori: " + totalePersone);
                break;
            case 2:
                System.out.println("Massimo numero di spettatori: " + totalePersone);
                break;
            case 3:
                System.out.println("Massimo incasso: " + totaleIncasso + " euro");
                break;
            case 4:
                System.out.println("Minimo incasso: " + totaleIncasso + " euro");
                break;
            default:
                System.out.println("Scelta non valida.");
        }
    }
}

