package dominio;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComposicionAlimentoTest {
    public ComposicionAlimentoTest() {
    }

    @Test
    public void testGetsSetsNull() {
        ComposicionAlimento composicion = new ComposicionAlimento(null, 0);
        assertEquals("No definido", composicion.getNutriente());
    }

    @Test
    public void testGetsSestNegativo() {
        ComposicionAlimento composicion = new ComposicionAlimento("", -5);
        assertEquals(1, composicion.getProporcion(), 2);
    }

    @Test
    public void testGetsSestPositivo() {
        ComposicionAlimento composicion = new ComposicionAlimento("Papa", 5);
        assertEquals(5, composicion.getProporcion(), 2);
    }

    @Test
    public void testGetsSestDatoCorrecto() {
        ComposicionAlimento composicion = new ComposicionAlimento("Papa", 5);
        assertEquals("Papa", composicion.getNutriente());
    }
}
