import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

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

    @Test
    void faturaTemValorTotal(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.getValorTotal();
        });
    }

    @Test
    void faturaTemNomeCliente(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.getNomeCliente();
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

    @Test
    void processadorTemListaDeFaturas(){
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertDoesNotThrow(() -> {
            processador.getFaturas();
        });
        assertTrue(processador.getFaturas() instanceof List<?>);
    }

    @Test
    void processadorComecaComListaVazia(){
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertEquals(0, processador.getFaturas().size());
    }

    @Test
    void processadorAddFatura(){
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertDoesNotThrow(() -> {
            processador.addFatura(new Fatura());
        });
        assertEquals(1, processador.getFaturas().size());
    }

}