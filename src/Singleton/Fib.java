package Singleton;

public class Fib {
    private static Fib obj = new Fib();  // attributo statico istanza classe inizializato 1 volta sola
    private int[] x= { 1,2,3,5,8,13,21,34,55,89,144};
    private int i;

    private Fib(){ // il costruttore lo chiamo solo all'interno della classe infatti è privato
        i = 3;
    }
    public static Fib getIstance(){
        if(obj == null) obj = new Fib();
        return obj; // restituisce l'istanza
    }
    public int getValue(){
        if(i< 11) i++;
        return x[i-1];
    }
    public void revert(){
        i = 0;
    }
}
