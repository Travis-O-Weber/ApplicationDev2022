/**
 * 
 */

/**
 * @author Travis
 *
 */
public class Park {
  private String name; //name of the park
  private int size; //size of the park
  private Dinosaur[] dinosaurs; //array to store dinosaurs
  private int dinoCount; //count of the dinosaurs in the park
  
  // constructor to initialize the park
  public Park(String name, int size) {
    this.name = name;
    this.size = size;
    this.dinosaurs = new Dinosaur[10];
    this.dinoCount = 0;
  }
  
  //toString method to display the details of the park
  @Override
  public String toString() {
    String s = "Welcome to " + name + "!\n" + "- - - - - - - - - - - - - \n";//+"Park Size: " + size + "\n";
    
    // Add information for each dinosaur
    for (int i = 0; i < dinoCount; i++) {
      s += dinosaurs[i].toString(); //format error
    }
    
    return s;
  }
  
  // method to add dinosaurs to the park
  public void addDino(Dinosaur dinosaur) {
    if (dinoCount < dinosaurs.length) {
      dinosaurs[dinoCount++] = dinosaur;
    } else {
      System.out.println("The park is full, cannot add more dinosaurs.");
    }
  }
  
  // getters and setters for name and size
}
