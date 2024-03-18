package io.rece.rental.domain.core.rental.offer.terms.term;


import io.rece.common.valueobject.money.Money;

public record DepositTerm(Money value) implements Term {
}
