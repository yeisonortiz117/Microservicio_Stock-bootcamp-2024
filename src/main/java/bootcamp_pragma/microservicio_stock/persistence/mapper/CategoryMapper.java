package bootcamp_pragma.microservicio_stock.persistence.mapper;

import com.example.MicroservicioStock.domain.model.Category;
import com.example.MicroservicioStock.ports.persistence.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryEntity toEntity(Category category);

    Category toModel(CategoryEntity categoryEntity);
}
