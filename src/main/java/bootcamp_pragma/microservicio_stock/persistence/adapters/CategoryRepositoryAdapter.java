package bootcamp_pragma.microservicio_stock.persistence.adapters;

import com.example.MicroservicioStock.domain.model.Category;
import com.example.MicroservicioStock.domain.spi.CategoryRepositoryPort;
import com.example.MicroservicioStock.ports.persistence.entity.CategoryEntity;
import com.example.MicroservicioStock.ports.persistence.mapper.CategoryMapper;
import com.example.MicroservicioStock.ports.persistence.repository.CategoryJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryRepositoryAdapter implements CategoryRepositoryPort {
    @Autowired
    private CategoryJpaRepository categoryJpaRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryRepositoryAdapter(CategoryJpaRepository categoryJpaRepository) {
    }

    @Override
    public boolean existsByName(String name) {
        return categoryJpaRepository.existsByName(name);
    }

    @Override
    public Category save(Category category) {
        CategoryEntity categoryEntity = categoryMapper.toEntity(category);
        CategoryEntity savedEntity = categoryJpaRepository.save(categoryEntity);
        return categoryMapper.toModel(savedEntity);
    }
}
