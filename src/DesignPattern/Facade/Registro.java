package DesignPattern.Facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Registro {
    private static Map<String,List< Libro >> registroPrestito = new HashMap<>();

    public static void richiestaPrestitoLibro(String nome,String titolo){
        Libro libro = Biblioteca.getLibroFromTitolo(titolo);
        if(registroPrestito.containsKey(nome)){
            registroPrestito.get(nome).add(libro);
        }else{
            List<Libro> libri = new ArrayList<>();
            libri.add(libro);
            registroPrestito.put(nome,libri);
        }
    }
    public static void VisualizzaRegistro(){
        System.out.println("Registro");
        registroPrestito.forEach((Nome,Libri)->stampaRegistro(Nome,Libri));
    }
    private static void stampaRegistro(String nome,List<Libro> libri){
            System.out.println("Nome: "+nome);
            libri.forEach(x->x.VisualizzaLibro());
    }   
}
