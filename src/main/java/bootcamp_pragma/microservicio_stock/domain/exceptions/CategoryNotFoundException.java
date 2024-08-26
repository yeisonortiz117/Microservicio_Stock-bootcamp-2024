package bootcamp_pragma.microservicio_stock.domain.exceptions;

public class CategoryNotFoundException  extends RuntimeException {
    public CategoryNotFoundException(String message) {
        super(message);
    }
}
