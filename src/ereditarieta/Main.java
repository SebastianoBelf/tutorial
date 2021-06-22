package ereditarieta;

public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente();
        studente.setNome("Sebastiano", "Belfiore");
        studente.nuovoEsame("interazione", 24);
        studente.nuovoEsame("Programazione 2", 24);
        studente.printAll();
        

        //classificazioni di tipi compatibilità tipi 
        System.out.println("Dopo l'assegnazione a p di tipo Persona");
        Persona p = studente;
        // p è dichiarato di tipo Persona
        // a runtime p punta all'istanza di studente
        p.printAll();
    }
}
