
public class Velociraptor extends Theropod {

  // Constructor that takes name and isVegetarian as arguments and passes them to super class
  public Velociraptor(String name, boolean isVegetarian) {
    super(name, isVegetarian);
  }

  // Overrides the getSubType method from Theropod to return Velociraptor as sub type
  @Override
  public String getSubType() {
    return "Velociraptor";
  }
}
