package FactoryMethod.Prova;
public class Delfino implements IAnimali {
    String typeAnimale;
    int numeroZampe;
    String verso;
    Delfino(){
        typeAnimale = "Acqua";
        numeroZampe = 0;
        verso = "iiiii";
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
