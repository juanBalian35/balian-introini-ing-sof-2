package dominio;

import javax.swing.ImageIcon;
import org.junit.Assert;
import org.junit.Test;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class PlanAlimentacionTest {

    public PlanAlimentacionTest() {
    }

    @Test
    public void testGetsSetsNullToString() {
        String nombrePlan = null;
        Usuario usuario = null;
        Profesional profesional = null;
        boolean fueAtendido = false;
        String[][] planDiaADia = null;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        assertEquals(planATestear.toString(), "Plan de alimentación | " + planATestear.getFecha().format(formatter));
    }

    @Test
    public void testGetsSetsDatosVaciosNombre() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        assertEquals(planATestear.toString(), "Plan de alimentación | " + planATestear.getFecha().format(formatter));
    }

    @Test
    public void testGetsSetsDatosVaciosUsuario() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        Usuario usuarioEsperado = new Usuario("", "", null, null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosProfesional() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        Profesional profesionalEsperado = new Profesional("", "", null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosFueAtendido() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }

    @Test
    public void testGetsSetsDatosVaciosPlanDiaADia() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        String[][] planEsperado = new String[0][0];
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosToString() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        assertEquals(planATestear.toString(), "Plan de alimentación | " + planATestear.getFecha().format(formatter));
    }

    @Test
    public void testGetsSetsDatosCorrectosNombre() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        assertEquals(planATestear.getNombreDelPlan(), nombrePlan);
    }

    @Test
    public void testGetsSetsDatosCorrectosProfesional() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        Profesional profesionalEsperado = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosFueAtendido() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }

    @Test
    public void testGetsSetsDatosCorrectosUsuario() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        Usuario usuarioEsperado = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosPlanDiaADia() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planDiaADia);
    }

    @Test
    public void testGetsSetsDatosCorrectosToString() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        assertEquals(planATestear.toString(), nombrePlan + " | " + planATestear.getFecha().format(formatter));
    }

    @Test
    public void testEqualsIguales() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);

        assertEquals(planATestear, planAComparar);
    }

    @Test
    public void testEqualsDiferentes() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        String nombrePlan2 = "Plan 2 Dias UP";
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan2, usuario, profesional,
                fueAtendido, planDiaADia, null);
        assertNotEquals(planATestear, planAComparar);
    }
    @Test
    public void testEqualsConNull() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);

        assertNotEquals(planATestear, null);
    }

    @Test
    public void testHashCodeEsIgual(){
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);

        assertEquals(planATestear.hashCode(), planAComparar.hashCode());
    }

    @Test
    public void testHashCodeEsDisttinto(){
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo");
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia, null);
        String nombrePlan2 = "Plan 2 Dias UP";
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan2, usuario, profesional,
                fueAtendido, planDiaADia, null);

        assertNotEquals(planATestear.hashCode(), planAComparar.hashCode());
    }
}
