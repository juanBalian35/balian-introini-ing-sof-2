package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversacionTest {
    public ConversacionTest() {
    }

    @Test
    public void testGetSetsNullUsuario() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona usuarioEsperado = new Usuario(null, null, null, null, null);
        assertEquals(conversacionATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetSetsNullProfesional() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(conversacionATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetSetsNullLsitaMensajes() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsNullToString() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }

    @Test
    public void testGetSetsDatosVaciosProfesional() {
        Persona usuario = new Usuario(null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(conversacionATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetSetsDatosVaciosListaMensajes() {
        Persona usuario = new Usuario(null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetsSetsFueAtendida() {
        Persona usuario = new Usuario("Rodrigo","Perez", "03/03/2000", null, "Uruguaya");
        Persona profesional = new Profesional("Federico", "Sanchez", "02/10/1990", null, "Licenciado en Nutrición", "03/03/2015", "Nicaragua");
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, null);
        conversacionATestear.setFueAtendidaConsulta(true);

        assertTrue(conversacionATestear.getFueAtendidaConsulta());
    }

    @Test
    public void testAgregarMensajeDeUsuario() {
        Persona usuario = new Usuario("Rodrigo","Perez", "03/03/2000", null, "Uruguaya");
        Persona profesional = new Profesional("Federico", "Sanchez", "02/10/1990", null, "Licenciado en Nutrición", "03/03/2015", "Nicaragua");
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);

        conversacionATestear.agregarMensaje("Un mensaje", false);

        assertEquals(conversacionATestear.toString(), "\nRodrigo Perez\nUn mensaje\n");
    }

    @Test
    public void testAgregarMensajeDeProfesional() {
        Persona usuario = new Usuario("Rodrigo","Perez", "03/03/2000", null, "Uruguaya");
        Persona profesional = new Profesional("Federico", "Sanchez", "02/10/1990", null, "Licenciado en Nutrición", "03/03/2015", "Nicaragua");
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);

        conversacionATestear.agregarMensaje("Un mensaje", true);

        assertEquals(conversacionATestear.toString(), "\nFederico Sanchez\nUn mensaje\n");
    }

    @Test
    public void testConversacionEquals() {
        Persona usuario = new Usuario("Rodrigo","Perez", "03/03/2000", null, "Uruguaya");
        Persona profesional = new Profesional("Federico", "Sanchez", "02/10/1990", null, "Licenciado en Nutrición", "03/03/2015", "Nicaragua");
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, null);

        Conversacion conversacionIgual = new Conversacion(usuario, profesional, null);

        assertEquals(conversacionATestear, conversacionIgual);
    }

    @Test
    public void testConversacionEqualsConNUll() {
        Persona usuario = new Usuario("Rodrigo","Perez", "03/03/2000", null, "Uruguaya");
        Persona profesional = new Profesional("Federico", "Sanchez", "02/10/1990", null, "Licenciado en Nutrición", "03/03/2015", "Nicaragua");
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, null);

        assertFalse(conversacionATestear.equals(null));
    }

    @Test
    public void testSetsGetsListaMensajes(){
        Persona usuario = new Usuario("Rodrigo","Perez", "03/03/2000", null, "Uruguaya");
        Persona profesional = new Profesional("Federico", "Sanchez", "02/10/1990", null, "Licenciado en Nutrición", "03/03/2015", "Nicaragua");
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, null);

        ArrayList<InformacionMensaje> listaMensajes = new ArrayList();
        listaMensajes.add(new InformacionMensaje("Rodrigo Perez", "Federico Sanchez", "Un mensaje"));
        conversacionATestear.setListaMensajes(listaMensajes);

        assertEquals(listaMensajes, conversacionATestear.getListaMensajes());
    }
}
