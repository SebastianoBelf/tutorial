package ereditarieta;

import java.util.ArrayList;
import java.util.List;

public class Studente extends Persona {
    private String materia;
    private  List<Esame> esami = new ArrayList<>();
    public void setMateria(String _materia) { materia = _materia;}
    public void nuovoEsame(String _materia,int _voto){
        Esame e = new Esame(_materia,_voto);
        esami.add(e);
    }
    public float getMedia(){
        if(esami.isEmpty()) return 0;
        float somma = 0;
        for(Esame e : esami) somma+=e.getVoto();
        return somma/esami.size();
    }
    public void printAll(){
        super.printAll();
        System.out.println("Materia: "+materia);
        for(Esame e : esami){
            System.out.println(e.getMat()+ ": "+e.getVoto());
            System.out.println("media: "+getMedia());
        }
    }
}
