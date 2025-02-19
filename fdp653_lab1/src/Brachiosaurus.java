/**
 * 
 */

/**
 * @author Travis
 *
 */
/**
 * Brachiosaurus extends the Sauropod class and implements the Dinosaur interface.
 * It represents a Brachiosaurus dinosaur.
 */
public class Brachiosaurus extends Sauropod {
  /**
   * Constructor that takes the name and dietary information of the Brachiosaurus dinosaur
   * and passes it to the parent class.
   * @param name name of the Brachiosaurus dinosaur
   * @param isVegetarian whether the Brachiosaurus dinosaur is vegetarian or not
   */
  public Brachiosaurus(String name, boolean isVegetarian) {
    super(name, isVegetarian);
  }

  /**
   * Returns the sub-type of the dinosaur, in this case "Brachiosaurus".
   * @return sub-type of the dinosaur as a String
   */
  @Override
  public String getSubType() {
    return "Brachiosaurus";
  }
}
