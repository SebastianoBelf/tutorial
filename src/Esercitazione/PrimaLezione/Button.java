package Esercitazione.PrimaLezione;



public class Button {
    Handler myh;

    public Button(Handler h){
        myh = h;
    }
    public void click(){
        // il bottone viene gestito da un handler
        // handler è un interfaccia mi gestisco io il myhandler facendo l'overraid dei metodi di handler
        myh.gestisci("click bottone");
    }
}
