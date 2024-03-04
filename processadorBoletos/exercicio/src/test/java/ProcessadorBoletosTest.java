import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProcessadorBoletosTest {

    @Test
    void classProcessadorExiste() {
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertTrue(true);
    }

    @Test
    void classBoletoExiste(){
        assertDoesNotThrow(() -> {
            new Boleto();
        });
    }

    @Test
    void classFaturaExiste(){
        assertDoesNotThrow(() -> {
            new Fatura();
        });
    }

    @Test
    void faturaTemData(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.getData();
        });
    }



}