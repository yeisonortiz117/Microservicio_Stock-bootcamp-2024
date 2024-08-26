package bootcamp_pragma.microservicio_stock.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


    @Entity
    public class Category {

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @NotBlank(message = "Nombre es obligatorio")
        @Size(max = 50, message = "El nombre no puede tener más de 50 caracteres")
        private String name;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @NotBlank(message = "Descripción es obligatoria")
        @Size(max = 90, message = "La descripción no puede tener más de 90 caracteres")
        private String description;
}
