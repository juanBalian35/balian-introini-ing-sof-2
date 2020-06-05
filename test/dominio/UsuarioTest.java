package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    public UsuarioTest() {
    }

    @Test
    public void testGetsSetsVaciosListaAlimentos() {
        Usuario usuario = new Usuario("", "", "", null, "");
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosRestricciones() {
        Usuario usuario = new Usuario("", "", "", null, "");
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosPreferencias() {
        Usuario usuario = new Usuario("", "", "", null, "");
        assertEquals(usuario.getPreferencias().size(), 0);
    }

    @Test
    public void testGetsSetsNullNombre() {
        Usuario usuario = new Usuario(null, null, null, null, null);
        assertEquals(usuario.getNombre(), "Nombre no ingresado");
    }

    @Test
    public void testGetsSetsNullApellido() {
        Usuario usuario = new Usuario(null, null, null, null, null);
        assertEquals(usuario.getApellido(), "Apellido no ingresado");
    }

    @Test
    public void testGetsSetsNullFechaNacimiento() {
        Usuario usuario = new Usuario(null, null, null, null, null);
        assertEquals(usuario.getFechaNacimiento(), "Fecha no ingresada");
    }

    @Test
    public void testGetsSetsNullNacionalidad() {
        Usuario usuario = new Usuario(null, null, null, null, null);
        assertEquals(usuario.getNacionalidad(), "Nacionalidad no ingresada");
    }

    @Test
    public void testGetsSetsNullListaAlimentos() {
        Usuario usuario = new Usuario(null, null, null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsNullRestricciones() {
        Usuario usuario = new Usuario(null, null, null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPreferencias() {
        Usuario usuario = new Usuario(null, null, null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

    @Test
    public void testGetsSetsFotoDePerfil(){
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));

        usuario.setFotoDePerfil(imageIcon);

        assertEquals(imageIcon, usuario.getFotoDePerfil());
    }

    @Test
    public void testGetsSetsNombre() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");
        assertEquals(usuario.getNombre(), "Rodrigo");
    }

    @Test
    public void testGetsSetsApellido() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");
        assertEquals(usuario.getApellido(), "Perez");
    }

    @Test
    public void testGetsSetsFechaNacimiento() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");
        assertEquals(usuario.getFechaNacimiento(), "03/03/2000");
    }

    @Test
    public void testGetsSetsNacionalidad() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");
        assertEquals(usuario.getNacionalidad(), "Uruguaya");
    }

    @Test
    public void testGetsSetsListaAlimentos() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsRestricciones() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");

        ArrayList<String> restricciones = new ArrayList<>();
        restricciones.add("veganismo");
        restricciones.add("celiaquismo");
        usuario.actualizarRestriccionesUsuario(usuario, restricciones);

        Assert.assertEquals(restricciones, usuario.getRestricciones());
    }

    @Test
    public void testGetsSetsPreferencias() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");

        ArrayList<String> preferencias = new ArrayList<>();
        preferencias.add("verduras");
        preferencias.add("frutas");
        usuario.actualizarPreferenciasUsuario(usuario, preferencias);

        Assert.assertEquals(preferencias, usuario.getPreferencias());
    }

    @Test
    public void testGetsSetsAlimentosIngeridos() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");

        ArrayList<Ingesta> alimentosIngeridos = new ArrayList<>();
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);

        alimentosIngeridos.add(new Ingesta(fechaDeIngesta, listaAlimentosPorFecha));
        usuario.setAlimentosIngeridos(alimentosIngeridos);

        Assert.assertEquals(alimentosIngeridos, usuario.getAlimentosIngeridos());
    }

    @Test
    public void testGetArrayPreferencias() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");

        ArrayList<String> preferencias = new ArrayList<>();
        preferencias.add("verduras");
        preferencias.add("frutas");
        usuario.setPreferencias(preferencias);

        Assert.assertArrayEquals(preferencias.toArray(), usuario.getArrayPreferencias());
    }

    @Test
    public void testGetArrayRestricciones() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");

        ArrayList<String> restricciones = new ArrayList<String>();
        restricciones.add("veganismo");
        restricciones.add("celiaquismo");
        usuario.setRestricciones(restricciones);

        Assert.assertArrayEquals(restricciones.toArray(), usuario.getArrayRestricciones());
    }

    @Test
    public void testGetArrayAlimentosIngeridos() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");

        ArrayList<Ingesta> alimentosIngeridos = new ArrayList<>();
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);

        alimentosIngeridos.add(new Ingesta(fechaDeIngesta, listaAlimentosPorFecha));
        usuario.setAlimentosIngeridos(alimentosIngeridos);

        Object[] alimentosIngeridosToString = alimentosIngeridos.stream().map(x -> x.toString()).toArray();

        Assert.assertArrayEquals(alimentosIngeridosToString, usuario.getArrayAlimentosIngeridos());
    }

    @Test
    public void testToString() {
        Usuario usuario = new Usuario("Rodrigo", "Perez", "03/03/2000", null, "Uruguaya");

        Assert.assertEquals(usuario.toString(), "Rodrigo Perez");
    }
}
