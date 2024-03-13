package io.rece.rental.domain.core.rental.abs.offer;

import io.rece.common.valueobject.id.ClientId;

public interface Offer {

    void initOffer();

    void accept();

    OfferThread startNegotiation(ClientId clientId, OfferTerms terms);
}
