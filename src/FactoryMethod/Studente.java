package FactoryMethod;
import java.util.ArrayList;
import java.util.List;
//ConcrateProduct
//implementa interfaccia studente e implementa i suoi metodi
public class Studente implements IStudente{
    private List<Esame> esami = new ArrayList<>();
    public void nuovoEsame(String materia,int voto){
        Esame e = new Esame(materia,voto);
        esami.add(e);
    }
    public float getMedia(){
        if(esami.isEmpty()) return 0;
        float sum = 0;
        for(Esame e: esami) sum+=e.getVoto();
        return sum/esami.size();
    }
}
