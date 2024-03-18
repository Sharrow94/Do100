package io.rece.rental.domain.core.rental.contract;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.ContractId;
import io.rece.rental.domain.core.rental.contract.termination.Termination;
import io.rece.rental.domain.core.rental.offer.RentalOfferId;
import io.rece.rental.domain.core.rental.offer.terms.AbstractOfferTerms;

import java.util.UUID;

public class RentalContract implements Contract {
    private ContractId contractId;
    private RentalOfferId offerId;
    private ClientId clientId;
    private AbstractOfferTerms terms;

    public RentalContract(RentalOfferId offerId, ClientId clientId, AbstractOfferTerms terms) {
        this.contractId = new ContractId(UUID.randomUUID());
        this.offerId = offerId;
        this.clientId = clientId;
        this.terms = terms;
    }

    @Override
    public void terminateContract(Termination termination) {

    }
}
