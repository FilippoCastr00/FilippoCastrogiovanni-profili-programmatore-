/**
 * 
 */
package dividi.et.impera;

/**
 * @author Filippo Castrogiovanni
 * @version 1.0
 */
public class DividiEtImpera {

	/**
	 * @param args sono gli argomenti del metodo main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeri [] = {1,2,3,4,5,6,7};  //array ordinato
		int scope = 5;   //questo è il numero che voglio trovare
		int indice = ricercaBinaria(numeri, scope); //variabile che conterrà l'indice restituito
		if (indice != -1) {
            System.out.println("numero: " + scope +" "+ "posizione: " +" "+ indice);
        } 
	}
	
	/**
	 * 
	 * @param numeri è un'array di interi ordinato
	 * @param scope è il numero che voglio cercare
	 * @since 1.0
	 * @return
	 * 
	 * Questo metodo consiste in un algoritmo che utilizza 3 indici (sx, dx, pM) per trovare un numero a scelta
	 * del Dev, sostanzialmente dopo aver trovato il pM lo confronta con lo scope, se il pM è uguale allo scope
	 * torno il pM, se è maggiore dello scope ripeto il controllo eliminando la parte dx, al contrario elimino
	 * la parte sinistra. Questo algoritmo inserito nel while permette di iterare fino a trovare lo scope.
	 * Se non dovesse trovare lo scope tornerà un valore negativo.
	 * 
	 */
	
	public static int ricercaBinaria(int numeri[], int scope) {
		int left = 0;
		int right = numeri.length - 1;
		
		while(left <= right) {
			int pM = (right + left)/2;
			// Se il pM è uguale allo scope, restituisco l'indice
            if (numeri[pM] == scope) {
                return pM;
            }
            // Ripeto il controllo, se il pM è maggiore del target, elimino la metà dx
            if (numeri[pM] > scope) {
                right = pM - 1;
            }else {
            	//elimino la parte sx
            	left = pM + 1;
            }
		}
		//se lo scope non viene trovato ritorno -1
		return -1;
		
	}

}
