package com.javalab.demos.lombokdemo;

import com.javalab.core.utils.Logger;
import com.javalab.demos.lombokdemo.models.Person;
import com.javalab.demos.lombokdemo.models.Product;

/**
 * Classe de démonstration des fonctionnalités de Lombok
 */
public class LombokDemo {
    
    public void run() {
        Logger.info("=== Démonstration Lombok ===");
        
        // Démonstration de @Data, @Builder
        Logger.info("\n1. Démonstration de @Data et @Builder avec Person:");
        Person person = Person.builder()
            .firstName("Jean")
            .lastName("Dupont")
            .age(30)
            .email("jean.dupont@example.com")
            .build();
        
        Logger.info("Person créée: " + person);
        Logger.info("Prénom: " + person.getFirstName());
        Logger.info("Nom: " + person.getLastName());
        
        // Démonstration de @Getter, @Setter, @ToString
        Logger.info("\n2. Démonstration de @Getter, @Setter, @ToString avec Product:");
        Product product = new Product("Laptop", 999.99, "Electronics");
        Logger.info("Product créé: " + product);
        
        product.setPrice(899.99);
        Logger.info("Prix mis à jour: " + product.getPrice());
        
        Logger.info("\n=== Fin de la démonstration Lombok ===");
    }
}
