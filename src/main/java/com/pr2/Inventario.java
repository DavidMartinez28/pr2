
package com.pr2;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Inventario {

    @SerializedName("inventario")
    @Expose
    private List<Inventario__1> inventario = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Inventario() {
    }

    /**
     * 
     * @param inventario
     */
    public Inventario(List<Inventario__1> inventario) {
        super();
        this.inventario = inventario;
    }

    public List<Inventario__1> getInventario() {
        return inventario;
    }

    public void setInventario(List<Inventario__1> inventario) {
        this.inventario = inventario;
    }

    public Inventario withInventario(List<Inventario__1> inventario) {
        this.inventario = inventario;
        return this;
    }

}
