package bootcamp_pragma.microservicio_stock.aplicattion.controller;

import com.example.MicroservicioStock.aplicattion.dto.CategoryDto;
import com.example.MicroservicioStock.aplicattion.mapper.CategoryDtoMapper;
import com.example.MicroservicioStock.domain.api.usecase.CreateCategoryUseCase;
import com.example.MicroservicioStock.domain.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CreateCategoryUseCase createCategoryUseCase;

    @Autowired
    private CategoryDtoMapper categoryDtoMapper;

    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {
        Category category = categoryDtoMapper.toModel(categoryDto);
        Category createdCategory = createCategoryUseCase.createCategory(category);
        CategoryDto createdCategoryDto = categoryDtoMapper.toDto(createdCategory);
        return ResponseEntity.ok(createdCategoryDto);
    }
}