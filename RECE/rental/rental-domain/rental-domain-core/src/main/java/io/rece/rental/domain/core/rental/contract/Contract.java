package io.rece.rental.domain.core.rental.contract;


import io.rece.rental.domain.core.rental.contract.termination.Termination;

public interface Contract {

    void terminateContract(Termination termination);

}
