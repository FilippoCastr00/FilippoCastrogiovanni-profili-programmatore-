package CalcoloAreaEAltezza;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**@author Filippo Castrogiovanni
 * @version 1.0
 * crea classe ClasseFile che implementa l'interfaccia e il metodo calcoloArea()
 * dell'interfaccia, si occupa di leggere un file di testo contenente
 * due numeri ( la base e l'altezza di un triangolo) e calcolarne l'area.
 */

public class ClasseFile implements CalcoloBaseEAltezzaInterface {
	//nome del file di testo
	String nomeTesto = "testo.txt";

	/**
	 *Il metodo calcoloArea() legge i dati dal file di testo,
	 *li interpreta come la base e l'altezza, e calcola l'area del triangolo.
	 */
	@Override
	public double calcoloArea() throws IOException {
		//Assicura che il file esista e contenga dati
		creaFile();
		//Lettura del file
		String linea;
		BufferedReader reader = new BufferedReader(new FileReader(nomeTesto));
		double [] baseEAltezza = new double[2];
		//crea contatore
		int i = 0;
		while( (linea = reader.readLine())!= null) {
			//Parsing dei dati come double
			baseEAltezza[i] = Double.parseDouble(linea);
			//aggiorna contatore
			i++;

			
		}
		//Calcolo dell'area e ritorno del valore
		return baseEAltezza[0] * baseEAltezza [1] /2;
	}

	/**
	 * 
	 *@throws IOException lancia un'eccezzione generica
	 *Il metodo `creaFile()` controlla se il file di testo esiste già. Se non esiste,
	 *ne crea uno nuovo con la base e l'altezza predefinite.
	 */
	public static void creaFile() throws IOException {
		
		File fileDiTesto = new File("testo.txt");
		//Se il file esiste, stampa un messaggio
		if(fileDiTesto.exists()) {
	    //Altrimenti, crea un nuovo file con base e altezza predefinite
			System.out.println("file esistente");
		}else {
			System.out.println("file non esistente");
			fileDiTesto.createNewFile();
			//è responsabile della creazione di un oggetto `BufferedWriter` che può essere utilizzato
			//per scrivere dati su un file di testo chiamato "test.txt". 
			BufferedWriter w = new BufferedWriter(new FileWriter("test.txt", true));
			//Base e altezza predefinite
			w.write("10\r\n20");
			w.close();
		}
		
	}
	
}
