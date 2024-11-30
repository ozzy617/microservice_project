package com.progt.inventoryservice;

import com.progt.inventoryservice.model.Inventory;
import com.progt.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    public CommandLineRunner loadData(InventoryRepository repository) {
        return (args) -> {
               Inventory inventory = new Inventory();
                inventory.setSkuCode("iphone_12");
                inventory.setQuantity(10);

                Inventory inventory2 = new Inventory();
                inventory2.setSkuCode("macbook_pro");
                inventory2.setQuantity(0);

                repository.save(inventory);
                repository.save(inventory2);
        };
    }
}
