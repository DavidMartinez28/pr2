
package com.vaadin.vaadinarchetypeapplication.backend.clases;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LicenciaLibre {

    @SerializedName("nombre_soft")
    @Expose
    private String nombreSoft;
    @SerializedName("version_soft")
    @Expose
    private String versionSoft;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LicenciaLibre() {
    }

    /**
     * 
     * @param versionSoft
     * @param nombreSoft
     */
    public LicenciaLibre(String nombreSoft, String versionSoft) {
        super();
        this.nombreSoft = nombreSoft;
        this.versionSoft = versionSoft;
    }

    public String getNombreSoft() {
        return nombreSoft;
    }

    public void setNombreSoft(String nombreSoft) {
        this.nombreSoft = nombreSoft;
    }

    public LicenciaLibre withNombreSoft(String nombreSoft) {
        this.nombreSoft = nombreSoft;
        return this;
    }

    public String getVersionSoft() {
        return versionSoft;
    }

    public void setVersionSoft(String versionSoft) {
        this.versionSoft = versionSoft;
    }

    public LicenciaLibre withVersionSoft(String versionSoft) {
        this.versionSoft = versionSoft;
        return this;
    }

}
