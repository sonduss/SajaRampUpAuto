package testing;

import Pages.*;
import org.testng.annotations.*;

@Test
public class CalculaterProcess {
    Calculater Calculater_;
    @BeforeTest
    public void SetUp() {
        Calculater_ = new Calculater();
        System.out.println("Started testing the great calculator app");
    }


    @Test
    public void validateAddProcess() {
        Calculater_.AddProcess(4, 6);
    }

    @Test
    public void validateSubtractProcess() {
        Calculater_.SubtractProcess(4, 6);
    }

    @Test
    //@DisplayName("Multiply two numbers")
    public void validateMultiplyProcess() {
        Calculater_.MultiplyProcess(4, 6);
    }


    @Test
    public void validateDivideProcess() {
        Calculater_.DivideProcess(4, 6);
    }

    @AfterTest
    public void Finislize() {
        System.out.println("Finished testing the great calculator app");
    }

    @BeforeClass
    public void BeforeClass_() {
        System.out.println("Starting a boring test");
    }

    @AfterClass
    public void AfterClass_() {
        System.out.println("Finished a boring test");
    }

}


