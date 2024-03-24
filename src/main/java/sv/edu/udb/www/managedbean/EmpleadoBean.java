package sv.edu.udb.www.managedbean;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class EmpleadoBean implements Serializable {
    private List<String> marcaciones;
    private List<String> llegadasTarde;
    private List<Empleado> listaEmpleados;
    private Empleado empleadoSeleccionado;

    public EmpleadoBean() {
        marcaciones = new ArrayList<>();
        llegadasTarde = new ArrayList<>();
        empleadoSeleccionado = new Empleado();
        listaEmpleados = new ArrayList<>();
    }

    public List<String> getMarcaciones() {
        return marcaciones;
    }

    public List<String> getLlegadasTarde() {
        return llegadasTarde;
    }

    public void marcarEntrada() {
        String hora = obtenerHoraActual();
        marcaciones.add("Entrada: " + hora);
    }

    public void marcarSalida() {
        String hora = obtenerHoraActual();
        marcaciones.add("Salida: " + hora);
    }

    public void tomarBreak() {
        String hora = obtenerHoraActual();
        marcaciones.add("Tomar Break: " + hora);
    }

    public void regresarDelBreak() {
        String hora = obtenerHoraActual();
        marcaciones.add("Regresar del Break: " + hora);
    }

    public void generarReporteLlegadasTarde() {
        llegadasTarde.add("Reporte generado el: " + obtenerHoraActual());
    }
    private String obtenerHoraActual() {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return horaActual.format(formatter);
    }
//CRUD
    public void agregarEmpleado() {
        listaEmpleados.add(empleadoSeleccionado);
        empleadoSeleccionado = new Empleado(); // Limpiar los campos después de agregar
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Empleado agregado correctamente", ""));
    }

    public void actualizarEmpleado(Empleado empleado) {
        //  actualizar el empleado en la base de datos para un futuro
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Empleado actualizado correctamente", ""));
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Empleado eliminado correctamente", ""));
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public Empleado getEmpleadoSeleccionado() {
        return empleadoSeleccionado;
    }

    public void setEmpleadoSeleccionado(Empleado empleadoSeleccionado) {
        this.empleadoSeleccionado = empleadoSeleccionado;
    }
}




