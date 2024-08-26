package bootcamp_pragma.microservicio_stock.persistence.repository;



import com.example.MicroservicioStock.ports.persistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Long> {
    boolean existsByName(String name);
}

