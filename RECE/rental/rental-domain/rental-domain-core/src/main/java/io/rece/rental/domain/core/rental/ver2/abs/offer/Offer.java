package io.rece.rental.domain.core.rental.ver2.abs.offer;


import io.rece.rental.domain.core.rental.ver2.abs.contract.Contract;
import io.rece.rental.domain.core.rental.ver2.abs.offer.terms.OfferTerms;

public interface Offer {

    Contract acceptBy(String clientId);

    OfferThread startNegotiation(String clientId, OfferTerms terms);

    OfferTerms getTerms();
}
