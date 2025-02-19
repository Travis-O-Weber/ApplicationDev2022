/**
 * 
 */

/**
 * @author Travis
 *
 */
/**
 * The Sauropod abstract class implements the Dinosaur interface.
 * It represents a sauropod dinosaur species and its properties.
 */
public abstract class Sauropod implements Dinosaur {
  private String name; // The name of the sauropod dinosaur
  private boolean isVegetarian; // A flag indicating whether the dinosaur is a vegetarian or not

  /**
   * Constructor for the Sauropod class, initializes the name and isVegetarian fields.
   * 
   * @param name The name of the sauropod dinosaur
   * @param isVegetarian A flag indicating whether the dinosaur is a vegetarian or not
   */
  public Sauropod(String name, boolean isVegetarian) {
    this.name = name;
    this.isVegetarian = isVegetarian;
  }

  /**
   * Getter method for the name field.
   * 
   * @return The name of the sauropod dinosaur
   */
  public String getName() {
    return name;
  }

  /**
   * Getter method for the isVegetarian field.
   * 
   * @return A flag indicating whether the dinosaur is a vegetarian or not
   */
  public boolean isVegetarian() {
    return isVegetarian;
  }

  /**
   * Overrides the toString method of the Object class.
   * Returns a string representation of the sauropod dinosaur, including its type and name.
   * 
   * @return A string representation of the sauropod dinosaur
   */
  @Override
  public String toString() {
    return "Sauropod:"  + getType() + " named " + name + 
           " (" + (isVegetarian ? "not carnivore" : "carnivore") + ")\n";
  }

  /**
   * Overrides the getType method of the Dinosaur interface.
   * Returns the type of the dinosaur, which is the subtype returned by the getSubType method.
   * 
   * @return The type of the dinosaur
   */
  @Override
  public String getType() {
    return " " + getSubType();
  }

  /**
   * Abstract method to be implemented by subclasses of the Sauropod class.
   * Returns the subtype of the dinosaur.
   * 
   * @return The subtype of the dinosaur
   */
  public abstract String getSubType();
}
