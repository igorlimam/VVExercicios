import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Boleto> generateBoletos(){
        Double valores[] = {500.00, 400.00, 600.0};
        String data = "09/11/1989";
        String codigo[] = {"1", "2", "3"};
        List<Boleto> boletos = new ArrayList<Boleto>();
        for(int i = 0; i < 3; ++i){
            Boleto boleto = new Boleto(codigo[i], data, valores[i]);
            boletos.add(boleto);
        }
        return boletos;
    }

    public static List<Pagamento> generatePagamentos(){
        List<Pagamento> pagamentos = new ArrayList<Pagamento>();
        for(Boleto boleto : generateBoletos()){
            pagamentos.add((new Pagamento()).addBoleto(boleto));
        }
        return pagamentos;
    }

    public static Fatura generateFatura(){
        String data = "16/06/1969";
        String nomeCliente = "Neil Armstrong";
        Double valorTotal = 1500.00;
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        return fatura;
    }

}
