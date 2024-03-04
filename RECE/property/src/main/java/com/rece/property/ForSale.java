package com.rece.property;

import io.rece.common.valueobject.id.ClientId;

public interface ForSale {

    void sell(ClientId clientId, SellOffer offer);
}
