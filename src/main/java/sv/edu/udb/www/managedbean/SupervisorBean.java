package sv.edu.udb.www.managedbean;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class SupervisorBean implements Serializable {
    private List<Empleado> listaEmpleados;
    private List<String> marcaciones;
    private List<String> llegadasTarde;
    private Empleado empleadoSeleccionado;


    public SupervisorBean() {
        listaEmpleados = new ArrayList<>();
        marcaciones = new ArrayList<>();
        llegadasTarde = new ArrayList<>();
        empleadoSeleccionado = new Empleado();
    }
    public Empleado getEmpleadoSeleccionado() {
        return empleadoSeleccionado;
    }

    public void setEmpleadoSeleccionado(Empleado empleadoSeleccionado) {
        this.empleadoSeleccionado = empleadoSeleccionado;
    }



    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Empleado agregado correctamente", ""));
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Empleado eliminado correctamente", ""));
    }

    public void mostrarTicketsAlerta() {
        llegadasTarde.add("Ticket de alerta: Llegada tarde detectada - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public List<String> getMarcaciones() {
        return marcaciones;
    }

    public List<String> getLlegadasTarde() {
        return llegadasTarde;
    }
}
