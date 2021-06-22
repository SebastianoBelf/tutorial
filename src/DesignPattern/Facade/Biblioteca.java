package DesignPattern.Facade;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private static  List < Libro > Libri = new ArrayList<>();

    public static Libro getLibroFromTitolo(String titolo){
        return Libri.stream()
                .filter(s ->s.getTitolo().equals(titolo))
                .findFirst().get();          
    }
    public static void InserisciLibroInBiblioteca(Libro libro){
        Libri.add(libro);
    }
    public static void VisualizzaLibriInBiblioteca(){
        System.out.println("Libri in biblioteca");
        Libri.forEach(x->x.VisualizzaLibro());
        
    }
}
