package io.rece.rental.domain.core.rental.abs.contract;

public interface Contract {

    Contract terminateContract(Termination termination);

    void addAnnex(Annex annex);
}
