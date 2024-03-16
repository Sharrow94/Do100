package io.rece.rental.domain.core.rental.ver2.abs.offer;


import io.rece.rental.domain.core.rental.ver2.abs.contract.Contract;
import io.rece.rental.domain.core.rental.ver2.abs.offer.terms.OfferTerms;

public interface OfferThread {

    Contract acceptThread();

    OfferThread suggestChange(OfferTerms terms);
}
