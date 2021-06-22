package FactoryMethod;

public class Esame {
    private String materia;
    private int voto;
    
    public Esame(String _materia,int _voto){
        materia = _materia;
        voto = _voto;
    }
    public String getMat(){
        return materia;
    }
    public int getVoto(){
        return voto;
    }

}
