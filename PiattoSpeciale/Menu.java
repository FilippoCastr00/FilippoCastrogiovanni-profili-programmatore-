package PiattoSpeciale;

import java.util.Scanner;

public class Menu {
    // Metodo per stampare il menu con le variabili final
    public static void menuStatic(String panino1, String panino2, int prezzoPane1, int prezzoPane2) {
        System.out.println("---- Base pane obbligatoria ----");
        System.out.println("1. " + panino1 + " " + prezzoPane1+ " " +"euro" );
        System.out.println("2. " + panino2 + " " + prezzoPane2+" " +"euro");
        System.out.println("--------------");
    }
     // Metodo per stampare il menu con gli ingredienti pubblici
     public static void menuPublic(String ingrediente1, String ingrediente2, String ingrediente3,int prezzoIng1,int prezzoIng2,int prezzoIng3) {
        System.out.println("---- Ingredienti Disponibili ----");
        System.out.println("1. " + ingrediente1 + " " + prezzoIng1 +" " + "euro");
        System.out.println("2. " + ingrediente2 + " " + prezzoIng2 +" " + "euro");
        System.out.println("3. " + ingrediente3 + " " + prezzoIng3 +" " + "euro");
        System.out.println("-------------------------");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creo l'oggetto nuovoPiatto
        PiattoSpeciale nuovoPiatto = new PiattoSpeciale("Panino Semola", "Panino Cereali",5,7, "Prosciutto", "Salsiccia", "Mozzarella",6,7,8);
        //ciclo per vedere il menu panini
        while (true) {
            System.out.println("Vuoi vedere il menu panini? (si/no)");
            String risposta = scanner.nextLine().toLowerCase();
            if (risposta.equals("si")) {                              
                menuStatic(nuovoPiatto.getPanino1(), nuovoPiatto.getPanino2(), nuovoPiatto.getPrezzoPane1(), nuovoPiatto.getPrezzoPane2());
                System.out.println("Scegli uno: ");
                //inserimento manuale
                String sceltaPane = scanner.nextLine();
                if (sceltaPane.equals("Panino Semola")) {
                    System.out.println("Hai scelto base semola "); 
                    // aggiungere inserimento in array per il prezzo e ingredienti
                }else if (sceltaPane.equals("Panino Cereali")) {
                    System.out.println("Hai scelto base cereali ");
                }
                break;
            } else if (risposta.equals("no")) {
                break;
            } else {
                System.out.println("Risposta non valida. Inserisci 'si' o 'no'.");
            }
        }
        //ciclo per vedere il menu ingredienti
        while (true) {
            System.out.println("Vuoi vedere il menu con gli ingredienti? (si/no)");
            String risposta = scanner.nextLine().toLowerCase();
            
            if (risposta.equals("si")) {
                menuPublic(nuovoPiatto.ingrediente1, nuovoPiatto.ingrediente2, nuovoPiatto.ingrediente3,nuovoPiatto.prezzoIng1,nuovoPiatto.prezzoIng2,nuovoPiatto.prezzoIng3);
                System.out.println("Scegli inserendo da 1 a 3: ");
                int sceltaIngr = scanner.nextInt();
                //aggiungere inserimento indicizzato
                switch (sceltaIngr) {
                    case 1:
                           System.out.println("Hai scelto Prosciutto");
                        break;
                    case 2:
                           System.out.println("Hai scelto Salsiccia");
                        break;
                    case 3:
                           System.out.println("Hai scelto Mozzarella");           
                
                    default:
                        break;
                }
                break;
            } else if (risposta.equals("no")) {
                break;
            } else {
                System.out.println("Risposta non valida. Inserisci 'si' o 'no'.");
            }
        }
    }
      
}
