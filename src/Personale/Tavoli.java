package Personale;

public class Tavoli {
    private static int nTavolo = 0;
    private boolean stato;
    private Posti posto1 = new Posti(1,new Carne());
    private Posti posto2 = new Posti(2,new Pesce());
    private Posti posto3 = new Posti(3,new Pesce());
    private Posti posto4 = new Posti(4,new Carne());

    public Tavoli(){
        nTavolo++;
        stato = false;
    }
    public void setStato(){
        stato = true;
    }
    public Posti getPosti1(){
        return posto1;
    }
    public Posti getPosti2(){
        return posto2;
    }
    public Posti getPosti3(){
        return posto3;
    }
    public Posti getPosti4(){
        return posto4;
    }


}
