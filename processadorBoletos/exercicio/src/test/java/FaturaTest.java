import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FaturaTest {

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
    void faturaTemListaDeBoletos(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.getBoletos();
        });
        assertTrue(fatura.getBoletos() instanceof List<?>);
    }

    @Test
    void faturaComecaComListaVazia(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.getBoletos();
        });
        assertEquals(0, fatura.getBoletos().size());
    }

    @Test
    void faturaAddBoleto(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.addBoleto(new Boleto());
        });
        assertEquals(1, fatura.getBoletos().size());
    }

}
