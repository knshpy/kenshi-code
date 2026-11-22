/*
 * Class for animals
 * demo of encapsulation and abstraction
 */
class Animal {
    private String name;

    // Construct animal
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return formatName();
    }

    // Helper method keep private to hide logic 
    private String formatName() {
        return name;
    }

    // Default sounds for animal
    public void makeSounds() {
        System.out.println("Animal sounds...");
    }
}
/*
 * Represent cat 
 * Inherit from animal
 */
class catSounds extends Animal {

    // super refers to superclass or parent class
    public catSounds(String name) {
        super(name); 
    }    

    @Override 
    public void makeSounds() {
        System.out.println("Meow!");  
    }
} 
/*
 * Represent tiger 
 * Inherit from animal
 * 
 */       
class tigerSounds extends Animal {

    public tigerSounds(String name) {
        super(name);
    }
    // example inheritance from animal's makeSounds
    @Override 
    public void makeSounds() {
        System.out.println("Roar!");
    }

}
/*
 * Main here to execute program
 */

public class zoo {
    public static void main(String[] args) {
        Animal Tiger = new tigerSounds("Tiger");
        Animal Cat = new catSounds("Cat");

        System.out.print(Tiger.getName() + " ");
        Tiger.makeSounds();

        System.out.print(Cat.getName() + " ");
        Cat.makeSounds();
    }
}