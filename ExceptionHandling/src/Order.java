import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Order {

    void checkOrder(ArrayList<String> order) throws ItemNotFoundException, NoSuchElementException {

        boolean status = false;
        Item item = new Item();
        ArrayList<String> itemsArray = item.createItem();
        try {
            if (order.isEmpty()) {
                throw new NoSuchElementException();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Please enter the food items to proceed");
        }
        for (int i = 0; i < 2; i++) {
            status = itemsArray.contains(order.get(i));
        }

        if (status) {
            System.out.println("Congratulations on successfully placing your order!");

        } else {
            throw new ItemNotFoundException();
        }

    }
}
