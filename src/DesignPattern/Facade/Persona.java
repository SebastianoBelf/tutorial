package DesignPattern.Facade;

public class Persona {
    private String nome;
    private String cognome;
    public Persona(String _nome,String _cognome){
        nome = _nome;
        cognome = _cognome;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    
}
