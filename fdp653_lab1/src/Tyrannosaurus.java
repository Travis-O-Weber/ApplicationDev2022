/**
 * 
 */

/**
 * @author Travis
 *
 */
/**
 * Tyrannosaurus is a class that extends Theropod
 */
public class Tyrannosaurus extends Theropod {
  
  /**
   * Constructor that sets the name and vegetarian status of the Tyrannosaurus
   * 
   * @param name - the name of the Tyrannosaurus
   * @param isVegetarian - the vegetarian status of the Tyrannosaurus
   */
  public Tyrannosaurus(String name, boolean isVegetarian) {
    super(name, isVegetarian);
  }

  /**
   * Overrides the getSubType() method from Theropod
   * 
   * @return the sub-type of the dinosaur, "Tyrannosaurus" in this case.
   */
  @Override
  public String getSubType() {
    return "Tyrannosaurus";
  }
}
