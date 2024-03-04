import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ProcessadorBoletosTest {

    @Test
    void classProcessadorExiste() {
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertTrue(true);
    }

    @Test
    void processadorTemListaDeFaturas(){
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertDoesNotThrow(() -> {
            processador.getFaturas();
        });
        assertTrue(processador.getFaturas() instanceof List<?>);
    }

    @Test
    void processadorComecaComListaVazia(){
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertEquals(0, processador.getFaturas().size());
    }

    @Test
    void processadorAddFatura(){
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertDoesNotThrow(() -> {
            processador.addFatura(new Fatura());
        });
        assertEquals(1, processador.getFaturas().size());
    }

    @Test
    void processadorTemListaDeSituacaoDasFaturas(){
        ProcessadorBoletos processador = new ProcessadorBoletos();
        assertDoesNotThrow(() -> {
            processador.getStatusFaturas();
        });
        assertTrue(processador.getStatusFaturas() instanceof List<?>);
    }

}