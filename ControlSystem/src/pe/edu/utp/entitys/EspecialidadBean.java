package pe.edu.utp.entitys;

/**
 *
 * @author Miguel
 */
public class EspecialidadBean {
     private Long idEspecialidad;
     private String coEspecialidad;
     private String deEspecialidad;
     private String esEspecialidad;

    public EspecialidadBean() {
    }

    public EspecialidadBean(Long idEspecialidad, String coEspecialidad, String deEspecialidad, String esEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.coEspecialidad = coEspecialidad;
        this.deEspecialidad = deEspecialidad;
        this.esEspecialidad = esEspecialidad;
    }

    public Long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getCoEspecialidad() {
        return coEspecialidad;
    }

    public void setCoEspecialidad(String coEspecialidad) {
        this.coEspecialidad = coEspecialidad;
    }

    public String getDeEspecialidad() {
        return deEspecialidad;
    }

    public void setDeEspecialidad(String deEspecialidad) {
        this.deEspecialidad = deEspecialidad;
    }

    public String getEsEspecialidad() {
        return esEspecialidad;
    }

    public void setEsEspecialidad(String esEspecialidad) {
        this.esEspecialidad = esEspecialidad;
    }
}
