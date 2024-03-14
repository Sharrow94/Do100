package io.rece.rental.domain.core.rental.abs.offer;

import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.abs.offer.terms.OfferTerms;

public interface Offer {

    void initOffer(OfferTerms terms);

    void accept();

    OfferThread startNegotiation(ClientId clientId, OfferTerms terms);
}
