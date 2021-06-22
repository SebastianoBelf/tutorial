package Esercitazione.PrimaLezione;

public class myHandler implements Handler {
    
     @Override
     public void gestisci(String evento){
         System.out.println("Gestito "+evento);
     }
}