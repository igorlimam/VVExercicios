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
    void pagamentoTemListaDeFaturas(){
        Pagamento pagamento = new Pagamento();
        assertDoesNotThrow(() -> {
            pagamento.getFaturas();
        });
        assertTrue(pagamento.getFaturas() instanceof List<?>);
    }

    @Test
    void pagamentoComecaComListaVazia(){
        Pagamento pagamento = new Pagamento();
        assertEquals(0, pagamento.getFaturas().size());
    }

    @Test
    void pagamentoAddFatura(){
        Pagamento pagamento = new Pagamento();
        assertDoesNotThrow(() -> {
            pagamento.addFatura(new Fatura());
        });
        assertEquals(1, pagamento.getFaturas().size());
    }

}
