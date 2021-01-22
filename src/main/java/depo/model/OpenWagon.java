package depo.model;

public class OpenWagon extends Wagon {
    public OpenWagon(int id){
        this.id = id;
        this.payload = 72;
        this.volume = 100;
    }

    protected String getWagonType(){
        return "Open\t";
    }
}
