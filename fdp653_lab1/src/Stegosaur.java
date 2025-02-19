/**
 * 
 */

/**
 * @author Travis
 *
 */
public abstract class Stegosaur implements Dinosaur {
  private String name;
  private boolean isVegetarian;

  /**
   * Constructor to set the name and vegetarian status of a Stegosaur
   * @param name the name of the Stegosaur
   * @param isVegetarian true if the Stegosaur is a herbivore, false if it is a carnivore
   */
  public Stegosaur(String name, boolean isVegetarian) {
    this.name = name;
    this.isVegetarian = isVegetarian;
  }

  /**
   * Getter method for the name of the Stegosaur
   * @return the name of the Stegosaur
   */
  public String getName() {
    return name;
  }

  /**
   * Getter method for the vegetarian status of the Stegosaur
   * @return true if the Stegosaur is a herbivore, false if it is a carnivore
   */
  public boolean isVegetarian() {
    return isVegetarian;
  }

  /**
   * Returns a string representation of the Stegosaur
   * @return the string representation of the Stegosaur
   */
  @Override
  public String toString() {
    return "Stegosaur:"  + getType() + " named " + name + 
           " (" + (isVegetarian ? "not carnivore" : "carnivore") + ")\n";
  }

  /**
   * Getter method for the type of the Stegosaur
   * @return the type of the Stegosaur
   */
  @Override
  public String getType() {
    return " " + getSubType();
  }

  /**
   * Abstract method to be implemented by subclasses, returns the subtype of the Stegosaur
   * @return the subtype of the Stegosaur
   */
  public abstract String getSubType();
}
