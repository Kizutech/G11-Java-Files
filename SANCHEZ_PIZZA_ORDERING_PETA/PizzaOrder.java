public class PizzaOrder {
    private Pizza [] pizzas;

    public PizzaOrder() {
        pizzas = new Pizza[3];
    }

    public void addPizza(int index, Pizza pizza) {
        if (index > 0 && index < pizzas.length) {
            pizzas[index] = pizza;
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                totalCost += pizza.calcCost();
        }
    }
    return totalCost;
    }
}