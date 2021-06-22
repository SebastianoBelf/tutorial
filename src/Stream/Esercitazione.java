package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Esercitazione {
    public static void main(String[] args){
        
        List< Persona > listPersone = Arrays.asList(new Persona("a","b",1),new Persona("c","d",2),new Persona("e","f",3));
        Integer MaxEta = listPersone.stream()
                                .map(Persona::getEta)
                                .max(Comparator.naturalOrder())
                                .get();

        Optional<Persona> eta = listPersone.stream()
                            .max(Comparator.comparing(Persona::getEta));
        if(eta.isPresent()){
            System.out.println(eta);
        }
        String concatenaNomi = listPersone.stream()
                                            .map(Persona::getNome)
                                            .reduce("", (acc,v) ->acc+" "+v );
        System.out.println("Nomi concatenati: "+concatenaNomi);
        int e = listPersone.stream()
                    .map(Persona::getEta)
                    .sorted(Comparator.reverseOrder())
                    .findFirst().get();
        System.out.println("after sorted first eta: "+e);
        System.out.println("Iterate genera stream");
        Stream.iterate(2, n -> n*2)
                .limit(10)
                .forEach(x->System.out.print(x+" "));
        Stream.iterate("*", c -> c+"*")
                .limit(10)
                .filter(c -> c.length()%2 == 0)
                .forEach(System.out::println);
    }
}
