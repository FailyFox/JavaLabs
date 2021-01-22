package depo.model;

public abstract class Wagon {
    protected int id;
    protected int payload;
    protected int volume;

    public Wagon(){};

    public Wagon(int id, int payload, int volume){
        this.id = id;
        this.payload = payload;
        this.volume = volume;
    }

    public int getId(){
        return this.id;
    }

    public int getPayload() {
        return payload;
    }

    public int getVolume() {
        return volume;
    }

    protected abstract String getWagonType();

    public String toString() {
        return this.getWagonType()+" wagon\t\t{" +
                "ID: " + id +
                ", payload: " + payload +
                ", volume: " + volume +
                '}';
    }
}
