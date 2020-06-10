package dominio;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.security.KeyPair;
import java.time.LocalDateTime;
import java.util.AbstractMap;
import java.util.Currency;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

public final class Sistema implements Serializable {
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Profesional> listaProfesionales;
    private ArrayList<Alimento> listaAlimentos;
    private ArrayList<PlanAlimentacion> listaPlanesAlimentacion;
    private ArrayList<Conversacion> listaConversaciones;
    private Persona personaLogueada;

    public Sistema(ArrayList<Usuario> unaListaUsuarios,
            ArrayList<Profesional> unaListaProfesionales,
            ArrayList<Alimento> unaListaAlimentos,
            ArrayList<PlanAlimentacion> unaListaPlanesAlimentacion,
            ArrayList<Conversacion> unaListaConversaciones,
            Persona personaLogueada) {
        setListaUsuarios(unaListaUsuarios);
        setListaProfesionales(unaListaProfesionales);
        setListaAlimentos(unaListaAlimentos);
        setListaConversaciones(unaListaConversaciones);
        setListaPlanesAlimentacion(unaListaPlanesAlimentacion);
        setPersonaLogueada(personaLogueada);
    }

    public Sistema() {
        setListaUsuarios(new ArrayList<>());
        setListaProfesionales(new ArrayList<>());
        setListaAlimentos(new ArrayList<>());
        setListaConversaciones(new ArrayList<>());
        setListaPlanesAlimentacion(new ArrayList<>());
        setPersonaLogueada(new Usuario("Nombre", "Apellido", "",
                new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png")),
                ""));
    }

    public Persona getPersonaLogueada() {
        return personaLogueada;
    }

    public void setPersonaLogueada(Persona personaLogueada) {
        this.personaLogueada = personaLogueada;
    }

    public ArrayList<Conversacion> getListaConversaciones() {
        return this.listaConversaciones;
    }

    public void setListaConversaciones(ArrayList<Conversacion> unaListaConversaciones) {
        if (unaListaConversaciones == null) {
            this.listaConversaciones = new ArrayList<>();
        } else {
            this.listaConversaciones = unaListaConversaciones;
        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> unaListaUsuarios) {
        if (unaListaUsuarios == null) {
            this.listaUsuarios = new ArrayList<>();
        } else {
            this.listaUsuarios = unaListaUsuarios;
        }
    }

    public ArrayList<Profesional> getListaProfesionales() {
        return this.listaProfesionales;
    }

    public void setListaProfesionales(ArrayList<Profesional> unaListaProfesionales) {
        if (unaListaProfesionales == null) {
            this.listaProfesionales = new ArrayList<>();
        } else {
            this.listaProfesionales = unaListaProfesionales;
        }
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return this.listaAlimentos;
    }

    public void setListaAlimentos(ArrayList<Alimento> unaListaAlimentos) {
        if (unaListaAlimentos == null) {
            this.listaAlimentos = new ArrayList<>();
        } else {
            this.listaAlimentos = unaListaAlimentos;
        }
    }

    public ArrayList<PlanAlimentacion> getListaPlanesAlimentacion() {
        return this.listaPlanesAlimentacion;
    }

    public void setListaPlanesAlimentacion(ArrayList<PlanAlimentacion> unaListaPlanesAlimentacion) {
        if (unaListaPlanesAlimentacion == null) {
            this.listaPlanesAlimentacion = new ArrayList<>();
        } else {
            this.listaPlanesAlimentacion = unaListaPlanesAlimentacion;
        }
    }

    public enum Preferencias {
        CARNES_ROJAS, CARNES_BLANCAS, VERDURAS, FRUTAS, HARINAS;
    }

    public enum Restricciones {
        DIABETES, VEGANISMO, INTOLERANCIA_LACTOSA, CELIAQUIA;
    }

    public enum Paises {
        ARGENTINA, BOLIVIA, BRASIL, CHILE, COLOMBIA, COSTA_RICA, CUBA, ECUADOR, EL_SALVADOR,
        GUAYANA_FRANCESA, GRANADA, GUATEMALA, GUAYANA, HAITI, HONDURAS, JAMAICA,
        MEXICO, NICARAGUA, PARAGUAY, PANAMA, PERU, PUERTO_RICO, REPUBLICA_DOMINICANA, SURINAM, URUGUAY, VENEZUELA;
    }

    public enum DiasDeLaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
    }

