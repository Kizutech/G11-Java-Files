public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Large", 1, 1, 0, 0, 2);
        Pizza pizza2 = new Pizza("Medium", 2, 0, 1, 1, 0);
        Pizza pizza3 = new Pizza("Small", 2, 1, 1, 1, 0);
        Pizza pizza4 = new Pizza("Extra Large", 2, 1, 1, 0, 0);

        PizzaOrder order = new PizzaOrder();
        order.addPizza(0, pizza1);
        order.addPizza(1, pizza2);
        order.addPizza(1, pizza3);
        order.addPizza(1, pizza4);

        System.out.println("Pizza 1 description: " + pizza1.getDescription());
        System.out.println("Pizza 2 description: " + pizza2.getDescription());
        System.out.println("Pizza 3 description: " + pizza3.getDescription());
        System.out.println("Pizza 4 description: " + pizza4.getDescription());
        System.out.println("Total cost of order: " + order.calcTotal());
    }
}
