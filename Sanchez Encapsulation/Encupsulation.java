public class Encupsulation {
    private String Name;
    private String Age;
    private String Gender;
    private String Country;
    
    //Constructor
    public Encupsulation () {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.Country = Country;
    }

    //Getters and Setters
    void setName(String Name) {
        this.Name = Name;
    }

    String getName() {
        return Name;
    }
    void setAge(String string) {
        this.Age = string;
    }

    String getAge() {
        return Age;
    }
    void setGender(String Gender) {
        this.Gender = Gender;
    }

    String getGender() {
        return Gender;
    }
    void setCountry(String Country) {
        this.Country = Country;
    }

    String getCountry() {
        return Country;
    }

}
