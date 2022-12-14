package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NumberTest {
    private Number number;

    @BeforeEach
    public void setup() {
        System.out.println("");
        number = new Number();
    }

    @DisplayName("Teste de numeros primos")
    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void priTest(int arg) {
        assertTrue(number.isPrime(arg));
    }


    @DisplayName("Teste de numeros pares")
    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void parTest(int arg) {assertTrue(number.isEven(arg));
    }
    @DisplayName("Teste de numeros multiplos")
    @ParameterizedTest
    @ValueSource(ints = { 23, 46, 115, 184, 207, 230})
    public void isMultiple(int arg){
        boolean isMultiple = number.isMultiple(arg,4);
        assertTrue(isMultiple);
    }
}
