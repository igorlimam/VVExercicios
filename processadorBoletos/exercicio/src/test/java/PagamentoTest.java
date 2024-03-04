import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PagamentoTest {

    private List<Boleto> generateBoletos(){
        Double valores[] = {500.00, 400.00, 600.0};
        String data = "09/11/1989";
        String codigo[] = {"1", "2", "3"};
        List<Boleto> boletos = new ArrayList<>();
        for(int i = 0; i < 3; ++i){
            Boleto boleto = new Boleto(codigo[i], data, valores[i]);
            boletos.add(boleto);
        }
        return boletos;
    }

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

    @Test
    void realizarPagamento(){
        Pagamento pagamento = new Pagamento();
        Boleto boletoRef = generateBoletos().get(0);
        pagamento.addBoleto(boletoRef);
        assertTrue(pagamento.getTipoPagamento().get(0).equals("BOLETO"));
        assertEquals(boletoRef, pagamento.getBoletos().get(0));
    }

}
