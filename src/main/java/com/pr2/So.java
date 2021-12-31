
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class So {

    @SerializedName("nombre_SO")
    @Expose
    private String nombreSO;
    @SerializedName("version_SO")
    @Expose
    private String versionSO;

    /**
     * No args constructor for use in serialization
     * 
     */
    public So() {
    }

    /**
     * 
     * @param versionSO
     * @param nombreSO
     */
    public So(String nombreSO, String versionSO) {
        super();
        this.nombreSO = nombreSO;
        this.versionSO = versionSO;
    }

    public String getNombreSO() {
        return nombreSO;
    }

    public void setNombreSO(String nombreSO) {
        this.nombreSO = nombreSO;
    }

    public So withNombreSO(String nombreSO) {
        this.nombreSO = nombreSO;
        return this;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public void setVersionSO(String versionSO) {
        this.versionSO = versionSO;
    }

    public So withVersionSO(String versionSO) {
        this.versionSO = versionSO;
        return this;
    }

}
