package dk.lagersystem.repository;

import dk.lagersystem.model.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductsOld extends JpaRepository<products, Integer> {
}
