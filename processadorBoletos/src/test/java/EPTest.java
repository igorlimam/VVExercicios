import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class EPTest {

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

    //Equivalence Partitioning

    @Test
    void faturaMaior(){
        Double valorBoleto = 2D;
        Double valorFatura = 3D;
        fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("-", fatura.getStatus());
    }

    @Test
    void faturaIgual(){
        Double valorBoleto = 3D;
        Double valorFatura = 3D;
        fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("PAGA", fatura.getStatus());
    }

    @Test
    void faturaMenor(){
        Double valorBoleto = 3D;
        Double valorFatura = 2D;
        fatura = new Fatura(fatura.getData(), valorFatura, fatura.getNomeCliente());
        boleto = new Boleto(boleto.getData(), boleto.getCodigo(), valorBoleto);
        pagamento.addBoleto(boleto);
        fatura.addPagamento(pagamento);
        assertEquals("PAGA", fatura.getStatus());
    }

}
