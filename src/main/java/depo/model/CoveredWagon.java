package depo.model;


public class CoveredWagon extends Wagon {
    public CoveredWagon(int id){
        this.id = id;
        this.payload = 69;
        this.volume = 135;
    }

    protected String getWagonType(){
        return "Covered";
    }
}
