package dominio;

import java.util.ArrayList;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class AlimentoTest {

    public AlimentoTest() {
    }

    @Test
    public void testSetsGetsNullTipo() {
        Alimento alimentoTest = new Alimento(null, null, null, null);
        assertEquals("No definido", alimentoTest.getTipoAlimento());
    }

    @Test
    public void testSetsGetsNullListaNutrientes() {
        Alimento alimentoTest = new Alimento(null, null, null, null);
        assertEquals(0, alimentoTest.getListaNutrientesConProporcion().size());
    }

    @Test
    public void testSetsGetsDatosCorrectosNombre() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura", listaComposicion, null);
        assertEquals("Papa", alimentoTest.getNombre());
    }

    @Test
    public void testSetsGetsDatosCorrectosTipo() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura", listaComposicion, null);
        assertEquals("Verdura", alimentoTest.getTipoAlimento());
    }

    @Test
    public void testSetsGetsDatosCorrectosNutrientes() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura", listaComposicion, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion(), listaComposicion);
    }

    @Test
    public void testSetsGetsListaNutrientesDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(0, alimentoTest.getListaNutrientesConProporcion().size());
    }

    @Test
    public void testSetsGetsNombreDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals("Nombre de alimento no ingresado", alimentoTest.getNombre());
    }

    @Test
    public void testSetsGetsTipoDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals("No definido", alimentoTest.getTipoAlimento());
    }

    @Test
    public void testSetsGetsFotoAlimento() {
        Alimento alimentoTest = new Alimento("", "", null, null);

        ImageIcon foto = new ImageIcon(getClass().getResource("/Imagenes/fotoDelAlimentoEstandar.png"));
        alimentoTest.setFotoDelAlimento(foto);

        assertEquals(alimentoTest.getFotoDelAlimento(), foto);
    }

    @Test
    public void testToStringNullNombre() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals("Nombre de alimento no ingresado", alimentoTest.getNombre());
    }

    @Test
    public void testToStringNull() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals("Nombre de alimento no ingresado", alimentoTest.toString());
    }

    @Test
    public void testToStringDatosCorrectos() {
        Alimento alimentoTest = new Alimento("Papa", "", null, null);
        assertEquals("Papa", alimentoTest.toString());
    }

    @Test
    public void testEqualsIguales() {
        Alimento alimentoTest = new Alimento("Papa", "", null, null);
        Alimento alimentoTest2 = new Alimento("Papa", "", null, null);
        assertEquals(alimentoTest, alimentoTest2);
    }

    @Test
    public void testEqualsDiferentes() {
        Alimento alimentoTest = new Alimento("Rabanito", "", null, null);
        Alimento alimentoTest2 = new Alimento("Papa", "", null, null);
        boolean sonIguales = alimentoTest.equals(alimentoTest2);
        assertFalse(sonIguales);
    }

    @Test
    public void testEqualsConNull() {
        Alimento alimentoTest = new Alimento("Rabanito", "", null, null);

        assertNotEquals(alimentoTest, null);
    }

    @Test
    public void testHashCodeEsIgual(){
        Alimento alimentoTest = new Alimento("Rabanito", "", null, null);
        Alimento alimentoTest2 = new Alimento("Rabanito", "", null, null);

        assertEquals(alimentoTest.hashCode(), alimentoTest2.hashCode());
    }

    @Test
    public void testHashCodeEsDisttinto(){
        Alimento alimentoTest = new Alimento("Rabanito", "", null, null);
        Alimento alimentoTest2 = new Alimento("Papa", "", null, null);

        assertNotEquals(alimentoTest.hashCode(), alimentoTest2.hashCode());
    }
}
