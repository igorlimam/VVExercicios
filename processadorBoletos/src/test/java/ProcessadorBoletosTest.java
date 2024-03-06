package test.java;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import processadorBoletos.src.ProcessadorBoletos;

class ProcessadorBoletosTest {

    @Test
    void doesClassExist() {
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertTrue(true);
    }
}