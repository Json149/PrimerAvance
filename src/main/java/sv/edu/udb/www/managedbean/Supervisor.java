package sv.edu.udb.www.managedbean;

public class Supervisor {
    private Long id;
    private String nombre;
    private String areaSupervision;

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

    public String getAreaSupervision() {
        return areaSupervision;
    }

    public void setAreaSupervision(String areaSupervision) {
        this.areaSupervision = areaSupervision;
    }

    public Supervisor(Long id, String nombre, String areaSupervision) {
        this.id = id;
        this.nombre = nombre;
        this.areaSupervision = areaSupervision;
    }
}
