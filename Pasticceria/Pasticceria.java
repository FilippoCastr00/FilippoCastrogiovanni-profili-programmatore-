package Pasticceria;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pasticceria {
    public static void main(String[] args) {

        // Creazione degli ArrayList
        ArrayList<String> basi = new ArrayList<>();
        ArrayList<String> ripieni = new ArrayList<>();
        ArrayList<String> frutta = new ArrayList<>();
        ArrayList<String> decorazioni = new ArrayList<>();

        // Aggiunta di elementi agli ArrayList
        basi.add("Pan di spagna");
        basi.add("Pan di francia");
        basi.add("Pan di italia");

        ripieni.add("Crema gialla");
        ripieni.add("Creama nera");
        ripieni.add("Crema blu");

        frutta.add("Arancia");
        frutta.add("Fragole");
        frutta.add("Mango");

        decorazioni.add("Cbd");
        decorazioni.add("Funghi allucinogeni");
        decorazioni.add("Peperoncino mortale");

         // Stampare gli ArrayList
         System.out.println("Lista delle basi: " + basi);
         System.out.println("Lista dei ripieni: " + ripieni);
         System.out.println("Lista della frutta: " + frutta);
         System.out.println("Lista delle decorazioni: " + decorazioni);

        // Scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);

         // Chiedo all'utente di scegliere un elemento da ciascuna lista
         System.out.println("Scegli un elemento dalla lista delle basi (inserisci l'indice):");
         int indiceBasi = scanner.nextInt();
         System.out.println("Scegli un elemento dalla lista dei ripieni (inserisci l'indice):");
         int indiceRipieni = scanner.nextInt();
         System.out.println("Scegli un elemento dalla lista della frutta (inserisci l'indice):");
         int indiceFrutta = scanner.nextInt();
         System.out.println("Scegli un elemento dalla lista delle decorazioni (inserisci l'indice):");
         int indiceDecorazioni = scanner.nextInt();
 
         // Stampa il dolce completo
         System.out.println("Ecco il piatto completo:");
         System.out.println("Base: " + basi.get(indiceBasi));
         System.out.println("Ripieno: " + ripieni.get(indiceRipieni));
         System.out.println("Frutta: " + frutta.get(indiceFrutta));
         System.out.println("Decorazione: " + decorazioni.get(indiceDecorazioni));
 

        // Chiedo all'utente quale tipo di randomizzazione vuole
        System.out.println("Desideri ottenere ingredienti casuali da tutte le liste (1) o solo da due di esse (2)?");
        int sceltaRandomizzazione = scanner.nextInt();

        // Randomizzazione
        Random random = new Random();

        switch (sceltaRandomizzazione) {
            case 1:
                System.out.println("Ingrediente casuale dalla lista delle basi: " + basi.get(random.nextInt(basi.size())));
                System.out.println("Ingrediente casuale dalla lista dei ripieni: " + ripieni.get(random.nextInt(ripieni.size())));
                System.out.println("Ingrediente casuale dalla lista della frutta: " + frutta.get(random.nextInt(frutta.size())));
                System.out.println("Ingrediente casuale dalla lista delle decorazioni: " + decorazioni.get(random.nextInt(decorazioni.size())));
                break;
            case 2:
            ArrayList<ArrayList<String>> listSelector = new ArrayList<>();
            listSelector.add(basi);
            listSelector.add(ripieni);
            listSelector.add(frutta);
            listSelector.add(decorazioni);

            System.out.println("Scegli due liste da cui ottenere ingredienti casuali (inserisci gli indici da 0 a 3):");
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();

            ArrayList<String> selectedList1 = listSelector.get(index1);
            ArrayList<String> selectedList2 = listSelector.get(index2);

            System.out.println("Ingrediente casuale dalla lista " + index1 + ": " + selectedList1.get(random.nextInt(selectedList1.size())));
            System.out.println("Ingrediente casuale dalla lista " + index2 + ": " + selectedList2.get(random.nextInt(selectedList2.size())));

            for (int i = 0; i < listSelector.size(); i++) {
                if (i != index1 && i != index2) {
                    ArrayList<String> notSelectedList = listSelector.get(i);
                    System.out.println("Ingrediente scelto dalla lista " + i + ": " + notSelectedList.get(scanner.nextInt()));
                }
            }
            break;
        default:
            System.out.println("Scelta non valida.");
        }

    }
}


