package org.example.demothymeleaf.entities;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
    @Entity
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @NotBlank(message = "Name is mandatory")
        private String name;

        @NotBlank(message = "Email is mandatory")
        private String email;

        public User() {
            super();
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public @NotBlank(message = "Name is mandatory") String getName() {
            return name;
        }

        public void setName(@NotBlank(message = "Name is mandatory") String name) {
            this.name = name;
        }

        public @NotBlank(message = "Email is mandatory") String getEmail() {
            return email;
        }

        public void setEmail(@NotBlank(message = "Email is mandatory") String email) {
            this.email = email;
        }
    }

