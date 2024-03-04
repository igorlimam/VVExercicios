import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    private List<String> tipoPagamento; //sempre boleto
    private List<Boleto> boletos;

    public Pagamento(){
        this.boletos = new ArrayList<>();
        this.tipoPagamento = new ArrayList<>();
    }

    public List<Boleto> getBoletos() {
        return this.boletos;
    }

    public void addBoleto(Boleto boleto) {
        this.boletos.add(boleto);
        this.tipoPagamento.add("BOLETO");
    }

    public List<String> getTipoPagamento() {
        return this.tipoPagamento;
    }

}
