package bootcamp_pragma.microservicio_stock.domain.api.usecase.impl;

import com.example.MicroservicioStock.domain.api.usecase.CreateCategoryUseCase;
import com.example.MicroservicioStock.domain.model.Category;
import com.example.MicroservicioStock.domain.spi.CategoryRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCategoryUseCaseImpl implements CreateCategoryUseCase {

    private final CategoryRepositoryPort categoryRepositoryPort;

    @Autowired
    public CreateCategoryUseCaseImpl(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public Category createCategory(Category category) {
        if (categoryRepositoryPort.existsByName(category.getName())) {
            throw new RuntimeException("Category with this name already exists");
        }
        return categoryRepositoryPort.save(category);
    }
}
