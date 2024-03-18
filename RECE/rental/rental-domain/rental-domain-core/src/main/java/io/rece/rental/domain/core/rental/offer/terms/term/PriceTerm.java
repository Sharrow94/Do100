package io.rece.rental.domain.core.rental.offer.terms.term;


import io.rece.common.valueobject.money.Money;

public record PriceTerm(Money value) implements Term {
}
