package ereditarieta;

public class Persona {
    private String nome,cognome;

    public void setNome(String _nome,String _cognome){
        nome = _nome;
        cognome = _cognome;
        
    }
    public void printAll(){
        System.out.println(nome+ " "+ cognome);
    }
}
