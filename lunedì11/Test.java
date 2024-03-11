package lunedì11;

import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        //creo variabili e oggetti
        Scanner scanner = new Scanner(System.in);
        int x = 4;
        int y = 2;
        int counter = 0;
        int scelta = 0;

        //ciclo for non inizializzato per visualizzazione menu
        for (; scelta != 5; ) {
            System.out.println("Menu:");
            System.out.println("1. Addizione");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            
            //rottura del ciclo
            if (scelta == 5) {
                break;
            }
            //ciclo con risultati giusti 
            if (scelta >= 1 && scelta <= 4) {
                int risultatoCorretto = 0;       //queste variabili mi servono per visualizzare piu' operazioni
                int risultatoSbagliato = 0;
                for (int i = 1; i <= 4; i++) {
                    switch (i) {
                        case 1:
                            if (scelta == i) {
                                risultatoCorretto = x + y;
                                break;
                            }
                        case 2:
                            if (scelta == i) {
                                risultatoCorretto = x - y;
                                break;
                            }
                        case 3:
                            if (scelta == i) {
                                risultatoCorretto = x * y;
                                break;
                            }
                        case 4:
                            if (scelta == i) {
                                risultatoCorretto = x / y;
                                break;
                            }
                    }
                }
                // Risultato sbagliato generato casualmentee
                risultatoSbagliato =  (int)(Math.random() * 101); 
                System.out.println("Risultato corretto: " + risultatoCorretto);
                System.out.println("Risultato sbagliato: " + risultatoSbagliato);
                counter++;
            } 
        }

        System.out.println("Hai effettuato " + counter + " operazioni.");
    }
}
