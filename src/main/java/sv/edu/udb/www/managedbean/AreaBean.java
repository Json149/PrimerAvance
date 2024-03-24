package sv.edu.udb.www.managedbean;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import sv.edu.udb.www.managedbean.Area;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ManagedBean
@SessionScoped
public class AreaBean implements Serializable {
    private List<Area> listaAreas;
    private Area areaSeleccionada;

    public AreaBean() {
        listaAreas = new ArrayList<>();
        areaSeleccionada = new Area();
    }

    public List<Area> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(List<Area> listaAreas) {
        this.listaAreas = listaAreas;
    }

    public Area getAreaSeleccionada() {
        return areaSeleccionada;
    }

    public void setAreaSeleccionada(Area areaSeleccionada) {
        this.areaSeleccionada = areaSeleccionada;
    }


    public void cancelar() {
        areaSeleccionada = new Area();
    }


    public void editarArea(Area area) {
        areaSeleccionada = area;
    }

    public void eliminarArea(Area area) {
        listaAreas.remove(area);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Área eliminada correctamente"));
    }

    public void guardarArea() {
        if (!listaAreas.contains(areaSeleccionada)) {
            listaAreas.add(areaSeleccionada);
        }
        areaSeleccionada = new Area();
    }


    public void agregarArea() {
        if (!existeAreaConMismoId(areaSeleccionada.getId())) {
            listaAreas.add(areaSeleccionada);
            areaSeleccionada = new Area();
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El ID ya está en uso."));
        }
    }

    private boolean existeAreaConMismoId(Long id) {
        for (Area area : listaAreas) {
            if (Objects.equals(area.getId(), id)) {
                return true;
            }
        }
        return false;
    }
}