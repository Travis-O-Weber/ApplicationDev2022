/**
 * 
 */

/**
 * @author Travis
 *
 */
/**
 * Dinosaur interface defines basic behaviors and information of dinosaurs.
 */
public interface Dinosaur {
  /**
   * Returns a string representation of the dinosaur.
   * @return string representation of the dinosaur
   */
  public String toString();
  
  /**
   * Indicates if the dinosaur is a carnivore or not.
   * @return true if the dinosaur is a herbivore, false otherwise
   */
  public boolean isVegetarian();
  
  /**
   * Returns the name of the dinosaur.
   * @return name of the dinosaur
   */
  public String getName();
  
  /**
   * Returns the type of the dinosaur.
   * @return type of the dinosaur
   */
  public String getType();
}
