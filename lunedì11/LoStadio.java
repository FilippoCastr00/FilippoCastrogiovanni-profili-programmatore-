package lunedì11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LoStadio {
    static void menu(){
     System.out.println("Scegli un'opzione:");
     System.out.println("1. Minimo numero di spettatori");
     System.out.println("2. Massimo numero di spettatori");
     System.out.println("3. Massimo incasso");
     System.out.println("4. Minimo incasso");
     System.out.print("Scelta: ");
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero casuale di weekend da 0 a 10: ");
        int numeroWeekend = scanner.nextInt();
        menu();

        ArrayList<Integer> sabato = new ArrayList<>();
        ArrayList<Integer> domenica = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        // Simulo la presenza di persone sia di sabato che di domenica
        int counter = 0;
        while (counter < numeroWeekend) {
            int personeSabato = rand.nextInt(100) + 1; // Genera un numero casuale di persone per sabato tra 1 e 100
            int personeDomenica = rand.nextInt(100) + 1; // Genera un numero casuale di persone per domenica tra 1 e 100
            
            // Popoliamo gli ArrayList
            sabato.add(personeSabato);
            domenica.add(personeDomenica);
            id.add(counter + 1);
            counter++;
        }
      
        int scelta = scanner.nextInt();
        // Calcolo e stampo dei risultati in base alla scelta dell'utente
        switch (scelta) {
            case 1:
                int minSpettatori = Integer.MIN_VALUE;
                for (int spettatori : sabato) {
                    if (spettatori < minSpettatori) {
                        minSpettatori = spettatori;
                    }
                }
                System.out.println("Minimo numero di spettatori: " + minSpettatori);
                break;
                
            case 2:
                int maxSpettatori = Integer.MAX_VALUE;
                for (int spettatori : sabato) {
                    if (spettatori > maxSpettatori) {
                        maxSpettatori = spettatori;
                    }
                }
                System.out.println("Massimo numero di spettatori: " + maxSpettatori);
                break;
            case 3:
                int maxIncasso = 0;
                for (int i = 0; i < sabato.size(); i++) {
                    int incasso = (sabato.get(i) + domenica.get(i)) * 10; // Assumiamo che il prezzo del biglietto sia 10 euro
                    if (incasso > maxIncasso) {
                        maxIncasso = incasso;
                    }
                }
                System.out.println("Massimo incasso: " + maxIncasso + " euro");
                break;
            case 4:
                int minIncasso = Integer.MAX_VALUE;
                for (int i = 0; i < sabato.size(); i++) {
                    int incasso = (sabato.get(i) + domenica.get(i)) * 10; // Assumiamo che il prezzo del biglietto sia 10 euro
                    if (incasso < minIncasso) {
                        minIncasso = incasso;
                    }
                }
                System.out.println("Minimo incasso: " + minIncasso + " euro");
                break;
            default:
                System.out.println("Scelta non valida.");
        }
    }
}
