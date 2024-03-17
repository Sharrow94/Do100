package io.rece.rental.domain.core.rental.abs.offer;


import io.rece.rental.domain.core.rental.abs.contract.Contract;
import io.rece.rental.domain.core.rental.abs.offer.terms.OfferTerms;

public interface OfferThread {

    Contract acceptThread();

    OfferThread suggestChange(OfferTerms terms);
}
