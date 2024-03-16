package io.rece.rental.domain.core.rental.abs.contract;

import io.rece.rental.domain.core.rental.ver2.abs.contract.Annex;

public interface Contract {

    Contract terminateContract(Termination termination);

    void addAnnex(Annex annex);
}
