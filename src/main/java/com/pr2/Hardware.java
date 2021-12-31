
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Hardware {

    @SerializedName("procesador")
    @Expose
    private String procesador;
    @SerializedName("cant_Memoria")
    @Expose
    private CantMemoria cantMemoria;
    @SerializedName("discoDuro")
    @Expose
    private DiscoDuro discoDuro;
    @SerializedName("pantalla")
    @Expose
    private Pantalla pantalla;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hardware() {
    }

    /**
     * 
     * @param pantalla
     * @param discoDuro
     * @param procesador
     * @param cantMemoria
     */
    public Hardware(String procesador, CantMemoria cantMemoria, DiscoDuro discoDuro, Pantalla pantalla) {
        super();
        this.procesador = procesador;
        this.cantMemoria = cantMemoria;
        this.discoDuro = discoDuro;
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Hardware withProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public CantMemoria getCantMemoria() {
        return cantMemoria;
    }

    public void setCantMemoria(CantMemoria cantMemoria) {
        this.cantMemoria = cantMemoria;
    }

    public Hardware withCantMemoria(CantMemoria cantMemoria) {
        this.cantMemoria = cantMemoria;
        return this;
    }

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
    }

    public Hardware withDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
        return this;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Hardware withPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
        return this;
    }

}
