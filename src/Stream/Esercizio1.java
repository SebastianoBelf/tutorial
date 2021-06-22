package Stream;
import java.util.List;

//data una lista di stringhe 
//produrre una lista che contiene solo le stringhe che cominiano con un certo prefisso notoM;
// uasre sub string
public class Esercizio1{
    public static void main(String[] args) {
        List<String> list = List.of("author","auto","autocorrect","begin","big","bigger","biggish");
        //• of() è un metodo statico di List (da Java 9) che restituisce una lista non-modificabile contenente gli elementi passati
        //filter è un metodo Stream, prende come argomento un predicato, ritorna uno Stream costitutito da tutti gli elementi che soddisfano il predicato passato in unput
        
        String prefix = "au";
       /* list.stream()
            .filter(s->s.startsWith(prefix))
            .forEach(System.out::println);*/

        //usare substring
        list.stream()
            //.map(s -> s.substring(0,prefix.length())) cosi non funzionma scoprire il perche
            //.filter(p -> p.equals(prefix))
            .filter(s -> s.substring(0,prefix.length()).equals(prefix))
            .forEach(System.out::println);
    }
}