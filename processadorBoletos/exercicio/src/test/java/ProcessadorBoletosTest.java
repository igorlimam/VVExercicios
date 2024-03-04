package VVExercicios.processadorBoletos.exercicio.test.java;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import VVExercicios.processadorBoletos.exercicio.src.main.java.processadorboletos.*;

public class ProcessadorBoletosTest {

    @Test
    void doesClassProcessadorExist() {
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertTrue(true);
    }

    @Test
    void doesClassBoletoExist(){
        Boleto boleto = new Boleto();
        assertTrue(true);
    }
}