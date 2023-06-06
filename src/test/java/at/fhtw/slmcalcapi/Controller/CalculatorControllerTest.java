package at.fhtw.slmcalcapi.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    @Test
    void addTwoPositivInteger(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = 5, b = 6;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(11,result);
    }

    @Test
    void addTwoNegativInteger(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = -5, b = -6;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(-11,result);
    }

    @Test
    void addOnePositivAndOneNegativInteger(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = -5, b = 6;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(1,result);
    }

}