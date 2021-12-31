
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Inventario__1 {

    @SerializedName("equipos")
    @Expose
    private Equipos equipos;
    @SerializedName("usuarios")
    @Expose
    private Usuarios usuarios;
    @SerializedName("prestamos")
    @Expose
    private Prestamos prestamos;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Inventario__1() {
    }

    /**
     * 
     * @param usuarios
     * @param prestamos
     * @param equipos
     */
    public Inventario__1(Equipos equipos, Usuarios usuarios, Prestamos prestamos) {
        super();
        this.equipos = equipos;
        this.usuarios = usuarios;
        this.prestamos = prestamos;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public Inventario__1 withEquipos(Equipos equipos) {
        this.equipos = equipos;
        return this;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Inventario__1 withUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
        return this;
    }

    public Prestamos getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamos prestamos) {
        this.prestamos = prestamos;
    }

    public Inventario__1 withPrestamos(Prestamos prestamos) {
        this.prestamos = prestamos;
        return this;
    }

}