    public enum IngestasPorDia {
        DESAYUNO, ALMUERZO, CENA;
    }

    private String primeraLetraMayuscula(String string){
        StringBuilder stringBuilder = new StringBuilder("");
        for(String str : string.split(" ")){
            if(stringBuilder.length() != 0)
                stringBuilder.append(" ");

            String formateado = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
            stringBuilder.append(formateado);
        }

        return stringBuilder.toString();
    }

    public ArrayList<String> devolverListaPaises() {
        ArrayList<String> lstNacionalidades = new ArrayList<>();
        for(Paises pais : Paises.values()){
            String nombrePais = primeraLetraMayuscula(pais.toString().replace('_',' '));

            lstNacionalidades.add(nombrePais);
        }

        return lstNacionalidades;
    }

    public ArrayList<String> devolverListaDiasDeLaSemana() {
        ArrayList<String> lstDiasSemana = new ArrayList<>();
        for(DiasDeLaSemana diaDeLaSemana : DiasDeLaSemana.values()){
            String dia = primeraLetraMayuscula(diaDeLaSemana.toString().replace('_',' '));

            lstDiasSemana.add(dia);
        }

        return lstDiasSemana;
    }

    public ArrayList<String> devolverListaIngestasDeLaSemana() {
        ArrayList<String> lstIngestas = new ArrayList<>();
        for(IngestasPorDia ingestaPorDia : IngestasPorDia.values()){
            String ingesta = primeraLetraMayuscula(ingestaPorDia.toString().replace('_',' '));

            lstIngestas.add(ingesta);
        }

        return lstIngestas;
    }

