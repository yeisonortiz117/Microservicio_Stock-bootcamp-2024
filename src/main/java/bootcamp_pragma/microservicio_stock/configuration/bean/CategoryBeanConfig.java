package bootcamp_pragma.microservicio_stock.configuration.bean;

import com.example.MicroservicioStock.domain.api.usecase.CreateCategoryUseCase;
import com.example.MicroservicioStock.domain.api.usecase.impl.CreateCategoryUseCaseImpl;
import com.example.MicroservicioStock.ports.persistence.adapters.CategoryRepositoryAdapter;
import com.example.MicroservicioStock.ports.persistence.repository.CategoryJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryBeanConfig {

    @Bean
    public CreateCategoryUseCase createCategoryUseCase(CategoryRepositoryAdapter categoryRepositoryAdapter) {
        return new CreateCategoryUseCaseImpl(categoryRepositoryAdapter);
    }

    @Bean
    public CategoryRepositoryAdapter categoryRepositoryAdapter(CategoryJpaRepository categoryJpaRepository) {
        return new CategoryRepositoryAdapter(categoryJpaRepository);
    }
}