import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        Item item = new Item();
        Order order = new Order();
        // Menu items

        // Order variables -- order1, order2 etc.
        Item item1 = new Item();
        item1.name = "Coffee";
        item1.price = 3.00;

        Item item2 = new Item();
        item2.name = "Iced Coffee";
        item2.price = 4.00;

        Item item3 = new Item();
        item3.name = "Cappuccino";
        item3.price = 5.00;

        Item item4 = new Item();
        item4.name = "Not-Coffee";
        item4.price = 6.00;

        Order order1 = new Order();
        order1.name = "Cindhuri";
        
        Order order2 = new Order();
        order2.name = "jimmy";
        order2.items.add(item1);
        order2.total += item1.price;
        order2.ready = true;
        

        Order order3 = new Order();
        order3.name = "noah";
        order3.items.add(item3);
        order3.total += item3.price;



        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item4);
        order4.items.add(item4);
        order4.items.add(item4);
        order4.total = (item4.price + item4.price +item4.price);


        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
