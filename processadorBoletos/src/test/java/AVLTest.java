import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AVLTest{

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

    //AVL
    @Test
    void faturaNegativa(){
        Double valorFatura = -1D;
        Double valorBoleto = 50D;
        assertThrows(IllegalArgumentException.class ,() -> {
            fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
            boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
            pagamento.addBoleto(boleto);
            fatura.addPagamento(pagamento);
        });
    }

    @Test
    void boletoNegativo(){
        Double valorFatura = 50D;
        Double valorBoleto = -1D;
        assertThrows(IllegalArgumentException.class ,() -> {
            fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
            boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
            pagamento.addBoleto(boleto);
            fatura.addPagamento(pagamento);
        });
    }

    @Test
    void faturaPaga(){
        Double valorBoleto = 50D;
        Double valorFatura = 50D;
        fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("PAGA", fatura.getStatus());
    }

    @Test
    void faturaPagaZero(){
        Double valorBoleto = 0D;
        Double valorFatura = 0D;
        fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("PAGA", fatura.getStatus());
    }

    @Test
    void faturaBoletoValorExtra(){
        Double valorBoleto = 50D;
        Double valorFatura = 0D;
        fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("PAGA", fatura.getStatus());
    }

    @Test
    void faturaNaoPaga(){
        Double valorBoleto = 0D;
        Double valorFatura = 50D;
        fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("-", fatura.getStatus());
    }

}