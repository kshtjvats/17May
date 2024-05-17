package CRUDIOC.IOC.DEMO.Controller;



import CRUDIOC.IOC.DEMO.entity.Item;
import CRUDIOC.IOC.DEMO.services.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/items")
    public class ItemController {
        long accountId;
        private final ItemService itemService;

        public ItemController(ItemService itemService) {
            this.itemService = itemService;
        }

        @GetMapping
        public List<Item> getAllItems() {
            return itemService.getAllItems();
        }

        @GetMapping("/{id}")
        public Item getItemById(@PathVariable Long id) {
            return itemService.getItemById(id);
        }

        @PostMapping
        public void addItem(@RequestBody Item item) {
            itemService.addItem(item);
        }

        @PutMapping("/{id}")
        //int x;
        public void updateItem(@PathVariable Long id, @RequestBody Item item) {
            itemService.updateItem(id, item);
        }

        @DeleteMapping("/{id}")
        public void deleteItem(@PathVariable Long id) {
            itemService.deleteItem(id);
        }
    }
