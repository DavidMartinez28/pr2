
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CantMemoria {

    @SerializedName("velocidad")
    @Expose
    private String velocidad;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CantMemoria() {
    }

    /**
     * 
     * @param velocidad
     */
    public CantMemoria(String velocidad) {
        super();
        this.velocidad = velocidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public CantMemoria withVelocidad(String velocidad) {
        this.velocidad = velocidad;
        return this;
    }

}
