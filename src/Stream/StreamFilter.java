package Stream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
//tipo Predicate
//Predicate è un interfaccia funzionale, ovvero un'interfaccia che definsce un solo metodo

//Medoto Filter
// è un metodo Stream che prende come argomento una predicate(funzione che ritorna un boolean)
// e ritorna uno Stream costituito da tutti gli elementi che soddisfano la funzione booleana
// è una operazione intermedia

//Medoto Count
// operazione terminale , genera un valore forza l'operazione delle precedenti operazioni
public class StreamFilter {
    public static void main(String[] args) {
        List<String> nomi = List.of("Seby","Salvo","Francesco","Giusi","Seby");
        String prefix  = "Se";
        long c = nomi.stream()
                    .filter(s -> s.substring(0, prefix.length()).equals(prefix))
                    .count();
        System.out.println("numero di elementi che hanno come prefisso "+prefix+": "+c);
        long cc = nomi.stream()
                    .filter(s -> s.length() == 5)
                    .count();
                    System.out.println("numero di elementi che hanno lunghezza 5 : "+cc);
    

    //Medoto Reduce
    //prende un valore dello stesso tipo degli elementi dello stream,e un'espressione lambda che ha due valori in ingresso e ritorna un valore
    //reduce() si usa quando si vuole passare da un insieme di valori ad un singolo valore, per esempio per ottenere la somma
    //reduce(0,(accum,v)-> accum+v))
    // il primo elemento è il valore iniziale dell'operazione di riduzione ed è il risuiltato predefinito se il flusso è vuoto
    // il secondo valore è un spressione lambda che prende due parametri il in uno ci sarà il risultato, l'altro sarà un elemento dello stream
    List<Integer> numeri = List.of(1,2,3,4,5);
    int ccc =  numeri.stream()
        .reduce(0,(accum,v)->accum+v);
    System.out.println("somma di elementi positivi: "+ccc);

    List<String> lettere = Arrays.asList("a","b","c","d");
    String concatena = lettere.stream()
                            .reduce("",(acc,x)->acc+(x));
    System.out.println("concatenazione: "+concatena);
    

    //Metodo Map
    //
        

    }

}
