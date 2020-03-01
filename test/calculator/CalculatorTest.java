package calculator;
                
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    //Called once, after class init, before executing tests
    //major set up, connect to the db
    @BeforeClass
    public static void setUpClass() {
        System.out.println("hello, this is before class");
    }
    
    //Called once, after all tests are executed
    //major clean up, disconnect from the db
    @AfterClass
    public static void tearDownClass() {
        System.out.println("hello, this is after class");
    }
    
    //this method is called before each test
    //set up for individual tests - i.e. prepare db, initialize objects etc.
    @Before
    public void setUp() {
        System.out.println("hello, this is before method");
    }
    
    //This method is called after each test
    //clean up after each test
    @After
    public void tearDown() {
        System.out.println("hello, this is after method");
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        assertEquals(6, Calculator.add(5, 1));       
    }
    
    @Test
    public void testAddNegativeNumbers(){
        assertEquals(-10, Calculator.add(-6, -4));
    }
    
    @Test
    public void testSub(){
        int a = 10;
        int b = 7;
        int expectedResult = 3;
        int actualResult = Calculator.sub(a, b);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testMultiply(){
        int a = 5;
        int b = 3;
        int expectedResult = 15;
        int actualResult = Calculator.multiply(a, b);
        assertEquals(expectedResult, actualResult);   
    }
    
    @Test
    public void testSquare(){
        int a = 4;
        int expectedResult = 16;
        int actualResult = Calculator.square(a);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testDivide(){
        int a = 15;
        int b = 3;
        int expectedResult = 5;
        int actualResult = Calculator.divide(a, b);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero(){
        int a = 15;
        int b = 0;
        int actualResult = Calculator.divide(a, b);
    }
}
