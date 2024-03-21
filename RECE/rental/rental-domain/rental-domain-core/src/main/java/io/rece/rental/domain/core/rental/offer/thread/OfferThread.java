package io.rece.rental.domain.core.rental.offer.thread;


import io.rece.rental.domain.core.rental.contract.Contract;
import io.rece.rental.domain.core.rental.offer.terms.AbstractOfferTerms;

public interface OfferThread {

    Contract acceptThreadByOwner();

    Contract acceptThreadByClient();

    OfferThread suggestChange(AbstractOfferTerms terms);
}
