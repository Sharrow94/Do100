package com.rece.property.service.rental;

import io.rece.common.valueobject.id.ContractId;

import java.time.LocalDate;

public class RentalContract {

    private ContractId contractId;

    private LocalDate startedAt;

    private LocalDate expiredAt;
}
