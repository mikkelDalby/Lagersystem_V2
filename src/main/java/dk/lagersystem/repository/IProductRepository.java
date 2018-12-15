package dk.lagersystem.repository;

import dk.lagersystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Modifying
    @Query("UPDATE Product p SET p.p_in_stock = ?1 WHERE p.p_number = ?2")
    void updateProductsInStock(Integer newStock, Integer p_number);
}