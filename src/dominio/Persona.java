package dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.swing.ImageIcon;

public abstract class Persona implements Serializable {
    private ImageIcon fotoDePerfil;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    private static final String ERROR_APELLIDO = "Apellido no ingresado";
    private static final String ERROR_FECHA = "Fecha no ingresada";
    private static final String ERROR_NOMBRE = "Nombre no ingresado";

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        if(unNombre == null || unNombre.isEmpty()){
            this.nombre = ERROR_NOMBRE;
        }
        else {
            this.nombre = unNombre;
        }
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String unApellido) {
        if (unApellido == null || unApellido.isEmpty()) {
            this.apellido = ERROR_APELLIDO;
        } else {
            this.apellido = unApellido;
        }
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String unaFecha) {
        if (unaFecha == null || unaFecha.isEmpty()) {
            this.fechaNacimiento = ERROR_FECHA;
        } else {
            this.fechaNacimiento = unaFecha;
        }
    }

    public ImageIcon getFotoDePerfil() {
        return this.fotoDePerfil;
    }

    public void setFotoDePerfil(ImageIcon foto) {
        if (foto == null) {
            this.fotoDePerfil = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        } else {
            this.fotoDePerfil = foto;
        }
    }

    public String getNombreCompleto() {
        String retorno;
        if (getNombre().equals(ERROR_NOMBRE) && getApellido().equals(ERROR_APELLIDO)) {
            retorno = ERROR_NOMBRE;
        } else if (getNombre().equals(ERROR_NOMBRE)) {
            retorno = getApellido();
        } else if (getApellido().equals(ERROR_APELLIDO)) {
            retorno = getNombre();
        } else {
            retorno = getNombre() + " " + getApellido();
        }
        return retorno;
    }

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Persona otraPersona = (Persona) obj;
        return this.getNombreCompleto().equals(otraPersona.getNombreCompleto());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.apellido, this.nombre, this.fechaNacimiento, this.fotoDePerfil);
    }
}
