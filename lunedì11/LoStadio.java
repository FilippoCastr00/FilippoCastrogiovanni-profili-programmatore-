package lunedì11;

import java.util.Random;


public class LoStadio {
    public static void main(String[] args) {
        // id iniziale
        int id = 0;
        // numero totale di persone
        int totalePersone = 0;
        Random random = new Random();
        int weekend = 0;
        
        // Simuliamo la presenza di personein 10 weekend
        do {
            int personePerWeekend = random.nextInt(100); // Genera un numero casuale di persone tra 1 e 100
            System.out.println("Weekend " + weekend + ": " + personePerWeekend + " persone");

            //permette la somma di persone totali per tutti i weekend
            totalePersone += personePerWeekend;
            weekend++; //contatore
        } while (weekend <= 10);
        
        // Stampiamo il risultato
        System.out.println("Numero totale di persone in 10 weekend: " + totalePersone);
    }
}


