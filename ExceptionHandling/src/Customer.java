import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author chethana
 *
 */
public class Customer {
    private String id;
    private int password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        try {

            System.out.println("Enter the user name: ");
            String username = scanner.next();

            System.out.println("Enter the passowrd: ");
            int password = scanner.nextInt();

            boolean loginStatus = customer.login(username, password);
            if (loginStatus) {

                customer.placeOrder();
            }

        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("Please enter a valid input.");
            main(null);
        } finally {
            scanner.close();
        }
    }

    public boolean login(String username, int pwd) {
        boolean status = false;
        this.id = username;
        this.password = pwd;
        try {
            if (id.equals("chethana") && password == 123) {
                System.out.println("you have logged in successfully");
                System.out.println();
                status = true;
            } else {
                throw new InvalidUserException();

            }
        } catch (InvalidUserException e) {
            System.out.println("Username and password is incorrect.Try again...!!!");

        }

        return status;

    }

    /**
     *
     * @throws InputMismatchException
     */
    public void placeOrder() throws InputMismatchException {

        Scanner s = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Select 2 food items from the list.");
        System.out.println();
        System.out.println("Cake || Banana || Bun || Cheese || Apple");
        for (int i = 0; i < 2; i++) {
            arrayList.add(s.nextLine());
        }

        if (arrayList.contains("")) {
            throw new InputMismatchException();

        }

        Order order = new Order();
        try {
            order.checkOrder(arrayList);
        } catch (Exception e) {
            System.out.println("Error : Please enter items that are on the list");

        } finally {
            s.close();
        }

    }

}
