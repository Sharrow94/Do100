package io.rece.rental.domain.core.rental.offer.terms.term;


import io.rece.rental.domain.core.rental.abs.offer.terms.term.AbstractTerm;

import java.math.BigDecimal;

public class RentTerm extends AbstractTerm<BigDecimal> {
    public RentTerm(BigDecimal value) {
        super(value);
    }

}
