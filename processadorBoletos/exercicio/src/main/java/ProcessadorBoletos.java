import java.util.ArrayList;
import java.util.List;

public class ProcessadorBoletos {

    private List<Fatura> faturas;
    private List<String> statusFaturas;

    public ProcessadorBoletos(){
        this.faturas = new ArrayList<Fatura>();
        this.statusFaturas = new ArrayList<>();
    }

    public List<Fatura> getFaturas(){
        return this.faturas;
    }

    public void addFatura(Fatura fatura){
        this.faturas.add(fatura);
    }

    public List<String> getStatusFaturas(){
        return this.statusFaturas;
    }

}