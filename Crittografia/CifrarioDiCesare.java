public class CifrarioDiCesare {
    // Definizione del dizionario che include sia le lettere dell'alfabeto che i numeri da 0 a 9
    private static final String dizionario = "abcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String[] args) {
        // Verifica che siano stati forniti almeno tre argomenti da riga di comando
        if (args.length < 3) {
            System.out.println("Inserisci <messaggio> <shift> <0/1>"); // Elementi da passare in input
            return;
        }
        
        // Lettura del messaggio, dello spostamento e della modalità da riga di comando
        String messaggio = args[0].toLowerCase();
        int shift = Integer.parseInt(args[1]);
        int mod = Integer.parseInt(args[2]);
        String risultato = "";

        // Selezione del metodo di cifratura o decifratura in base alla modalità specificata
        if (mod == 0) {
            risultato = decripta(messaggio, shift);
        } else if (mod == 1) {
            risultato = cripta(messaggio, shift);
        } else {
            System.out.println("Scegli una modalità tra 0 e 1");
            return;
        }
        
        // Stampare il risultato
        System.out.println("Risultato: " + risultato);
    }

    // Metodo per decifrare il messaggio
    private static String decripta(String testo, int shift) {
        return trasforma(testo, -shift); // Chiamata al metodo trasforma con shift negativo per la decifratura
    }

    // Metodo per criptare il messaggio
    private static String cripta(String testo, int shift) {
        return trasforma(testo, shift); // Chiamata al metodo trasforma con shift positivo per la cifratura
    }

    // Metodo per trasformare il messaggio in base allo spostamento specificato
    public static String trasforma(String testo, int shift) {
        StringBuilder risultato = new StringBuilder();
        
        // Ciclo attraverso ogni carattere del messaggio
        for (char carattere : testo.toCharArray()) {
            int posizioneIniziale = dizionario.indexOf(carattere);
            // Verifica se il carattere è presente nel dizionario
            if (posizioneIniziale != -1) {
                // Calcola la nuova posizione del carattere nel dizionario con il corretto spostamento
                int posizioneTraslata = (dizionario.length() + posizioneIniziale + shift) % dizionario.length();
                // Aggiungi il carattere trasformato al risultato
                risultato.append(dizionario.charAt(posizioneTraslata));
            } else {
                // Se il carattere non è presente nel dizionario, aggiungilo al risultato senza trasformarlo
                risultato.append(carattere);
            }
        }
        
        // Restituisci il risultato come stringa
        return risultato.toString();
    }
}
