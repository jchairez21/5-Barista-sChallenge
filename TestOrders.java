import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        // Menu items Object
        Item item1 = new Item("mocha", 4.25); //On Instantiation
        Item item2 = new Item("latte", 4.50);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("capuccino", 3.50);


        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Cinduri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");


        // Application Simulations using addItem method
        order1.addItem(item1);
        order1.addItem(item3);

        order2.addItem(item2);
        order2.addItem(item2);

        order3.addItem(item1);
        order3.addItem(item4);

        order4.addItem(item4);
        order4.addItem(item4);

        order5.addItem(item4);
        order5.addItem(item2);


        // Application Simulations using getStatusMessage method
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());

        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        order4.setReady(false);
        System.out.println(order4.getStatusMessage());


        // Use this example code to test various orders' updates
        System.out.println(order1.getOrderTotal());
        System.out.println(order5.getOrderTotal());
        System.out.println(order3.getOrderTotal());

        // Display method
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
