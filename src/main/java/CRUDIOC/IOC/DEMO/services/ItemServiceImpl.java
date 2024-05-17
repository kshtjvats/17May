package CRUDIOC.IOC.DEMO.services;

import CRUDIOC.IOC.DEMO.entity.Item;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private List<Item> itemList;

    public ItemServiceImpl() {
        this.itemList = new ArrayList<>();
    }

    @Override
    public List<Item> getAllItems() {
        return itemList;
    }

    @Override
    public Item getItemById(Long id) {
        for (Item item : itemList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void addItem(Item item) {
        itemList.add(item);
    }

    @Override
    public void updateItem(Long id, Item updatedItem) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId().equals(id)) {
                itemList.set(i, updatedItem);
                return;
            }
        }
    }

    @Override
    public void deleteItem(Long id) {
        itemList.removeIf(item -> item.getId().equals(id));
    }
}
