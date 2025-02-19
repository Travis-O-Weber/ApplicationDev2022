/**
 * 
 */

/**
 * @author Travis
 *
 */
/**
 * Class Apatosaurus represents a dinosaur of the subtype Apatosaurus, which extends the Sauropod class.
 * 
 * @author OpenAI
 *
 */
public class Apatosaurus extends Sauropod 
{
	  /**
	   * Constructor for Apatosaurus, which calls the constructor of the superclass (Sauropod) and sets its name and vegetarian status.
	   * 
	   * @param name the name of the Apatosaurus
	   * @param isVegetarian indicates if the Apatosaurus is a vegetarian
	   */
	  public Apatosaurus(String name, boolean isVegetarian) {
		    super(name, isVegetarian);
		  }

	  /**
	   * Returns the subtype of the Apatosaurus, which is "Apatosaurus".
	   * 
	   * @return the subtype of the Apatosaurus
	   */
		  @Override
		  public String getSubType() {
		    return "Apatosaurus";
		  }
	
}
