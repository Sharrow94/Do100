import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.money.Money;
import io.rece.rental.domain.core.rental.offer.RentalOffer;
import io.rece.rental.domain.core.rental.offer.RentalOfferId;
import io.rece.rental.domain.core.rental.offer.terms.ApartmentTerms;
import io.rece.rental.domain.core.rental.offer.terms.term.DepositTerm;
import io.rece.rental.domain.core.rental.offer.terms.term.PriceTerm;
import io.rece.rental.domain.core.rental.offer.terms.term.RentTerm;
import io.rece.rental.domain.core.rental.offer.thread.OfferThread;
import io.rece.rental.domain.core.rental.offer.type.ApartmentOffer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static java.math.BigDecimal.valueOf;

public class LogicTest {

    @Test
    @DisplayName("Make a deal after negotiation")
    public void offer_accepted() {
        ClientId client = new ClientId(UUID.randomUUID());

        PriceTerm priceTerm = new PriceTerm(Money.of(valueOf(2500)));
        RentTerm rentTerm = new RentTerm(Money.of(valueOf(440)));
        DepositTerm depositTerm = new DepositTerm(Money.of(valueOf(2500)));
        ApartmentTerms initialTerms = new ApartmentTerms(priceTerm, rentTerm, depositTerm);

        PriceTerm changedPriceTerm = new PriceTerm(Money.of(valueOf(2200)));
        ApartmentTerms suggestionFromClient = new ApartmentTerms(changedPriceTerm, rentTerm, depositTerm);

        RentalOffer offer = new ApartmentOffer(new RentalOfferId(UUID.randomUUID()), initialTerms);
        //when
        OfferThread offerThread = offer.startNegotiation(client, suggestionFromClient);

    }
}
