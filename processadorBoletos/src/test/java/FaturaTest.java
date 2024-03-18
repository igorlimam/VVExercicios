import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
    void faturaTemListaDePagamento(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.getPagamentos();
        });
        assertTrue(fatura.getPagamentos() instanceof List<?>);
    }

    @Test
    void faturaTemStatus(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.getStatus();
        });
    }

    @Test
    void faturaComecaComListaVazia(){
        Fatura fatura = new Fatura();
        assertDoesNotThrow(() -> {
            fatura.getPagamentos();
        });
        assertEquals(0, fatura.getPagamentos().size());
    }

    @Test
    void faturaAddPagamento(){
        Fatura fatura = Utils.generateFatura();
        assertDoesNotThrow(() -> {
            fatura.addPagamento(Utils.generatePagamentos().get(0));
        });
        assertEquals(1, fatura.getPagamentos().size());
    }

    @Test
    void realizarPagamentoTipoBoleto(){
        Fatura fatura = Utils.generateFatura();
        fatura.addPagamento(Utils.generatePagamentos().get(0));
        assertEquals("BOLETO", fatura.getPagamentos().get(0).getTipoPagamento());
    }

    @Test
    void pagarFaturaParcialmente(){
        Fatura fatura = Utils.generateFatura();
        Pagamento pagamento = Utils.generatePagamentos().get(0);
        fatura.addPagamento(pagamento);
        assertEquals("-", fatura.getStatus());
    }

    @Test
    void pagarFaturaTotalmente(){
        Fatura fatura = Utils.generateFatura();
        for(Pagamento pagamento:Utils.generatePagamentos()){
            fatura.addPagamento(pagamento);
        }
        assertEquals("PAGA", fatura.getStatus());
    }

}
