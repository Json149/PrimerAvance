package sv.edu.udb.www.managedbean;
public class Empleado {

    private String nombre;
    private String edad;
    private String direccionResidencia;
    private int telefono;
    private String correoElectronico;
    private String Area;

    public Empleado() {

    }

    public Empleado(String nombre, String edad, String direccionResidencia, int telefono, String correoElectronico, String area) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccionResidencia = direccionResidencia;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        Area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
       this.direccionResidencia = direccionResidencia;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }
}
