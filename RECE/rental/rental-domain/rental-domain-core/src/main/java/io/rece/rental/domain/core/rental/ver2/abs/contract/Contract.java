package io.rece.rental.domain.core.rental.ver2.abs.contract;

public interface Contract {

    void terminateContract(Termination termination);

    void addAnnex(Annex annex);
}
