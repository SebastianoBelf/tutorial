package FactoryMethod.Prova;
public class Main {
    final static String TERRA = "Terra";
        final static String ACQUA = "Acqua";
    public static void main(String[] args) {
        
        IAnimali a = SelectAnimal.getAnimale(ACQUA);
        System.out.println(a.getTypeAnimale());
        System.out.println(a.getNumeroZampe());
        System.out.println(a.getVerso());
    }
}
