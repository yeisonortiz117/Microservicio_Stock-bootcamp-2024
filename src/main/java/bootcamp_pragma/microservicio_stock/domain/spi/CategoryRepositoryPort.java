package bootcamp_pragma.microservicio_stock.domain.spi;

import com.example.MicroservicioStock.domain.model.Category;

public  interface CategoryRepositoryPort {
     boolean existsByName(String name);
     Category save(Category category);

}
