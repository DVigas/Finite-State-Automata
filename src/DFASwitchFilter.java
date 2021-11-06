import java.io.*;
import java.util.Scanner;;

/**
 * Daniel: DFA with switch
 * Task 3G: Minimised State DFA
 */
public class DFASwitchFilter {
  public static void main(String[] args) 
        throws IOException {

    DFASwitch m = new DFASwitch(); // The DFA
    
    System.out.println("Type in the number to test: ");

    Scanner scanner= new Scanner(System.in);        
    String s = scanner.nextLine();
    
    
      m.reset();
      m.process(s);
      if (m.accepted()){
        System.out.println("This number is accepted!");
      }
      else {
        System.out.println("The number is not accepted!");    
      }    
  }
}