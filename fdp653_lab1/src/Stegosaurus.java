/**
 * 
 */

/**
 * @author Travis
 *
 */
/**
 * Stegosaurus class that extends from the Stegosaur class.
 */
public class Stegosaurus extends Stegosaur {

  /**
   * Constructor to create a Stegosaurus object with name and vegetarian flag.
   * 
   * @param name The name of the Stegosaurus.
   * @param isVegetarian Flag to represent if the Stegosaurus is vegetarian or not.
   */
  public Stegosaurus(String name, boolean isVegetarian) {
    super(name, isVegetarian);
  }

  /**
   * Override method to get the sub-type of the dinosaur as "Stegosaurus".
   * 
   * @return Returns a string "Stegosaurus" as the sub-type.
   */
  @Override
  public String getSubType() {
    return "Stegosaurus";
  }
}