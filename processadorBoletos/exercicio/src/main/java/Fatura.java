import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private String data;
    private Double valorTotal;
    private String nomeCliente;
    private List<Pagamento> pagamentos;

    public Fatura(){
        this.pagamentos = new ArrayList<Pagamento>();
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
    public List<Pagamento> getPagamentos(){
        return this.pagamentos;
    }

    public void addPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }
}
