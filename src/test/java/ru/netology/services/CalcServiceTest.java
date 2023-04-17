package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {

        @ParameterizedTest
        @CsvFileSource(files="src/test/resources/examples.csv")

        public void shouldCalculateForRestMonth(int expected, int income, int expenses, int threshold){
           CalcService service = new CalcService();

           /*int income = 10_000;
           int expenses = 3_000;
           int threshold = 20_000;
           int expected = 3;*/
           int actual = service.calculate(income, expenses, threshold);

           Assertions.assertEquals(expected, actual);

    }
    }
  /*  @Test
    void shouldCalculateForManager(){
        CalcService service = new CalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForClerk(){
        CalcService service = new CalcService();

        int income = 10_000;
        int expenses = 5_000;
        int threshold = 50_000;
        int expected = 8;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }*/


