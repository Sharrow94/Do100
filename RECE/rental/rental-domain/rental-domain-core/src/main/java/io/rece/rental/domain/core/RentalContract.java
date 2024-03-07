package io.rece.rental.domain.core;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.ContractId;
import io.rece.common.valueobject.id.OwnerId;
import io.rece.common.valueobject.time.TimeDuration;

public class RentalContract {

    private ContractId contractId;
    private OwnerId ownerId;
    private ClientId clientId;
    private TimeDuration duration;

    public RentalContract(RentalOffer offer, ClientId clientId) {

    }
}