    public void guardarDatosSistema() {
        try(ObjectOutputStream objetoASerializar = new ObjectOutputStream(new FileOutputStream("Sistema.data"))) {
            objetoASerializar.writeObject(this);
            objetoASerializar.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean crearUsuario(Usuario usuarioNuevo) {
        boolean fueAgregadoUsuario = agregarUsuarioALaLista(usuarioNuevo);

        return fueAgregadoUsuario;
    }

    public boolean agregarUsuarioALaLista(Usuario usuarioARegistrar) {
        boolean fueAgregadoUsuario = false;
        if ((usuarioARegistrar != null) && !getListaUsuarios().contains(usuarioARegistrar)) {
            getListaUsuarios().add(usuarioARegistrar);
            fueAgregadoUsuario = true;
        }
        return fueAgregadoUsuario;
    }

    public boolean crearProfesional(String nombre, String apellido, String fechaNacimiento, ImageIcon fotoPerfil, String tituloProfesional, String fechaGraduacion, String paisGraduacion) {
        Profesional profesionalNuevo = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil, tituloProfesional, fechaGraduacion, paisGraduacion);
        boolean fueAgregadoProfesional = agregarProfesionalALaLista(profesionalNuevo);
        return fueAgregadoProfesional;
    }

    public boolean agregarProfesionalALaLista(Profesional profesionalARegistrar) {
        if ((profesionalARegistrar != null) && !getListaProfesionales().contains(profesionalARegistrar)) {
            getListaProfesionales().add(profesionalARegistrar);
            return true;
        }
        return false;
    }

    public boolean crearAlimento(String nombre, String tipoAlimento, ArrayList<ComposicionAlimento> listaNutrientesConProporcion, ImageIcon fotoDelAlimento) {
        Alimento an;
        an = new Alimento(nombre, tipoAlimento, listaNutrientesConProporcion, fotoDelAlimento);
        boolean fueAgregadoAlimento = agregarAlimentoALaLista(an);
        return fueAgregadoAlimento;
    }

    public boolean agregarAlimentoALaLista(Alimento alimentoAAgregar) {
        if (alimentoAAgregar != null && !getListaAlimentos().contains(alimentoAAgregar)) {
            getListaAlimentos().add(alimentoAAgregar);
            return true;
        }
        return false;
    }

    public boolean crearConversacion(Persona usuario, Persona profesional, String mensaje, boolean usuarioEsRemitente) {
        boolean fueAgregadaConversacion = false;
        if (usuario != null && profesional != null && mensaje != null && !mensaje.isEmpty()) {
            InformacionMensaje info;
            if (usuarioEsRemitente) {
                info = new InformacionMensaje(usuario.getNombreCompleto(), profesional.getNombreCompleto(), mensaje);
            } else {
                info = new InformacionMensaje(profesional.getNombreCompleto(), usuario.getNombreCompleto(), mensaje);
            }
            if (listaUsuarios.contains(usuario) && listaProfesionales.contains(profesional)) {
                ArrayList<InformacionMensaje> listaMensajes = new ArrayList<>();
                listaMensajes.add(info);
                Conversacion nuevaConversacion = new Conversacion(usuario, profesional, listaMensajes);
                fueAgregadaConversacion = agregarConversacionALaLista(nuevaConversacion);
            }
        }
        return fueAgregadaConversacion;
    }

    private boolean agregarConversacionALaLista(Conversacion nuevaConversacion) {
        boolean fueAgregadaConversacion = false;
        if (!getListaConversaciones().contains(nuevaConversacion)) {
            getListaConversaciones().add(nuevaConversacion);
            fueAgregadaConversacion = true;
        }
        return fueAgregadaConversacion;
    }

    public String[] getListaNombresProfesionalesConversaciones(String nombreUsuarioConversacion) {
        String[] nombresProfesionales = new String[getListaConversaciones().size()];
        ArrayList<String> nombresIngresados = new ArrayList<>();
        for (int i = 0; i < getListaConversaciones().size(); i++) {
            String nombreCompleto = getListaConversaciones().get(i).getProfesional().getNombreCompleto();
            String nombreUsuarioCompleto = getListaConversaciones().get(i).getUsuario().getNombreCompleto();
            if (!nombresIngresados.contains(nombreCompleto) && nombreUsuarioCompleto.equals(nombreUsuarioConversacion)) {
                nombresProfesionales[i] = nombreCompleto;
                nombresIngresados.add(nombreCompleto);
            }
        }
        return nombresProfesionales;
    }

    public String[] getListaNombresUsuariosConversacionesPendientes(String profesional) {
        ArrayList<String> nombresIngresados = new ArrayList<>();
        for (int i = 0; i < getListaConversaciones().size(); i++) {
            String nombreCompleto = getListaConversaciones().get(i).getUsuario().getNombreCompleto();
            String nombreProfesional = getListaConversaciones().get(i).getProfesional().getNombreCompleto();
            if (!nombresIngresados.contains(nombreCompleto)
                    && profesional.equals(nombreProfesional)
                    && !getListaConversaciones().get(i).getFueAtendidaConsulta()) {
                nombresIngresados.add(nombreCompleto);
            }
        }
        String[] nombreUsuarios = new String[nombresIngresados.size()];
        for (int i = 0; i < nombreUsuarios.length; i++) {
            nombreUsuarios[i] = nombresIngresados.get(i);
        }
        return nombreUsuarios;
    }

    public String getConversacion(String nombreCompletoProfesional, String nombreCompletoUsuario) {
        String retorno = "No hay conversación disponible.";
        for (int i = 0; i < getListaConversaciones().size(); i++) {
            Conversacion conversacionActual = getListaConversaciones().get(i);
            String nombreCompletoProfesionalActual = conversacionActual.getProfesional().getNombreCompleto();
            String nombreUsuarioActual = conversacionActual.getUsuario().getNombreCompleto();
            if (nombreCompletoProfesionalActual.equals(nombreCompletoProfesional) && nombreUsuarioActual.equals(nombreCompletoUsuario)) {
                return conversacionActual.toString();
            }
        }
        return retorno;
    }

    public boolean agregarMensajeConversacion(String remitente, String destinatario, String mensaje, boolean intercambioRemitente, boolean consultaRespondida) {
        boolean pudeAgregarMensaje = false;
        if (remitente != null && !remitente.isEmpty() && !destinatario.isEmpty()) {
            for (int i = 0; getListaConversaciones() != null && i < getListaConversaciones().size(); i++) {
                Conversacion conversacionActual = getListaConversaciones().get(i);
                String nombreApellidoProfesional = conversacionActual.getProfesional().getNombreCompleto();
                String nombreApellidoUsuario = conversacionActual.getUsuario().getNombreCompleto();
                if (destinatario.equals(nombreApellidoProfesional) && remitente.equals(nombreApellidoUsuario)
                        || destinatario.equals(nombreApellidoUsuario) && remitente.equals(nombreApellidoProfesional)) {
                    conversacionActual.agregarMensaje(mensaje, intercambioRemitente);
                    conversacionActual.setFueAtendidaConsulta(consultaRespondida);
                    pudeAgregarMensaje = true;
                }
            }
        }
        return pudeAgregarMensaje;
    }

    public ArrayList<Profesional> getNombresProfesionalesSinConversacionConUsuario(Persona personaLogueada) {
        ArrayList<Profesional> retorno = copiarLista(getListaProfesionales());
        for (int i = 0; i < getListaConversaciones().size(); i++) {
            Profesional profActual = (Profesional) getListaConversaciones().get(i).getProfesional();
            Persona usuarioActual = getListaConversaciones().get(i).getUsuario();
            if (usuarioActual.equals(personaLogueada)) {
                retorno.remove(profActual);
            }
        }
        return retorno;
    }

    private ArrayList copiarLista(ArrayList lista) {
        ArrayList nueva = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            nueva.add(lista.get(i));
        }
        return nueva;
    }

