package LeggereFile;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;


public class Pamanenti {
    private  List<String> importi = new ArrayList<>();
    private float totale;
    private float massimo;

    public float leggiFile(String nomeCartella,String nomeFile ) throws IOException{
        LineNumberReader f = new LineNumberReader(new FileReader(new File(nomeCartella,nomeFile)));
        //LineNumberReader numbero righe nel file
        //costruttore della classe LineNumberRider ha bisogno dell'istanza FileReader a sua volta prende un istanza di file
        //file in java è una rappresnetazione del file, passo il percorso e il nome del file (informazione sul file ma non lo legge)
        //per leggere il file ho bisogno di un fileReader che prendo in ingresso un file e fornisce metodi per leggere il file carattere per carattere ma non è efficiente
        // quindi passo tutto al lineFileReader per leggere linea per linea
        String riga;
        while(true){
             riga = f.readLine(); // legga la riga del file
            if(null == riga) break;
            inserisci(riga);
        }
        f.close();
        return totale;
        
    }
    public void inserisci(String riga){
        if(!importi.contains(riga)) 
            importi.add(riga);
        
    }
    public void calcolaSomma(){
        totale = 0;
        for(String v : importi){
            totale += Float.parseFloat(v);
        }
    }
    public void calcolaMassimo(){
        massimo = 0;
        for(String v: importi){
            if(massimo < Float.parseFloat(v)) 
                massimo = Float.parseFloat(v);
        }
    }
    public void svuota(){
        importi = new ArrayList<>();
        totale = massimo = 0;
    }
    public float getMassimo(){
        return massimo;
    }
    public float getTotale(){
        return totale;
    }
    public static void main(String[] args) throws Exception { // medoto main punto di avvio deve essere public stativ void prende in ingresso un array di stringhe
        Pamanenti app  =new Pamanenti();
        try{
        app.leggiFile("src/LeggereFile", "AppFile.txt");
        }catch (IOException E){}
        app.calcolaMassimo();
        app.calcolaSomma();
        System.out.println(app.getMassimo());
        System.out.println(app.getTotale());    }
}
