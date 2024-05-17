package CRUDIOC.IOC.DEMO.services;

import CRUDIOC.IOC.DEMO.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems();
    Item getItemById(Long id);
    void addItem(Item item);
    void updateItem(Long id, Item item);
    void deleteItem(Long id);
}