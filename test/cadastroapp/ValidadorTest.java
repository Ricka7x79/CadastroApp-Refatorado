package cadastroapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorTest {

    @Test
    public void deveRetornarTrueQuandoCpfTem11Digitos() {
        Validador validador = new Validador();
        boolean resultado = validador.cpfValido("12345678901");
        assertTrue(resultado);
    }

    @Test
    public void deveRetornarFalseQuandoCpfTemMenosDe11Digitos() {
        Validador validador = new Validador();
        boolean resultado = validador.cpfValido("12345");
        assertFalse(resultado);
    }

    @Test
    public void deveRetornarFalseQuandoCpfForNulo() {
        Validador validador = new Validador();
        boolean resultado = validador.cpfValido(null);
        assertFalse(resultado);
    }
}