package depo.controller;

import depo.model.Wagon;

import java.util.Comparator;

public class WagonPayloadComparator implements Comparator<Wagon> {
    @Override
    public int compare(Wagon w1, Wagon w2) {
        return w1.getPayload() - w2.getPayload();
    }
}
