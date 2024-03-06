import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class BoletoTest {
    @Test
    void classBoletoExiste(){
        assertDoesNotThrow(() -> {
            new Boleto();
        });
    }

    @Test
    void boletoTemCodigo(){
        Boleto boleto = new Boleto();
        assertDoesNotThrow(() -> {
            boleto.getCodigo();
        });
    }

    @Test
    void boletoTemData(){
        Boleto boleto = new Boleto();
        assertDoesNotThrow(() -> {
            boleto.getData();
        });
    }

    @Test
    void boletoTemValorPago(){
        Boleto boleto = new Boleto();
        assertDoesNotThrow(() -> {
            boleto.getValorPago();
        });
    }

}
