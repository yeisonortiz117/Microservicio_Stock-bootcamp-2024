package bootcamp_pragma.microservicio_stock.aplicattion.dto;


    public class CategoryDto {

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        private Long id;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        private String description;

        // Getters y Setters
    }

