// Virtual Object
class Calculator {
    int a;
    
    public int add(int n1, int n2){
        System.out.println("in add");
    
        int r = n1 + n2;
        return r;
    }
    
}


public class Demo{
        
    public static void main(String[] args) {
        
        // Advance java 

        // Variables
        int num1 = 4;
        int num2 = 5; // Primitive Variables


        // type - Calculator variable 
        Calculator calc;  // Reference Variable 
        
        //  how we are create a object
        //  Carbon - Neutral, E-Waste

        // JVM - concume that some space  for some object 
        // Create the Object 
        // new - concume this space 
        calc = new Calculator(); //Constructor - some space create method on java 
            
        int result = calc.add(num1,num2); // call the method 
        System.out.println(result);
    }

}