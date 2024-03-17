package io.rece.rental.domain.core.rental.offer.terms;


import io.rece.rental.domain.core.rental.abs.offer.terms.OfferTerms;
import io.rece.rental.domain.core.rental.abs.offer.terms.term.AbstractTerm;
import io.rece.rental.domain.core.rental.offer.terms.term.DepositTerm;
import io.rece.rental.domain.core.rental.offer.terms.term.PriceTerm;
import io.rece.rental.domain.core.rental.offer.terms.term.RentTerm;

public class ApartmentTerms implements OfferTerms {
    private PriceTerm priceTerm;
    private RentTerm rentTerm;
    private DepositTerm depositTerm;

    public ApartmentTerms(PriceTerm priceTerm, RentTerm rentTerm, DepositTerm depositTerm) {
        this.priceTerm = priceTerm;
        this.rentTerm = rentTerm;
        this.depositTerm = depositTerm;
    }

    @Override
    public OfferTerms editTerm(AbstractTerm<?> editedTerm) {
        ApartmentTerms newApartmentTerms = new ApartmentTerms(priceTerm, rentTerm, depositTerm);
        if (editedTerm instanceof PriceTerm term) {
            newApartmentTerms.priceTerm = term;
        } else if (editedTerm instanceof RentTerm term) {
            newApartmentTerms.rentTerm = term;
        } else if (editedTerm instanceof DepositTerm term) {
            newApartmentTerms.depositTerm = term;
        }
        return newApartmentTerms;
    }
}
