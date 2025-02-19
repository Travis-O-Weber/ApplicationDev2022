/**
 * 
 */

/**
 * @author Travis
 *
 */
public abstract class Theropod implements Dinosaur {
  private String name;
  private boolean isVegetarian;

  /**
   * Constructor to set the name and vegetarian status of a Theropod
   * @param name the name of the Theropod
   * @param isVegetarian true if the Theropod is a herbivore, false if it is a carnivore
   */
  public Theropod(String name, boolean isVegetarian) {
    this.name = name;
    this.isVegetarian = isVegetarian;
  }

  /**
   * Getter method for the name of the Theropod
   * @return the name of the Theropod
   */
  public String getName() {
    return name;
  }

  /**
   * Getter method for the vegetarian status of the Theropod
   * @return true if the Theropod is a herbivore, false if it is a carnivore
   */
  public boolean isVegetarian() {
    return isVegetarian;
  }

  /**
   * Returns a string representation of the Theropod
   * @return the string representation of the Theropod
   */
  @Override
  public String toString() {
    return "Theropod:"  + getType() + " named " + name + 
           " (" + (isVegetarian ? "not carnivore" : "carnivore") + ")\n";
  }

  /**
   * Getter method for the type of the Theropod
   * @return the type of the Theropod
   */
  @Override
  public String getType() {
    return " " + getSubType();
  }

  /**
   * Abstract method to be implemented by subclasses, returns the subtype of the Theropod
   * @return the subtype of the Theropod
   */
  public abstract String getSubType();
}
