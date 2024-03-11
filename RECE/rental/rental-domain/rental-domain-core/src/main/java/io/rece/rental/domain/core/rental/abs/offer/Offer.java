package io.rece.rental.domain.core.rental.abs.offer;

import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.abs.contract.Contract;

public interface Offer {

    Contract acceptBy(ClientId clientId);

    OfferThread startNegotiation(ClientId clientId, OfferTerms terms);
}
