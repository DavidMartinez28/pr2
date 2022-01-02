
package com.vaadin.vaadinarchetypeapplication.backend.clases;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class EquipoPrest {

    @SerializedName("id_equipo")
    @Expose
    private String idEquipo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EquipoPrest() {
    }

    /**
     * 
     * @param idEquipo
     */
    public EquipoPrest(String idEquipo) {
        super();
        this.idEquipo = idEquipo;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public EquipoPrest withIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
        return this;
    }

}
