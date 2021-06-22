package Personale;

public class Carne implements IPiatti{

    private String piatto;
    @Override
    public String getPiatto() {
        return piatto;
    }

    @Override
    public void setPiatto(String _piatto) {
        piatto = _piatto;
    }
    
}
