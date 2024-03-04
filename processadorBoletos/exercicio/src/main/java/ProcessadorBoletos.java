import java.util.ArrayList;
import java.util.List;

public class ProcessadorBoletos {

    private List<Boleto> boletos;

    public ProcessadorBoletos(){
        this.boletos = new ArrayList<Boleto>();
    }

    public List<Boleto> getBoletos(){
        return this.boletos;
    }

}