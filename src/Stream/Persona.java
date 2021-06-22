package Stream;

public class Persona {
    private String nome,cognome;
    private int eta;

    public Persona(String _nome,String _cognome,int _eta){
        nome = _nome;
        cognome = _cognome;
        eta = _eta;
        
    }
    public int getEta(){
        return eta;
    }
    public String getNome(){
        return nome;
    }
    public void printAll(){
        System.out.println(nome+ " "+ cognome+ " "+eta);
    }
}