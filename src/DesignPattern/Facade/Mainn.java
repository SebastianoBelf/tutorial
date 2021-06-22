package DesignPattern.Facade;

public class Mainn {
    public static void main(String[] args){

        Libro l1 = new Libro("0xk3j4","ciao", "_autore");
        Libro l2 = new Libro("0xk3j4","ciao1", "_auto1re");
        Libro l3 = new Libro("0xk3j4","ciao2", "_aut1ore");
        Libro l4 = new Libro("0xkd3j4","ciao3", "_auto2re");

        Biblioteca.InserisciLibroInBiblioteca(l1);
        Biblioteca.InserisciLibroInBiblioteca(l2);
        Biblioteca.InserisciLibroInBiblioteca(l3);
        Biblioteca.InserisciLibroInBiblioteca(l4);

        Biblioteca.VisualizzaLibriInBiblioteca();

        Registro.richiestaPrestitoLibro("Seby", "ciao");
        Registro.richiestaPrestitoLibro("Seby", "ciao1");
        Registro.richiestaPrestitoLibro("Seby", "ciao2");
        Registro.richiestaPrestitoLibro("Salvo", "ciao2");
        Registro.VisualizzaRegistro();

        
    }
}
