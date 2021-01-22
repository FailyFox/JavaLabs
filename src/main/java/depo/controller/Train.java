package depo.controller;

import depo.model.Locomotive;
import depo.model.Wagon;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private Locomotive locomotive = new Locomotive(7813, 220, 50);
    private List<Wagon> wagons = new ArrayList<>();
    private int payload = 0;
    private int volume = 0;

    private final Logger log = Logger.getLogger(Train.class);

    public int getPayload() {
        return payload;
    }

    public int getVolume() {
        return volume;
    }

    public boolean addWagon(Wagon wagon) {
        boolean res = true;

        for (Wagon w : wagons) {
            if (w.getId() == wagon.getId()) {

                log.error("ID duplicating: " + wagon.getId());
                try {
                    MailSender.Send("train depo",
                            "10.01.2002",
                            "matvii.utieshev.knm.2019@lpnu.ua",
                            "Program error!",
                            "ID duplicating: " + wagon.getId()+"\n first wagon - "
                                    + w.toString()+"\n second wagon - "+wagon.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                res = false;
            }
        }
        wagons.add(wagon);
        payload += wagon.getPayload();
        volume += wagon.getVolume();
        log.info("Wagon added: \t " + wagon.toString());
        return res;
    }

    public boolean delWagon(int id) {
        for (Wagon wagon : wagons) {
            if (wagon.getId() == id) {
                payload -= wagon.getPayload();
                volume -= wagon.getVolume();
                wagons.remove(wagon);
                return true;
            }
        }
        return false;
    }

    public void sortWagons() {
        wagons.sort(new WagonPayloadComparator());
    }

    public void showTrain() {
        System.out.println(locomotive.toString());
        for (Wagon wagon : wagons) {
            System.out.println(wagon.toString());
        }
    }
}