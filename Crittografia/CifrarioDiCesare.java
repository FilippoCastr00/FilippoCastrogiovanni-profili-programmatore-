public class CifrarioDiCesare{
    private static final String dizionario = "abcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("inserisci <messaggio> <shift> <0/1>"); //elementi da passare in input
            return;
        }
        String messaggio = args[0].toLowerCase();
        int shift = Integer.parseInt(args[1]);
        int mod = Integer.parseInt(args[2]);
        String risultato = "";

        if (mod == 0) {
            risultato = decripta(messaggio,shift);
        }else if (mod == 1){
            risultato = cripta(messaggio,shift);
        }else{
            System.out.println("Scegli una modalità tra 0 e 1");
            return;
        }
        System.out.println("Risultato:" + risultato);
    }
    private static String decripta(String testo,int shift){
        return trasforma(testo,-shift);
    }
    private static String cripta(String testo,int shift){
        return trasforma(testo,shift);
    }
    public static String trasforma(String testo, int shift){
        StringBuilder risultato = new StringBuilder();
        for (char carattere:testo.toCharArray()){
            if (dizionario.indexOf(carattere) !=1) {
                int posizioneIniziale = dizionario.indexOf(carattere);
                int posizioneTraslata = (dizionario.length() + posizioneIniziale + shift) % dizionario.length();
                risultato.append(dizionario.charAt(posizioneTraslata));
            }else{
                risultato.append(carattere);
            }
        }
        return risultato.toString();
    }
}