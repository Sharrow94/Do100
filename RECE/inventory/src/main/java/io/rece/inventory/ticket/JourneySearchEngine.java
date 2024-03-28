package io.rece.inventory.ticket;

import io.rece.inventory.compartment.Leg;
import io.rece.inventory.compartment.instance.LegInstance;

import java.util.List;

public interface JourneySearchEngine {

    public List<LegInstance> getRoute(List<Leg> legs);
}
