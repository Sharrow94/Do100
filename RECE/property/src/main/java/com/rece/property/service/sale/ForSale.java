package com.rece.property.service.sale;

import io.rece.common.valueobject.id.ClientId;

public interface ForSale {

    void sell(ClientId clientId, SellOffer offer);
}
