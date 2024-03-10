package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.PropertyId;
import io.rece.rental.domain.core.rental.RentalContract;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class RentalOfferFacadeTest {

    @Test
    public void create_offer() {
        //given
        RentalOfferId offerId = new RentalOfferId(UUID.randomUUID());
        PropertyId propertyId = new PropertyId(UUID.randomUUID());
        RentalTerms initialTerms = new RentalTerms();
        RentalOffer offer = new RentalOffer(offerId, propertyId, initialTerms, true);
        ClientId clientId = new ClientId(UUID.randomUUID());
        RentalTerms proposedTerms = new RentalTerms();
        //when
        RentalOfferThread rentalOfferThread = offer.startNegotiationThread(clientId, initialTerms);
        RentalOfferThread clientWantToChangePrice = rentalOfferThread.proposeTerms(proposedTerms);
        RentalContract rentalContract = clientWantToChangePrice.acceptTerms();
        //then
    }

}