package cloud.shore.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/inventory/check/{productId}")
    public boolean checkInventory(@PathVariable("productId") String productId) {
        // Simulate inventory check
        return true; // Assume product is available
    }
}

