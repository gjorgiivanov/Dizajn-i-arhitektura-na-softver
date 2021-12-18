package mk.ukim.finki.dians.application.repository;

import mk.ukim.finki.dians.application.model.DrinkPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkPlaceRepository extends JpaRepository<DrinkPlace, Long> {

}
