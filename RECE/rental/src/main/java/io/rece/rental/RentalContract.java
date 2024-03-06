package io.rece.rental;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.ContractId;
import io.rece.common.valueobject.id.OwnerId;

import java.time.LocalDate;

public class RentalContract {

    private ContractId contractId;
    private OwnerId ownerId;
    private ClientId clientId;
    private LocalDate startedAt;
    private LocalDate expiredAt;
}
