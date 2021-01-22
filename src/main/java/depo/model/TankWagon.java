package depo.model;

public class TankWagon extends Wagon {
    public TankWagon(int id){
        this.id = id;
        this.payload = 125;
        this.volume = 160;
    }

    protected String getWagonType(){
        return "Tank\t";
    }
}
