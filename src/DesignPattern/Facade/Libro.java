package DesignPattern.Facade;

public class Libro {
    private String codice;
    private String titolo;
    private String autore;
    public Libro(String _codice,String _titolo,String _autore){
        codice = _codice;
        titolo = _titolo;
        autore = _autore;
    }
    public String getCodice(){
        return codice;
    }
    public String getTitolo(){
        return titolo;
    }
    public String getAutore(){
        return autore;
    }
    public void VisualizzaLibro(){
        System.out.println("Libro   codice: "+codice+"\t titolo: "+titolo+"\t autore: "+autore);
    }
}
