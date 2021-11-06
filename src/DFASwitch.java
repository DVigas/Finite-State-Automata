
/** 
 * Daniel: DFA with switch
 * Task 3G: Minimised State DFA
 */
 
public class DFASwitch {

    /*    
    * Constants q0 through q8 represent states, and   
    * a private int holds the current state code.  
    */  

    private static final int q0 = 0;  
    private static final int q1 = 1;  
    private static final int q2 = 2;  
    private static final int q3 = 3; 
    private static final int q4 = 4;
    private static final int q5 = 5;
    private static final int q6 = 6;
    private static final int q7 = 7;
    private static final int q8 = 8;

    private int state; 

    /** The transition function.   
    *  @param s state code (an int)   
    *  @param c char to make a transition on   
    *  @return the next state code   
    */

    static private int delta(int s, char c) {    
        switch (s) {      
            case q0: switch (c) {               //A 
                case '0': return q1;            
                case '1': return q0;             
                default: return q8;          
            }      case q1: switch (c) {        //B     
                case '0': return q2;            
                case '1': return q0;            
                default: return q8;          
            }      case q2: switch (c) {        //C  
                case '0': return q4;            
                case '1': return q3;             
                default: return q8;          
            }      case q3: switch (c) {        //D
                case '0': return q2;            
                case '1': return q5;            
               default: return q8;          
            }       case q4: switch (c) {        //E
                case '0': return q8;            
                case '1': return q6;            
                default: return q8;          
            }       case q5: switch (c) {        //G
                case '0': return q7;            
                case '1': return q3;            
                default: return q8;          
            }       case q6: switch (c) {        //H
                case '0': return q4;            
                case '1': return q6;            
                default: return q8;          
            }       case q7: switch (c) {        //I
                case '0': return q8;            
                case '1': return q5;            
                default: return q8;          
            }       case q8: switch (c) {       //Z
                case '0': return q8;            
                case '1': return q8;            
                default: return q8;          
            }
            default: return q8;    
        } 
     } 

    /**   
    * Reset the current state to the start state.   
    */  
  public void reset() {    
      state = q0;  
    }

    /**   
     * Make one transition on each char in the given   
     * string.   
     * @param in the String to use   
     */  
    public void process(String in) {    
        for (int i = 0; i < in.length(); i++) {      
            char c = in.charAt(i);      
            state = delta(state, c);    
        }  
    }

      /** Test whether the DFA accepted the string.   
       *  @return true if the final state was accepting   
       */  
      public boolean accepted() {    
          return state==q8;  
        }
    } 