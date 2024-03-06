import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private String data;
    private Double valorTotal;
    private String nomeCliente;
    private List<Pagamento> pagamentos;
    private String status;

    public Fatura(){
        this.pagamentos = new ArrayList<Pagamento>();
        this.status = "-";
    }

    public Fatura(String data, Double valorTotal, String nomeCliente){
        this();
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
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

    private Double pagamentosSum(){
        return pagamentos.stream().mapToDouble(obj -> obj.getBoleto().getValorPago()).sum();

    }

    public void addPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.status = pagamentosSum().compareTo(this.valorTotal) >= 0 ? "PAGA" : "-";
    }

    public String getStatus(){
        return this.status;
    }
}
