package FactoryMethod.Prova;

public class Cane implements IAnimali{
    String typeAnimale;
    int numeroZampe;
    String verso;
    Cane(){
        typeAnimale = "Terra";
        numeroZampe = 4;
        verso = "bau";
    }
    public String getTypeAnimale(){
        return typeAnimale;
    }
    public int getNumeroZampe(){
        return numeroZampe;
    }
    public String getVerso(){
        return verso;
    }
    
}
