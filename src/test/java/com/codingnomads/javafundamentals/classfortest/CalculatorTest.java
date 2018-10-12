package com.codingnomads.javafundamentals.classfortest;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void whenMultiplyingByZero_shouldReturnZero() {

        double multiplicationResult = calculator.multiply(32, 0);

        assertThat(multiplicationResult).isEqualTo(0);
    }

    @Test
    public void whenMultiplyingTwoNaturalNumbers_shouldSuccess() {
        //given
        Calculator calculator = new Calculator();

        //when
        double multiplicationResult = calculator.multiply(1, 2);

        //then
        assertThat(multiplicationResult).isEqualTo(2);
    }

    @Test
    public void whenMultiplyingTwoFractionalNumbers_shouldSuccess() {

        double multiplicationResult = calculator.multiply(1.2, 2.7);

        assertThat(multiplicationResult).isEqualTo(3.24);
    }

    @Test
    public void whenDividingTwoNaturalNumbers_shouldSuccess() {

        double divisionResult = calculator.divide(10, 2);

        assertThat(divisionResult).isEqualTo(5);
    }

    @Test(expected = ArithmeticException.class)
    public void whenDividingByZero_shouldThrowAnException() {

        calculator.divide(10, 0);
    }

    @Test()
    public void whenDividingByZero_shouldThrowAnExceptionWithAssertj() {

        Throwable thrown = catchThrowable(() -> calculator.divide(10, 0));

        assertThat(thrown)
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("/ by zero");
    }


}