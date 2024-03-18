package io.rece.rental.domain.core.rental.contract.termination;

import io.rece.rental.domain.core.rental.contract.Contract;

public interface Termination {

    void process(Contract contract);
}
