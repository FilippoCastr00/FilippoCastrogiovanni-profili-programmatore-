package PiattoSpeciale;

import java.util.Scanner;

public class Menu {
    // Metodo per stampare il menu con le variabili final
    public static void menuStatic(String panino1, String panino2) {
        System.out.println("---- Menu ----");
        System.out.println("1. " + panino1);
        System.out.println("2. " + panino2);
        System.out.println("--------------");
    }
     // Metodo per stampare il menu con gli ingredienti pubblici
     public static void menuPublic(String ingrediente1, String ingrediente2, String ingrediente3) {
        System.out.println("---- Ingredienti Disponibili ----");
        System.out.println("1. " + ingrediente1);
        System.out.println("2. " + ingrediente2);
        System.out.println("3. " + ingrediente3);
        System.out.println("-------------------------");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PiattoSpeciale nuovoPiatto = new PiattoSpeciale("Semola", "Cereali", null, null, null);
        while (true) {
            System.out.println("Vuoi vedere il menu panini? (si/no)");
            String risposta = scanner.nextLine().toLowerCase();
            if (risposta.equals("si")) {
                menuStatic(nuovoPiatto.getPanino1(), nuovoPiatto.getPanino2());
                break;
            } else if (risposta.equals("no")) {
                break;
            } else {
                System.out.println("Risposta non valida. Inserisci 'si' o 'no'.");
            }
        }

        while (true) {
            System.out.println("Vuoi vedere il menu con gli ingredienti? (si/no)");
            String risposta = scanner.nextLine().toLowerCase();

            if (risposta.equals("si")) {
                menuPublic(nuovoPiatto.ingrediente1, nuovoPiatto.ingrediente2, nuovoPiatto.ingrediente3);
                break;
            } else if (risposta.equals("no")) {
                break;
            } else {
                System.out.println("Risposta non valida. Inserisci 'si' o 'no'.");
            }
        }
    }
      
}
