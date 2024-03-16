package io.rece.rental.domain.core.rental.ver2.impl.offer.terms.term;


import io.rece.rental.domain.core.rental.ver2.abs.offer.terms.term.AbstractTerm;

import java.math.BigDecimal;

public class PriceTerm extends AbstractTerm<BigDecimal> {
    public PriceTerm(BigDecimal value) {
        super(value);
    }

}