    public boolean agregarIngestaAUsuario(ArrayList<Ingesta> listaIngestasDelUsuario, String fechaIngesta, String nuevoAlimento) {
        boolean ingestaAgregada = false;
        if (listaIngestasDelUsuario != null && fechaIngesta != null) {
            if (yaExisteIngestaEnEsaFecha(listaIngestasDelUsuario, fechaIngesta)) {
                for (int i = 0; i < listaIngestasDelUsuario.size(); i++) {
                    if (listaIngestasDelUsuario.get(i).getFechaDeIngesta().equals(fechaIngesta)) {
                        ArrayList<Alimento> listaAlimentosActual = listaIngestasDelUsuario.get(i).getListaAlimentosPorFecha();
                        Alimento alimentoAAgregar = devolverAlimentoDadoNombre(nuevoAlimento);
                        listaAlimentosActual.add(alimentoAAgregar);
                    }
                }
            } else {
                Alimento alimentoAAgregar = devolverAlimentoDadoNombre(nuevoAlimento);
                ArrayList<Alimento> nuevaLista = new ArrayList<>();
                nuevaLista.add(alimentoAAgregar);
                Ingesta nuevaIngesta = new Ingesta(fechaIngesta, nuevaLista);
                listaIngestasDelUsuario.add(nuevaIngesta);
            }
            ingestaAgregada = true;
        }
        return ingestaAgregada;
    }

    private boolean yaExisteIngestaEnEsaFecha(ArrayList<Ingesta> listaIngestasDelUsuario, String fechaIngesta) {
        boolean existe = false;
        if (listaIngestasDelUsuario != null) {
            for (int i = 0; i < listaIngestasDelUsuario.size(); i++) {
                if (listaIngestasDelUsuario.get(i).getFechaDeIngesta().equals(fechaIngesta)) {
                    existe = true;
                }
            }
        }
        return existe;
    }

    public Alimento devolverAlimentoDadoNombre(String nuevoAlimento) {
        Alimento alimentoRetorno = new Alimento(null, null, null, null);
        for (int i = 0; i < this.listaAlimentos.size(); i++) {
            String alimentoActual = this.listaAlimentos.get(i).getNombre();
            if (alimentoActual.equals(nuevoAlimento)) {
                alimentoRetorno = this.listaAlimentos.get(i);
            }
        }
        return alimentoRetorno;
    }

    public Usuario getUsuarioPorNombre(String nombreCompleto) {
        Usuario usuarioRetorno = new Usuario(null, null, null, null, null);
        for (int i = 0; i < this.listaUsuarios.size(); i++) {
            String nombreActual = this.listaUsuarios.get(i).getNombreCompleto();
            if (nombreActual.equals(nombreCompleto)) {
                usuarioRetorno = this.listaUsuarios.get(i);
            }
        }
        return usuarioRetorno;
    }

