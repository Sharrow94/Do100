package io.rece.rental.domain.core.rental.offer.terms;


import io.rece.rental.domain.core.rental.offer.terms.term.DepositTerm;
import io.rece.rental.domain.core.rental.offer.terms.term.PriceTerm;
import io.rece.rental.domain.core.rental.offer.terms.term.RentTerm;
import lombok.Getter;

@Getter
public class ApartmentTerms extends AbstractOfferTerms {

    private PriceTerm priceTerm;
    private RentTerm rentTerm;
    private DepositTerm depositTerm;


    public ApartmentTerms(PriceTerm priceTerm, RentTerm rentTerm, DepositTerm depositTerm) {
        this.priceTerm = priceTerm;
        this.rentTerm = rentTerm;
        this.depositTerm = depositTerm;
    }
}
