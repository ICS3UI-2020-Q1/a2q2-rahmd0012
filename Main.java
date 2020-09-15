import java.util.Scanner;

/**
 * a program to determine which integer is bigger
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // get users number
    System.out.println("Please enter an integer");
    int integer1 = input.nextInt(); 

    // get users second number
    System.out.println("Please enter a second integer");
    int integer2 = input.nextInt();

    // check to see which number is bigger
    if (integer1 > integer2){
      System.out.println("The biggest number is " + integer1);
    } else if (integer1 == integer2){ 
      System.out.println("There is no biggest number");
     } else {
      System.out.println("The biggest number is " + integer2);
    }
    
  }
}
