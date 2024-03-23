package CalcoloAreaEAltezza;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws IOException, SQLException {
		//per l'array
		CalcoloBaseEAltezzaInterface interfaccia = new ClasseFile();
		Calcolo calcolo = new Calcolo(interfaccia);
		System.out.println(calcolo.calcoloArea());
		//per il file
		CalcoloBaseEAltezzaInterface classeFile = new CalcoloArea();
		Calcolo calcolo1 = new Calcolo(classeFile);
		System.out.println(calcolo1.calcoloArea());
		//per il database
		CalcoloBaseEAltezzaInterface daMySql = new calcolaDaMySql();
		Calcolo calcolo3 = new Calcolo(daMySql);
		System.out.println(calcolo3.calcoloArea());
						
	}
}
