 public class Demo{
 
    public static void main(String[] args) {

        System.out.println("main method Calling");

        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        // Data type 

        num1 = 9; // reassign 
        System.out.println(num1);
        byte by = 127;
        short sh = 558;
        long l = 58541;

        float f = 5.8f;
        double d = 5.8;

        char c = 'k'; // literals 

        boolean b = true;

    
        num1 = 0b101;
        System.out.println(num1);

        int num3 = 0x7E;
        System.out.println(num3);

        double num4 = 12e10;
        System.out.println(num4);

        c = 'a';
        c++;
        System.out.println(c); // String Literals 

       // Type Convertion and Casting 

        byte b1 = 127;
   //     b1 = 157; error incompatible types
        System.out.println(b1); 
        int b2 = b1;
        System.out.println(b2);
        // byte k = b2;   incompatible type 
        byte k = (byte) b2; // Type casting 
        System.out.println(k);

        float f1 = 5.6f;
        int t = (int) f1; //Explicit 

        //Type Promotion 
        int result1 = b1*b2;
        System.out.println(result1);


        // Operatiors
        /// Addition of 2 numbers
        int result3 = num1 + num2;
        System.out.println(result3);
    
        result3 = num1 + 2;
        System.out.println(result3);
    
        num1 += 2;
        System.out.println(num1);
    
        num1++; // post - increment 
        System.out.println(num1);

        ++num1; // pre - increment 
        System.out.println(num1);

        result = num1++; // fetch the value and then increment 
        System.out.println(result);
        result = ++num1; // increment and then fetch the value
        System.out.println(result);

        
        /// Subtraction of 3 numbers
        result3 = num1 - num2;
        System.out.println(result3);

        result3 = num1 - 2;
        System.out.println(result3);
    
        num1 -= 2;
        System.out.println(num1);
    
        num1--; // decrement 
        System.out.println(num1);


        /// Division of 2 numbers
            result3 = num1 / num2;
            System.out.println(result3);

        /// Multiplication of 2 numbers
        result3 = num1 * num2;
        System.out.println(result3);

        
        result3 = num1 * 2;
        System.out.println(result3);
    
        num1 *= 2;
        System.out.println(num1);
    

        // Remainder of an Operation 
        /// Modulus Operator
        result3 = num1 % num2;
        System.out.println(result3);


        // Logical Operators
        
        /// Relational Operatiers

        int x = 6;
        int y = 5;
        int a = 5;
        int z = 9;

        boolean result4 = x < y;
        System.out.println(result4);

        result4 = x > y;
        System.out.println(result4);

        result4 = x >= y;
        System.out.println(result4);

        
        result4 = x <= y;
        System.out.println(result4);

        result4 = x == y;
        System.out.println(result4);

        result4 = x != y;
        System.out.println(result4);

        
        /// Arithmatic operation 

        boolean result5 = x > y || a == x && a < z; 
        System.out.println(result5);
        
        // conditional statements
        /// Artificial Intelligence
        /// Machine Learning 
        /// True, False 
        /// if, if else, else if

        if(x>10 && x<=20){ // condition and multiple condition 
            System.out.println("if condition true");
        }else if (y>x && y>z) {
            System.out.println("else if condition true");
        }else{
            System.out.println("if condition false");
        }


        // Ternary Operator
        

        // Loops 




    }
}