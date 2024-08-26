package bootcamp_pragma.microservicio_stock.aplicattion.mapper;

import com.example.MicroservicioStock.aplicattion.dto.CategoryDto;
import com.example.MicroservicioStock.domain.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryDtoMapper {

    CategoryDto toDto(Category category);

    Category toModel(CategoryDto categoryDto);
}