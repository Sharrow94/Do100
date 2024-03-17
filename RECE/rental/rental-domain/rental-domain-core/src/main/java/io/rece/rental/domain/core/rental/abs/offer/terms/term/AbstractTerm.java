package io.rece.rental.domain.core.rental.abs.offer.terms.term;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class AbstractTerm<T> {
    private final T value;
}
