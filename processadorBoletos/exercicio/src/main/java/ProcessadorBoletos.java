import java.util.ArrayList;
import java.util.List;

public class ProcessadorBoletos {

    private List<Fatura> faturas;

    public ProcessadorBoletos(){
        this.faturas = new ArrayList<Fatura>();
    }

    public List<Fatura> getFaturas(){
        return this.faturas;
    }

    public void addFatura(Fatura fatura){
        this.faturas.add(fatura);
    }

}