package Singleton;

public class MainFib {
    public static void main(String[] args){
        // richiede una istanza di Fib
        Fib f = Fib.getIstance();
        System.out.print("f "+f.getValue());
        System.out.println(" "+f.getValue());
        // richide una nuova istanza(ma è uguale)
        Fib f2 = Fib.getIstance();
        System.out.print("f "+f2.getValue());
        System.out.println(" "+f2.getValue());
        
        //accedo sempre all'unica istanza
    }
}
