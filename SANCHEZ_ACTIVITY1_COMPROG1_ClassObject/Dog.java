package SANCHEZ_ACTIVITY1_COMPROG1_ClassObject;

public class Dog {
    private String name;
    private String breed;
    
    // Constructor
    public Dog (String name, String breed){
    this.name = name;
    this.breed = breed;
}
    public String getName() {
    return name;
}

    public String getBreed() {
        return breed;
    }
    
      public void setName(String name) {
    this.name = name;
}

public void setBreed(String breed) {
    this.breed = breed;
}
   
    public static void main(String[] args) {
        Dog Buddy = new Dog("Buddy", "Golden Retriever");  
        Buddy.setName("Buddy");
        Buddy.setBreed(" is a Golden Retriever");
        System.out.println(Buddy.getName() + Buddy.getBreed());
        
        Dog Charlie = new Dog("Charlie", "Bulldog");  
        Charlie.setName("Charlie");
        Charlie.setBreed(" is a Bulldog");
        System.out.println(Charlie.getName() + Charlie.getBreed());
        System.out.println();
        System.out.println(Buddy.getName() + " is now a Labrador Retriever");
        
        Dog Daisy = new Dog("Daisy", "Bulldog");
        Daisy.setName("Daisy");
        Daisy.setBreed(" is now a Bulldog");
        System.out.println(Daisy.getName() + Daisy.getBreed());
    }
}