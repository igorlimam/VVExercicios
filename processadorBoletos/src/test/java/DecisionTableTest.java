import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DecisionTableTest {

    private Fatura fatura;
    private Boleto boleto;
    private Pagamento pagamento;
    @BeforeEach
    void setup(){
        this.fatura = Utils.generateFatura();
        this.boleto = Utils.generateBoletos().get(0);
        this.pagamento = new Pagamento();;
    }

    @AfterEach
    void teardown(){
        this.fatura = null;
        this.boleto = null;
        this.pagamento = null;
    }

    @Test
    void dataInválida(){
        String dataInvalida = "-21/79/-263";
        assertThrows(IllegalAccessError.class, () -> {
            boleto = new Boleto(dataInvalida, boleto.getCodigo(), boleto.getValorPago());
            fatura = new Fatura(dataInvalida, fatura.getValorTotal(), fatura.getNomeCliente());
        });
    }

    @Test
    void valoresNegativos(){
        Double valorNegativo = -1D;
        assertThrows(IllegalAccessError.class, () -> {
            boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorNegativo);
            fatura = new Fatura(fatura.getData(), valorNegativo, fatura.getNomeCliente());
        });
    }

    @Test
    void faturaQuitada(){
        Double valor = 10D;
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valor);
        fatura = new Fatura(fatura.getData(), valor, fatura.getNomeCliente());
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("PAGA", fatura.getStatus());
    }

    @Test
    void faturaNaoQuitada(){
        Double valorFatura = 10D;
        Double valorBoleto = valorFatura/2;
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
        fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("-", fatura.getStatus());
    }

}
