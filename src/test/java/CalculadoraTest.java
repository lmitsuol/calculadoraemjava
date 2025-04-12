
import com.mycompany.calculadoraemjava.Calculadora;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora(4.0, 2.0); // valores reais para testar
    }

    @AfterEach
    public void tearDown() {
        calculadora = null;
    }

    @Test
    public void testGetValorA() {
        assertEquals(4.0, calculadora.getValorA(), 0.0001);
    }

    @Test
    public void testGetValorB() {
        assertEquals(2.0, calculadora.getValorB(), 0.0001);
    }

    @Test
    public void testSetValorA() {
        calculadora.setValorA(10.0);
        assertEquals(10.0, calculadora.getValorA(), 0.0001);
    }

    @Test
    public void testSetValorB() {
        calculadora.setValorB(5.0);
        assertEquals(5.0, calculadora.getValorB(), 0.0001);
    }

    @Test
    public void testGetSoma() {
        assertEquals(6.0, calculadora.getSoma(), 0.0001);
    }

    @Test
    public void testGetDiferenca() {
        assertEquals(2.0, calculadora.getDiferenca(), 0.0001);
    }

    @Test
    public void testGetProduto() {
        assertEquals(8.0, calculadora.getProduto(), 0.0001);
    }

    @Test
    public void testGetQuociente() {
        assertEquals(2.0, calculadora.getQuociente(), 0.0001);
    }

    @Test
    public void testDivisaoPorZero() {
        calculadora.setValorB(0.0);
        assertThrows(ArithmeticException.class, () -> {
            calculadora.getQuociente();
        });
    }
}
