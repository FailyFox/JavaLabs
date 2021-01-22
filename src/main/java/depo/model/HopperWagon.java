package depo.model;

public class HopperWagon extends Wagon {
    public HopperWagon(int id){
        this.id = id;
        this.payload = 75;
        this.volume = 146;
    }

    protected String getWagonType(){
        return "Hopper\t";
    }
}
