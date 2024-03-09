package io.rece.rental.domain.core.rental.offer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalOfferRepository extends JpaRepository<RentalOffer, RentalOfferId> {
}
