package FactoryMethod;
//ConcrateProduct
public class Sospeso implements IStudente {
    private float media;
    public Sospeso(float _media){
        media = _media; // la media rimane uguale perchè non può fare esami
    }
    public void nuovoEsame(String materia,int voto){
        System.out.println("Non 'e possibile sostenere esami");
    }
    public float getMedia(){
        return media;
    }
}
