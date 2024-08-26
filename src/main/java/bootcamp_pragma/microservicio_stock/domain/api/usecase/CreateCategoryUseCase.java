package bootcamp_pragma.microservicio_stock.domain.api.usecase;

import com.example.MicroservicioStock.domain.model.Category;


public  interface CreateCategoryUseCase {

     Category createCategory(Category category);
}
