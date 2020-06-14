package dominio;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public final class PlanAlimentacion implements Serializable {
    private String nombreDelPlan;
    private Usuario usuario;
    private Profesional profesional;
    private boolean fueAtendidoElPlan;
    private String[][] planDiaADia;

    private LocalDateTime fecha;

    public PlanAlimentacion(String np,
            Usuario usu,
            Profesional pro,
            boolean fueAtendido,
            String[][] unPlan,
            LocalDateTime fecha) {
        setFecha(fecha);
        setUsuario(usu);
        setProfesional(pro);
        setFueAtendidoElPlan(fueAtendido);
        setNombreDelPlan(np);
        setPlanDiaADia(unPlan);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario unUsuario) {
        usuario = unUsuario;
    }

    public Profesional getProfesional() {
        return this.profesional;
    }

    public void setProfesional(Profesional unProfesional) {
        if (unProfesional == null) {
            this.profesional = new Profesional(null, null, null, null, null, null, null);
        } else {
            this.profesional = unProfesional;
        }
    }

    public boolean getFueAtendidoElPlan() {
        return fueAtendidoElPlan;
    }

    public void setFueAtendidoElPlan(boolean fueAtendido) {
        this.fueAtendidoElPlan = fueAtendido;
    }

    public String[][] getPlanDiaADia() {
        return this.planDiaADia.clone();
    }

    public void setPlanDiaADia(String[][] unPlan) {
        if(unPlan == null) {
            this.planDiaADia = new String[0][0];
        }
        else{
            this.planDiaADia = unPlan.clone();
        }
    }

    public String getNombreDelPlan() {
        return this.nombreDelPlan;
    }

    public void setFecha(LocalDateTime fecha){
        if (fecha == null) {
            this.fecha = LocalDateTime.MIN;
        } else {
            this.fecha = fecha;
        }
    }

    public LocalDateTime getFecha(){
        return fecha;
    }

    public void setNombreDelPlan(String unNombreDelPlan) {
        if(unNombreDelPlan == null || unNombreDelPlan.isEmpty()){
            if(getUsuario() != null && !getUsuario().toString().equals("Nombre no ingresado")){
                nombreDelPlan = getUsuario().toString();
            }
            else{
                nombreDelPlan = "Plan de alimentación";
            }
        } else {
            nombreDelPlan = unNombreDelPlan;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        return this.getNombreDelPlan() + " | " + this.getFecha().format(formatter);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        PlanAlimentacion otroPlanAlimentacion = (PlanAlimentacion) obj;
        boolean mismoNombre = this.getNombreDelPlan().equals(otroPlanAlimentacion.getNombreDelPlan());
        boolean mismoUsuario = (this.getUsuario() == null && otroPlanAlimentacion.getUsuario() == null) ||
                (this.getUsuario() != null && this.getUsuario().equals(otroPlanAlimentacion.getUsuario()));
        boolean mismoProfesional = (this.getProfesional() == null && otroPlanAlimentacion.getProfesional() == null) ||
                (this.getProfesional() != null && this.getProfesional().equals(otroPlanAlimentacion.getProfesional()));
        boolean mismaFecha = getFecha().equals(otroPlanAlimentacion.getFecha());

        return mismoNombre && mismoUsuario && mismoProfesional && mismaFecha;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.fecha, this.nombreDelPlan, this.profesional, this.usuario, this.fueAtendidoElPlan);
    }
}
