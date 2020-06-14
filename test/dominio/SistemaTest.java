package dominio;

import dominio.Sistema.DiasDeLaSemana;
import dominio.Sistema.IngestasPorDia;
import dominio.Sistema.Paises;
import dominio.Sistema.Preferencias;
import dominio.Sistema.Restricciones;
import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {
    public SistemaTest() {

    }


    @Test
    public void testGetsSetsNullListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(0, sistemaATestear.getListaAlimentos().size());
    }

    @Test
    public void testGetsSetsNullListaPlanes() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(0, sistemaATestear.getListaPlanesAlimentacion().size());
    }

    @Test
    public void testGetsSetsNullListaConversaciones() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(0, sistemaATestear.getListaConversaciones().size());
    }

    @Test
    public void testGetsSetsNullPersonaLogueada() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona personaLogueadaEsperada = new Usuario(null, null, null, null, null);
        assertEquals(null, sistemaATestear.getPersonaLogueada());
    }

    @Test
    public void testGetsSetsDatosVaciosListaUsuarios() {
        Sistema sistemaATestear = new Sistema();
        assertEquals(0, sistemaATestear.getListaUsuarios().size());
    }

    @Test
    public void testGetsSetsDatosVaciosListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario(null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(0, sistemaATestear.getListaAlimentos().size());
    }

    @Test
    public void testAgregarMensajeDeUsuarioConversacion() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional = new Profesional("Sandra", "Pazos", null, null, null, null, null);

        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional);

        sistemaATestear.crearConversacion(usuario, profesional, "Un mensaje", true);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion("Martin Gómez", "Sandra Pazos", "aa", false, false);

        assertTrue(pudeAgregarMensaje);
    }

    @Test
    public void testAgregarMensajeDePRofesionalConversacion() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional = new Profesional("Sandra", "Pazos", null, null, null, null, null);

        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional);

        sistemaATestear.crearConversacion(usuario, profesional, "Un mensaje", false);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion("Sandra Pazos","Martin Gómez",  "aa", true, true);

        assertTrue(pudeAgregarMensaje);
    }

    @Test
    public void testGetNombresProfesionalesSinConversacionConUsuarioEstandoLogueado()
    {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);

        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional1);
        sistemaATestear.crearConversacion(usuario, profesional1, "Un mensaje", false);
        sistemaATestear.setPersonaLogueada(profesional1);
        sistemaATestear.setPersonaLogueada(usuario);

        assertThat(sistemaATestear.getNombresProfesionalesSinConversacionConUsuario(usuario), CoreMatchers.not(CoreMatchers.hasItem(profesional1)));
    }

    @Test
    public void testGetNombresProfesionalesSinConversacionConUsuarioNoEstandoLogueado()
    {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);

        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional1);
        sistemaATestear.crearConversacion(usuario, profesional1, "Un mensaje", false);

        assertThat(sistemaATestear.getNombresProfesionalesSinConversacionConUsuario(profesional1), CoreMatchers.hasItem(profesional1));
    }

    @Test
    public void testAgregarMensajeConversacionListaVacia() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion("Martin", "Lucia", "aa", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testAgregarMensajeConversacionNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion(null, null, "Segundo mensaje", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testDevolverAlimentoNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento(null, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(null), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento("", "", null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(""), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosCorrectos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre("Papa"), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosErroneos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertNotEquals(sistemaATestear.devolverAlimentoDadoNombre("Luca"), alimentoEsperado);
    }

    @Test
    public void testUsuarioDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null);
        assertEquals(sistemaATestear.getUsuarioPorNombre(null), usuarioEsperado);
    }

    @Test
    public void testProfesionalDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(null), profesionalEsperado);
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(""), profesionalEsperado);
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional("Martin", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista(profesionalEsperado);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"), profesionalEsperado);
    }

    @Test
    public void testDevolverUsuarioPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null);
        assertEquals(sistemaATestear.getUsuarioPorNombre(""), usuarioEsperado);
    }

    @Test
    public void testDevolverUsuarioPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = new Usuario("Martin", null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista(usuario);
        assertEquals(sistemaATestear.getUsuarioPorNombre("Martin"), usuario);
    }

    @Test
    public void testAgregarPlanAlimentacionUsuarioNull() {
        LocalDateTime fecha = LocalDateTime.now();
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = null;
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1, fecha));
    }

    @Test
    public void testAgregarPlanAlimentacionProfesionalNull() {
        LocalDateTime fecha = LocalDateTime.now();
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null);
        Profesional profesional1 = null;
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1, fecha));
    }

    @Test
    public void testAgregarPlanAlimentacionRepetidos() {
        LocalDateTime fecha = LocalDateTime.now();
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null);
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1, fecha);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1, fecha));
    }

    @Test
    public void testPlanesPendientes() {
        LocalDateTime fecha = LocalDateTime.now();
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1, fecha);
        assertEquals(1, sistemaATestear.getListaPlanesPendientes(profesional1).size());
    }

    @Test
    public void testPlanesPendientes2() {
        LocalDateTime fecha = LocalDateTime.now();
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        Profesional profesional2 = new Profesional("Joaquin", "Bardanca", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1, fecha);
        assertEquals(0, sistemaATestear.getListaPlanesPendientes(profesional2).size());
    }

    @Test
    public void testPlanesPendientesNull() {
        LocalDateTime fecha = LocalDateTime.now();
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1, fecha);
        assertEquals(0, sistemaATestear.getListaPlanesPendientes(null).size());
    }

    @Test
    public void testAgregarAListaConversacionesDatosErroneos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario("Martin", null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        boolean agregoConversacionRepetida = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacionRepetida);
    }

    @Test
    public void testAgregarIngestaDatosCorrectos() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        Ingesta ingesta1 = new Ingesta("11/02/17", null);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        sistemaATestear.crearUsuario(new Usuario("Martin", null, null, null, null));
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario(new Usuario("Martin", null, null, null, null));
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaFechaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario(new Usuario("Martin", null, null, null, null));
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/17", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaFechaNull() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta(null, listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario(new Usuario("Martin", null, null, null, null));
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, null, "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), null, "Papa");
        assertFalse(retorno);
    }

    @Test
    public void testAgregarIngestaAlimentoRepetidoFechaDistinta() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario(new Usuario("Martin", null, null, null, null));
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testDevolverPlanDadoNombreNull() {
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombreYFecha(null, null), new PlanAlimentacion(null, null, null, false, null, null));
    }

    @Test
    public void testDevolverPlanDatosValidos() {
        LocalDateTime fecha = LocalDateTime.now();
        Usuario user1 = new Usuario("Martin", null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan", user1, professional1, false, null, fecha);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombreYFecha("Plan", fecha), plan1);
    }

    @Test
    public void testDevolverPlanNoPertenece() {
        LocalDateTime fecha = LocalDateTime.now();
        Usuario user1 = new Usuario("Martin", null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null, fecha);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombreYFecha("Plan", fecha).getNombreDelPlan(), plan1.getNombreDelPlan());
    }

    @Test
    public void testAtenderSolicitudPlan() {
        Usuario user1 = new Usuario("Martin", null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), plan1, plan1.getNombreDelPlan());
        assertTrue(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanAtendidoTrue() {
        Usuario user1 = new Usuario("Martin", null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, true, null, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), plan1, "Plan de alimentación");
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), plan1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testListaPlanesAtendidosDatosCorrectos() {
        LocalDateTime fecha = LocalDateTime.now();
        Usuario user1 = new Usuario("Martin", null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null, fecha);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), plan1, plan1.getNombreDelPlan());
        assertEquals(plan1.toString(), sistemaATestear.planesAtendidosDelUsuario(user1)[0]);
    }

    @Test
    public void testListaPlanesAtendidosListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(0, sistemaATestear.planesAtendidosDelUsuario(user1).length);
    }

    @Test
    public void testCrearProfesional(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Profesional profesional = new Profesional("Federico", "Sanchez", "23/03/1995", null, "Licenciado en nutricion", "20/09/2018", "Nicaragua");
        sistemaATestear.crearProfesional("Federico", "Sanchez", "23/03/1995", null, "Licenciado en nutricion", "20/09/2018", "Nicaragua");

        assertThat(sistemaATestear.getListaProfesionales(), CoreMatchers.hasItem(profesional));
    }

    @Test
    public void testAgregarProfesionalNullALista(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista(null);

        assertThat(sistemaATestear.getListaAlimentos(), CoreMatchers.not(CoreMatchers.hasItem(null)));
    }

    @Test
    public void testCrearAlimento(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Alimento nuevoAlimento = new Alimento("Papa", "Verdura", null, null);
        sistemaATestear.crearAlimento("Papa", "Verdura", null, null);

        assertThat(sistemaATestear.getListaAlimentos(), CoreMatchers.hasItem(nuevoAlimento));
    }

    @Test
    public void testGetListaNombresUsuariosConversacionesPendientes(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);

        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional1);
        sistemaATestear.crearConversacion(usuario, profesional1, "Un mensaje", false);
        sistemaATestear.setPersonaLogueada(usuario);

        String[] list = sistemaATestear.getListaNombresUsuariosConversacionesPendientes( "Sandra Pazos");

        assertThat(Arrays.asList(list), CoreMatchers.hasItem(usuario.toString()));
    }

    @Test
    public void testGetListaNombresProfesionalesConversaciones(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        Profesional profesional2 = new Profesional("Francisco", "Sanchez", null, null, null, null, null);


        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional1);
        sistemaATestear.agregarProfesionalALaLista(profesional2);
        sistemaATestear.crearConversacion(usuario, profesional1, "Un mensaje", false);
        sistemaATestear.crearConversacion(usuario, profesional2, "Un mensaje", false);
        sistemaATestear.setPersonaLogueada(profesional1);

        String[] list = sistemaATestear.getListaNombresProfesionalesConversaciones( "Martin Gómez");
        assertThat(Arrays.asList(list), CoreMatchers.hasItem(profesional2.toString()));
    }

    @Test
    public void testGetsConversacionSinConversaciones(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);

        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional1);

        assertEquals("No hay conversación disponible.", sistemaATestear.getConversacion(profesional1.toString(), usuario.toString()));
    }

    @Test
    public void testGetsConversacion(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);

        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional1);

        InformacionMensaje mensaje = new InformacionMensaje(usuario.toString(), profesional1.toString(), "Un mensaje");
        ArrayList<InformacionMensaje> mensajes = new ArrayList<>();
        mensajes.add(mensaje);
        Conversacion conversacion = new Conversacion(usuario, profesional1, mensajes);
        sistemaATestear.crearConversacion(usuario, profesional1, "Un mensaje", true);
        sistemaATestear.setPersonaLogueada(profesional1);

        assertEquals(sistemaATestear.getConversacion(profesional1.toString(), usuario.toString()), conversacion.toString());
    }

    @Test
    public void testAgregarAlimentoNullALista(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.agregarAlimentoALaLista(null);

        assertThat(sistemaATestear.getListaAlimentos(), CoreMatchers.not(CoreMatchers.hasItem(null)));
    }

    @Test
    public void guardarDatosCreaArchivo(){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);

        Usuario usuario = new Usuario("Martin", "Gómez", null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);

        sistemaATestear.agregarUsuarioALaLista(usuario);
        sistemaATestear.agregarProfesionalALaLista(profesional1);

        sistemaATestear.guardarDatosSistema(false);

        File file = new File("Sistema.data");
        assertTrue(file.exists());
    }

    @Test
    public void testEnumPreferenciasCarnesBlancas() {
        String resultadoEsperado = "CARNES_BLANCAS";
        assertEquals(Preferencias.CARNES_BLANCAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasCarnesRojas() {
        String resultadoEsperado = "CARNES_ROJAS";
        assertEquals(Preferencias.CARNES_ROJAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasVerduras() {
        String resultadoEsperado = "VERDURAS";
        assertEquals(Preferencias.VERDURAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasFrutas() {
        String resultadoEsperado = "FRUTAS";
        assertEquals(Preferencias.FRUTAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasHarinas() {
        String resultadoEsperado = "HARINAS";
        assertEquals(Preferencias.HARINAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesDiabetes() {
        String resultadoEsperado = "DIABETES";
        assertEquals(Restricciones.DIABETES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesVeganismo() {
        String resultadoEsperado = "VEGANISMO";
        assertEquals(Restricciones.VEGANISMO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesIntoleranciaLactosa() {
        String resultadoEsperado = "INTOLERANCIA_LACTOSA";
        assertEquals(Restricciones.INTOLERANCIA_LACTOSA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesHarinas() {
        String resultadoEsperado = "CELIAQUIA";
        assertEquals(Restricciones.CELIAQUIA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaJueves() {
        String resultadoEsperado = "JUEVES";
        assertEquals(DiasDeLaSemana.JUEVES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaViernes() {
        String resultadoEsperado = "VIERNES";
        assertEquals(DiasDeLaSemana.VIERNES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaSabado() {
        String resultadoEsperado = "SABADO";
        assertEquals(DiasDeLaSemana.SABADO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaDomingo() {
        String resultadoEsperado = "DOMINGO";
        assertEquals(DiasDeLaSemana.DOMINGO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMiercoles() {
        String resultadoEsperado = "MIERCOLES";
        assertEquals(DiasDeLaSemana.MIERCOLES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMartes() {
        String resultadoEsperado = "MARTES";
        assertEquals(DiasDeLaSemana.MARTES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaLunes() {
        String resultadoEsperado = "LUNES";
        assertEquals(DiasDeLaSemana.LUNES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaDesayuno() {
        String resultadoEsperado = "DESAYUNO";
        assertEquals(IngestasPorDia.DESAYUNO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaAlmuerzo() {
        String resultadoEsperado = "ALMUERZO";
        assertEquals(IngestasPorDia.ALMUERZO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaCena() {
        String resultadoEsperado = "CENA";
        assertEquals(IngestasPorDia.CENA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDevolverListaIngestas() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Desayuno");
        listaEsperada.add("Almuerzo");
        listaEsperada.add("Cena");
        assertEquals(sistemaATestear.devolverListaIngestasDeLaSemana(), listaEsperada);
    }

    @Test
    public void testEnumDevolverListaDiasDeLaSemana() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();

        listaEsperada.add("Lunes");
        listaEsperada.add("Martes");
        listaEsperada.add("Miercoles");
        listaEsperada.add("Jueves");
        listaEsperada.add("Viernes");
        listaEsperada.add("Sabado");
        listaEsperada.add("Domingo");

        assertEquals(sistemaATestear.devolverListaDiasDeLaSemana(), listaEsperada);
    }

    @Test
    public void testEnumDevolverListaPaises() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();

        listaEsperada.add("Argentina");
        listaEsperada.add("Bolivia");
        listaEsperada.add("Brasil");
        listaEsperada.add("Chile");
        listaEsperada.add("Colombia");
        listaEsperada.add("Costa Rica");
        listaEsperada.add("Cuba");
        listaEsperada.add("Ecuador");
        listaEsperada.add("El Salvador");
        listaEsperada.add("Guayana Francesa");
        listaEsperada.add("Granada");
        listaEsperada.add("Guatemala");
        listaEsperada.add("Guayana");
        listaEsperada.add("Haiti");
        listaEsperada.add("Honduras");
        listaEsperada.add("Jamaica");
        listaEsperada.add("Mexico");
        listaEsperada.add("Nicaragua");
        listaEsperada.add("Paraguay");
        listaEsperada.add("Panama");
        listaEsperada.add("Peru");
        listaEsperada.add("Puerto Rico");
        listaEsperada.add("Republica Dominicana");
        listaEsperada.add("Surinam");
        listaEsperada.add("Uruguay");
        listaEsperada.add("Venezuela");

        assertEquals(sistemaATestear.devolverListaPaises(), listaEsperada);
    }

    @Test
    public void testEnumPaisesArgentina() {
        String resultadoEsperado = "ARGENTINA";
        assertEquals(Paises.ARGENTINA.name(), resultadoEsperado);
    }
    
    @Test
    public void testEnumPaisesBolivia() {
        String resultadoEsperado = "BOLIVIA";
        assertEquals(Paises.BOLIVIA.name(), resultadoEsperado);
    }
    
    @Test
    public void testEnumPaisesBrasil() {
        String resultadoEsperado = "BRASIL";
        assertEquals(Paises.BRASIL.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesChile() {
        String resultadoEsperado = "CHILE";
        assertEquals(Paises.CHILE.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesColombia() {
        String resultadoEsperado = "COLOMBIA";
        assertEquals(Paises.COLOMBIA.name(), resultadoEsperado);
    }


    @Test
    public void testEnumPaisesGuatemala() {
        String resultadoEsperado = "GUATEMALA";
        assertEquals(Paises.GUATEMALA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesGranada() {
        String resultadoEsperado = "GRANADA";
        assertEquals(Paises.GRANADA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesGuayana() {
        String resultadoEsperado = "GUAYANA";
        assertEquals(Paises.GUAYANA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesCostaRica() {
        String resultadoEsperado = "COSTA_RICA";
        assertEquals(Paises.COSTA_RICA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesCuba() {
        String resultadoEsperado = "CUBA";
        assertEquals(Paises.CUBA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesEcuador() {
        String resultadoEsperado = "ECUADOR";
        assertEquals(Paises.ECUADOR.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesElSalvador() {
        String resultadoEsperado = "EL_SALVADOR";
        assertEquals(Paises.EL_SALVADOR.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesGuayanaFrancesa() {
        String resultadoEsperado = "CUBA";
        assertEquals(Paises.CUBA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesHaiti() {
        String resultadoEsperado = "HAITI";
        assertEquals(Paises.HAITI.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesHonduras() {
        String resultadoEsperado = "HONDURAS";
        assertEquals(Paises.HONDURAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesJamaica() {
        String resultadoEsperado = "JAMAICA";
        assertEquals(Paises.JAMAICA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesMexico() {
        String resultadoEsperado = "MEXICO";
        assertEquals(Paises.MEXICO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesNicaragua() {
        String resultadoEsperado = "NICARAGUA";
        assertEquals(Paises.NICARAGUA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesParaguay() {
        String resultadoEsperado = "PARAGUAY";
        assertEquals(Paises.PARAGUAY.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesPanama() {
        String resultadoEsperado = "PANAMA";
        assertEquals(Paises.PANAMA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesPeru() {
        String resultadoEsperado = "PERU";
        assertEquals(Paises.PERU.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesPuertoRico() {
        String resultadoEsperado = "PUERTO_RICO";
        assertEquals(Paises.PUERTO_RICO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesRepublicaDominicana() {
        String resultadoEsperado = "REPUBLICA_DOMINICANA";
        assertEquals(Paises.REPUBLICA_DOMINICANA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesSurinam() {
        String resultadoEsperado = "SURINAM";
        assertEquals(Paises.SURINAM.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesUruguay() {
        String resultadoEsperado = "URUGUAY";
        assertEquals(Paises.URUGUAY.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaisesVenezuela() {
        String resultadoEsperado = "VENEZUELA";
        assertEquals(Paises.VENEZUELA.name(), resultadoEsperado);
    }
}
