package io.rece.rental.domain.core.rental;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.ContractId;
import io.rece.rental.domain.core.rental.offer.RentalOfferId;
import io.rece.rental.domain.core.rental.offer.RentalTerms;

import java.util.UUID;

public class RentalContract {
    private ContractId contractId;
    private RentalOfferId offerId;
    private ClientId clientId;
    private RentalTerms terms;

    public RentalContract(RentalOfferId offerId, ClientId clientId, RentalTerms terms) {
        this.contractId = new ContractId(UUID.randomUUID());
        this.offerId = offerId;
        this.clientId = clientId;
        this.terms = terms;
    }
}
