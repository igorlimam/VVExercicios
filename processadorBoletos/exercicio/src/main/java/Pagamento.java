public class Pagamento {
    private String tipoPagamento; //sempre boleto
    private Boleto boleto;

    public Boleto getBoleto() {
        return this.boleto;
    }

    public Pagamento addBoleto(Boleto boleto) {
        this.boleto = boleto;
        this.tipoPagamento = "BOLETO";
        return this;
    }

    public String getTipoPagamento() {
        return this.tipoPagamento;
    }

}
