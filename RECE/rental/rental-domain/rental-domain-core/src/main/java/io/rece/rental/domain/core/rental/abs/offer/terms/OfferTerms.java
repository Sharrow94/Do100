package io.rece.rental.domain.core.rental.abs.offer.terms;


import io.rece.rental.domain.core.rental.abs.offer.terms.term.AbstractTerm;

public interface OfferTerms {
    OfferTerms editTerm(AbstractTerm<?> editedTerm);
}
