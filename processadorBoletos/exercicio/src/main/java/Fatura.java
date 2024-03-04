import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private String data;
    private Double valorTotal;
    private String nomeCliente;
    private List<Boleto> boletos;

    public Fatura(){
        this.boletos = new ArrayList<Boleto>();
    }

    public String getData(){
        return this.data;
    }
    public Double getValorTotal() {
        return this.valorTotal;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public List<Boleto> getBoletos(){
        return this.boletos;
    }

    public void addBoleto(Boleto boleto) {
        this.boletos.add(boleto);
    }
}
