//ConcreteCreator
package FactoryMethod;
public class StCreator {
    private static boolean a = true;
    public static IStudente getStudente(){
        if(a) return new Studente();
        return new Sospeso(0);
    }
}
