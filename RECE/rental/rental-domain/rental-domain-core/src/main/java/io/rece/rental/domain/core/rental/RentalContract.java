package io.rece.rental.domain.core.rental;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.ContractId;
import io.rece.common.valueobject.id.OwnerId;
import io.rece.common.valueobject.time.TimeDuration;

import java.util.UUID;

public class RentalContract {

    private ContractId contractId;
    private OwnerId ownerId;
    private ClientId clientId;
    private TimeDuration duration;

    public RentalContract(OwnerId ownerId, ClientId clientId, TimeDuration duration) {
        this.contractId = new ContractId(UUID.randomUUID());
        this.ownerId = ownerId;
        this.clientId = clientId;
        this.duration = duration;
    }
}
