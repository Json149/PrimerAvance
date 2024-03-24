package sv.edu.udb.www.managedbean;

public class Area {
    private Long id;
    private String nombre;
    private String descripcion;

    private String SupervisorAsignado;

    public Area() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSupervisorAsignado(String supervisorAsignado) {
        SupervisorAsignado = supervisorAsignado;
    }

    public String getSupervisorAsignado() {
        return SupervisorAsignado;
    }

    public Area(Long id, String nombre, String descripcion, String supervisorAsignado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        SupervisorAsignado = supervisorAsignado;
    }
}
