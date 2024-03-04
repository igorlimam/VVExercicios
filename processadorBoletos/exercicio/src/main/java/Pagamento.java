import java.util.ArrayList;
import java.util.List;

public class Pagamento {

    private List<Fatura> faturas;

    public Pagamento(){
        this.faturas = new ArrayList<>();
    }

    public List<Fatura> getFaturas() {
        return this.faturas;
    }

    public void addFatura(Fatura fatura) {
        this.faturas.add(fatura);
    }

}
