import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PagamentoTest {
    @Test
    void classPagamentoExiste(){
        assertDoesNotThrow(() -> {
            new Pagamento();
        });
    }
}
