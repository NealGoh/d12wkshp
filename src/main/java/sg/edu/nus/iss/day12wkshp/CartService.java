package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    public List<Item> getShoppingItems() {

        List<Item> lstItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Yeezy 350 V2 Bone ");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Dunk low off white Lot 21");
        itm.setQuantity(1);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("AJ1 mid chicago black toe");
        itm.setQuantity(3);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Nike sacai waffle fragment grey");
        itm.setQuantity(6);
        lstItems.add(itm);

        return lstItems;
    }
    
}
