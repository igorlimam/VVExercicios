public class Boleto {

    private String codigo;
    private String data;
    private Double valorPago;

    public Boleto(String codigo, String data, Double valorPago) {
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }

    public Boleto(){}

    public String getCodigo() {
        return this.codigo;
    }

    public String getData(){
        return this.data;
    }

    public Double getValorPago(){
        return this.valorPago;
    }

}
