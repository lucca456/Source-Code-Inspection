package test;
import br.calebe.ticketmachine.core.Troco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Iterator;

class TrocoTest {

    @Test
    void testConstructor() {
        Troco troco = new Troco(72); // Exemplo de valor
        assertNotNull(troco.getIterator());
    }
}