package io.rece.rental.domain.core.rental.ver2.impl.contract;


import io.rece.rental.domain.core.rental.ver2.abs.contract.Annex;
import io.rece.rental.domain.core.rental.ver2.abs.contract.Contract;
import io.rece.rental.domain.core.rental.ver2.abs.contract.Termination;

public class RentalContract implements Contract {
    @Override
    public void terminateContract(Termination termination) {
        termination.processContract(this);
    }

    @Override
    public void addAnnex(Annex annex) {

    }
}
