package io.rece.rental.domain.core.rental.ver2.abs.offer.terms;


import io.rece.rental.domain.core.rental.ver2.abs.offer.terms.term.AbstractTerm;

public interface OfferTerms {
    OfferTerms editTerm(AbstractTerm<?> editedTerm);
}
