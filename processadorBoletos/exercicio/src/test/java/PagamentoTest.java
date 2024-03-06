import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
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
    }

    @Test
    void pagamentoTemBoleto(){
        Pagamento pagamento = new Pagamento();
        assertDoesNotThrow(() -> {
            pagamento.getBoleto();
        });
    }

    @Test
    void pagamentoMakeBoleto(){
        Pagamento pagamento = new Pagamento();
        assertDoesNotThrow(() -> {
            pagamento.addBoleto(new Boleto());
        });
        assertTrue(pagamento.getBoleto() instanceof Boleto);
    }

}
