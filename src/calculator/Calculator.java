package calculator;

import static java.lang.Math.sqrt;

public class Calculator {

    public static int add (int a, int b){
        int result = a + b;
        return result;
    }
    
    public static int sub (int a, int b){
        return a - b;
    }
    
    public static int multiply (int a, int b){
        return a * b;
    }
    
    public static int divide (int a, int b){
        return a / b;
    }
    
    public static int square (int a){
        return a*a;
    }
    
    public static double squareRoot(int a){
        return sqrt(a);
    }
    
}
