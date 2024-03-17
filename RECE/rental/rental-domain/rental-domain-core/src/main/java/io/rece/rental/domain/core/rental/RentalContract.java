package io.rece.rental.domain.core.rental;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.ContractId;
import io.rece.rental.domain.core.rental.abs.contract.Contract;
import io.rece.rental.domain.core.rental.abs.contract.Termination;
import io.rece.rental.domain.core.rental.abs.offer.terms.OfferTerms;
import io.rece.rental.domain.core.rental.offer.RentalOfferId;

import java.util.UUID;

public class RentalContract implements Contract {
    private ContractId contractId;
    private RentalOfferId offerId;
    private ClientId clientId;
    private OfferTerms terms;

    public RentalContract(RentalOfferId offerId, ClientId clientId, OfferTerms terms) {
        this.contractId = new ContractId(UUID.randomUUID());
        this.offerId = offerId;
        this.clientId = clientId;
        this.terms = terms;
    }

    @Override
    public void terminateContract(Termination termination) {

    }
}
