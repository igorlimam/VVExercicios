import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PagamentoTest {
    @Test
    void classPagamentoExiste(){
        assertDoesNotThrow(() -> {
            new Pagamento();
        });
    }

    @Test
    void pagamentoTemTipoPagamento(){
        Pagamento pagamento = new Pagamento();
        assertDoesNotThrow(() -> {
            pagamento.getTipoPagamento();
        });
        assertTrue(pagamento.getTipoPagamento() instanceof List<?>);
    }

    @Test
    void pagamentoTemListaDeBoleto(){
        Pagamento pagamento = new Pagamento();
        assertDoesNotThrow(() -> {
            pagamento.getBoletos();
        });
        assertTrue(pagamento.getBoletos() instanceof List<?>);
    }

    @Test
    void pagamentoComecaComListaVazia(){
        Pagamento pagamento = new Pagamento();
        assertEquals(0, pagamento.getBoletos().size());
    }

    @Test
    void pagamentoAddBoleto(){
        Pagamento pagamento = new Pagamento();
        assertDoesNotThrow(() -> {
            pagamento.addBoleto(new Boleto());
        });
        assertEquals(1, pagamento.getBoletos().size());
    }

}
