package FactoryMethod.Prova;

public class SelectAnimal {
    final static String TERRA = "Terra";
    final static String ACQUA = "Acqua";
    
    public static IAnimali getAnimale(String typeAnimale){
        if(typeAnimale.equals(TERRA)){
            return new Cane();
        }
        if(typeAnimale.equals(ACQUA)){
            return new Delfino();
        }
        return null;
    }
}
