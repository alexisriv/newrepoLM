package search.estate.real.com.myrealestate.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("TipoOperacion")
    @Expose
    private String tipoOperacion;
    @SerializedName("TipoPropiedad")
    @Expose
    private String tipoPropiedad;
    @SerializedName("Titulo")
    @Expose
    private String titulo;
    @SerializedName("InformacionAdicional")
    @Expose
    private String informacionAdicional;
    @SerializedName("MontoOperacion")
    @Expose
    private Integer montoOperacion;
    @SerializedName("Moneda")
    @Expose
    private String moneda;
    @SerializedName("Multimedia")
    @Expose
    private List<Multimedium> multimedia = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public Integer getMontoOperacion() {
        return montoOperacion;
    }

    public void setMontoOperacion(Integer montoOperacion) {
        this.montoOperacion = montoOperacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public List<Multimedium> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<Multimedium> multimedia) {
        this.multimedia = multimedia;
    }

}
