
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LicenciaPago {

    @SerializedName("nombre_soft")
    @Expose
    private String nombreSoft;
    @SerializedName("version_soft")
    @Expose
    private String versionSoft;
    @SerializedName("tipo_soft")
    @Expose
    private String tipoSoft;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LicenciaPago() {
    }

    /**
     * 
     * @param versionSoft
     * @param tipoSoft
     * @param nombreSoft
     */
    public LicenciaPago(String nombreSoft, String versionSoft, String tipoSoft) {
        super();
        this.nombreSoft = nombreSoft;
        this.versionSoft = versionSoft;
        this.tipoSoft = tipoSoft;
    }

    public String getNombreSoft() {
        return nombreSoft;
    }

    public void setNombreSoft(String nombreSoft) {
        this.nombreSoft = nombreSoft;
    }

    public LicenciaPago withNombreSoft(String nombreSoft) {
        this.nombreSoft = nombreSoft;
        return this;
    }

    public String getVersionSoft() {
        return versionSoft;
    }

    public void setVersionSoft(String versionSoft) {
        this.versionSoft = versionSoft;
    }

    public LicenciaPago withVersionSoft(String versionSoft) {
        this.versionSoft = versionSoft;
        return this;
    }

    public String getTipoSoft() {
        return tipoSoft;
    }

    public void setTipoSoft(String tipoSoft) {
        this.tipoSoft = tipoSoft;
    }

    public LicenciaPago withTipoSoft(String tipoSoft) {
        this.tipoSoft = tipoSoft;
        return this;
    }

}
