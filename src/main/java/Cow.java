/**
 * 
 * @author Aarooran Anankan
 * @version 1.0
 */

class Cow {
    
    //Instance Variables
    private String name;
    private int age;
    private double weight;

    /**
     * Constructor that sets the values of the instance variables to that of the parameters
     * @param name - the name of the cow
     * @param age - the age of the cow
     * @param weight - the weight of the cow
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * A getter that gets the cow's name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * A getter that gets the cow's age
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**
     * A getter that gets the cow's weight
     * @return
     */
    public double getWeight() {
        return this.weight;
    }

    @Override
    /**
     * Returns "name, age - weight"
     */
    public String toString() {
        return this.name + ", " + this.age + " - " + this.weight;
    }

    @Override
    /**
     * Returns true if the student number of two students match, false otherwise
     */
    public boolean equals(Object obj) {
        
        if(obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }
        
        Cow cow = (Cow)obj;
        if(cow.getName().equals(this.name) && cow.getAge()==(this.age) && cow.getWeight()==(this.weight)) {
            return true;
        }
        
        return false;
    }
}
