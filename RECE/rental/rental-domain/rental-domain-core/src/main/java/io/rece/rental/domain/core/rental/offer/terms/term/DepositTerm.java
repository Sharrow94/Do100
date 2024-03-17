package io.rece.rental.domain.core.rental.offer.terms.term;


import io.rece.rental.domain.core.rental.abs.offer.terms.term.AbstractTerm;

import java.math.BigDecimal;

public class DepositTerm extends AbstractTerm<BigDecimal> {
    public DepositTerm(BigDecimal value) {
        super(value);
    }
}
