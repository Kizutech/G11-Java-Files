public class Pizza {
    // Instance Variable
    private String size;
    private int cheesetoppings;
    private int pepperonitoppings;
    private int pineappletidbits;
    private int vegetabletoppings;
    private int hamtoppings;
    
    // constructor
    public Pizza(String size,int cheesetoppings,int pepperonitoppings,int pineappletidbits,int vegetabletoppings,int hamtoppings) {
        this.size = size;
        this.cheesetoppings = cheesetoppings;
        this.pepperonitoppings = pepperonitoppings;
        this.pineappletidbits = pineappletidbits;
        this.vegetabletoppings = vegetabletoppings;
        this.hamtoppings = hamtoppings;
    }

    //Getters & Setters
    
    //Size
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    //Cheese Toppings
    public int getCheeseToppings() {
        return cheesetoppings;
    }
    public void setCheeseToppings(int cheesetoppings) {
        this.cheesetoppings = cheesetoppings;
    }

    //Cheese Pepperoni Toppings
    public int getPepperoniToppings() {
        return pepperonitoppings;
    }
    public void setPepperoniToppings(int pepperonitoppings) {
        this.pepperonitoppings = pepperonitoppings;
    }

    //Cheese Pineapple Tidbits
    public int getPineappleTidbits() {
        return pineappletidbits;
    }
    public void setPineappleTidbits(int pineappletidbits) {
        this.pineappletidbits = pineappletidbits;
    }

    //Cheese Vegetable Toppings
    public int getVegetableToppings() {
        return vegetabletoppings;
    }
    public void setVegetableToppings(int vegetabletoppings) {
        this.vegetabletoppings = vegetabletoppings;
    }

    //Cheese Ham Toppings
    public int getHamToppings() {
        return hamtoppings;
    }
    public void setHamToppings(int hamtoppings) {
        this.hamtoppings = hamtoppings;
    }

    //The Cost
    public double calcCost() {
        double baseCost = 0;
        if(size.equals("Small")) {
            baseCost = 69;
        }  else if (size.equals("Medium")) {
            baseCost = 89;
        }  else if (size.equals("Large")) {
            baseCost = 109;
        }  else if (size.equals("Extra Large")) {
            baseCost = 129;
        }

        return baseCost + (10 * (cheesetoppings + pepperonitoppings + pineappletidbits + vegetabletoppings + hamtoppings));
    }

    //Description
    public String getDescription() {
        return "Size: " + size + ", Cheese Toppings: " + cheesetoppings + ", Pepperoni Toppings: " + pepperonitoppings +
        ", Pineapple Tidbits: " + pineappletidbits + ", Vegetable Toppings: " + vegetabletoppings +  ", Ham Toppings: " + hamtoppings + ", Total Cost: " + calcCost();
    }
}