    public Profesional getProfesionalPorNombre(String nombreCompleto) {
        Profesional profesionalRetorno = new Profesional(null, null, null, null, null, null, null);
        for (int i = 0; i < this.listaProfesionales.size(); i++) {
            String nombreActual = this.listaProfesionales.get(i).getNombreCompleto();
            if (nombreActual.equals(nombreCompleto)) {
                profesionalRetorno = this.listaProfesionales.get(i);
            }
        }
        return profesionalRetorno;
    }

    public boolean agregarPlanSolicitado(Usuario usuario, Profesional profesional, LocalDateTime fecha) {
        boolean agreguePlan = false;
        if (usuario != null && profesional != null) {
            AbstractMap.SimpleEntry<Usuario, Profesional> combinacion = new AbstractMap.SimpleEntry<>(usuario, profesional);
            PlanAlimentacion planNuevo = new PlanAlimentacion("", usuario, profesional, false, null, fecha);
            if (!getListaPlanesAlimentacion().contains(planNuevo)) {
                this.getListaPlanesAlimentacion().add(planNuevo);
                agreguePlan = true;
            }
        }
        return agreguePlan;

    }

    public boolean atenderSolicitudDelPlan(String[][] planAlimentacion,
            PlanAlimentacion planSeleccionado,
            String nombrePlan) {
        boolean fueAtendido = false;
        for (int i = 0; i < this.listaPlanesAlimentacion.size(); i++) {
            PlanAlimentacion actual = this.listaPlanesAlimentacion.get(i);
            if (actual.equals(planSeleccionado) && actual.getFueAtendidoElPlan() == false) {
                actual.setNombreDelPlan(nombrePlan);
                actual.setPlanDiaADia(planAlimentacion);
                actual.setFueAtendidoElPlan(true);
                fueAtendido = true;
            }
        }
        return fueAtendido;
    }

    public String[] planesAtendidosDelUsuario(Usuario usuario) {
        ArrayList<String> listaAuxiliar = new ArrayList<>();
        for (int i = 0; i < this.listaPlanesAlimentacion.size(); i++) {
            PlanAlimentacion actual = this.listaPlanesAlimentacion.get(i);
            if (actual.getUsuario().equals(usuario) && actual.getFueAtendidoElPlan()) {
                listaAuxiliar.add(actual.toString());
            }
        }
        String[] planesDelUsuario = new String[listaAuxiliar.size()];
        for (int i = 0; i < planesDelUsuario.length; i++) {
            planesDelUsuario[i] = listaAuxiliar.get(i);
        }
        return planesDelUsuario;
    }

    public PlanAlimentacion devolverPlanDadoNombreYFecha(String np, LocalDateTime fecha) {
        PlanAlimentacion planRetorno = new PlanAlimentacion(null, null, null, false, null, null);
        if (np != null) {
            for (int i = 0; i < this.listaPlanesAlimentacion.size(); i++) {
                PlanAlimentacion planActual = this.listaPlanesAlimentacion.get(i);
                if (planActual.getNombreDelPlan().equals(np) && planActual.getFecha().withNano(0).equals(fecha.withNano(0))) {
                    planRetorno = planActual;
                }
            }
        }

        return planRetorno;
    }

    public ArrayList<PlanAlimentacion> getListaPlanesPendientes(Profesional profesional) {
        ArrayList<PlanAlimentacion> planesPendientes = new ArrayList<>();
        if (profesional != null) {
            for (int i = 0; i < this.listaPlanesAlimentacion.size(); i++) {
                Profesional profesionalActual = this.listaPlanesAlimentacion.get(i).getProfesional();
                boolean fueAtendidoPlanActual = this.listaPlanesAlimentacion.get(i).getFueAtendidoElPlan();
                if (profesionalActual.equals(profesional) && fueAtendidoPlanActual == false) {
                    String nombreUsuario = this.listaPlanesAlimentacion.get(i).getUsuario().getNombreCompleto();
                    planesPendientes.add(this.listaPlanesAlimentacion.get(i));
                }
            }
        }
        return planesPendientes;
    }
}
