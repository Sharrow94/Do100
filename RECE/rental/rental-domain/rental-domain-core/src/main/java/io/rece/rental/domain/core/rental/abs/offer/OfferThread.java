package io.rece.rental.domain.core.rental.abs.offer;

import io.rece.rental.domain.core.rental.abs.contract.Contract;

public interface OfferThread {

    Contract acceptThread();

    OfferThread suggestChange(OfferTerms terms);
}
