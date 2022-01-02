
package com.vaadin.vaadinarchetypeapplication.backend.clases;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Equipos {

    @SerializedName("id_equipo")
    @Expose
    private String idEquipo;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("marca")
    @Expose
    private String marca;
    @SerializedName("usoEquipo")
    @Expose
    private String usoEquipo;
    @SerializedName("SO")
    @Expose
    private So so;
    @SerializedName("hardware")
    @Expose
    private Hardware hardware;
    @SerializedName("software")
    @Expose
    private Software software;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Equipos() {
    }

    /**
     * 
     * @param marca
     * @param idEquipo
     * @param tipo
     * @param software
     * @param so
     * @param usoEquipo
     * @param hardware
     */
    public Equipos(String idEquipo, String tipo, String marca, String usoEquipo, So so, Hardware hardware, Software software) {
        super();
        this.idEquipo = idEquipo;
        this.tipo = tipo;
        this.marca = marca;
        this.usoEquipo = usoEquipo;
        this.so = so;
        this.hardware = hardware;
        this.software = software;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Equipos withIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Equipos withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Equipos withMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getUsoEquipo() {
        return usoEquipo;
    }

    public void setUsoEquipo(String usoEquipo) {
        this.usoEquipo = usoEquipo;
    }

    public Equipos withUsoEquipo(String usoEquipo) {
        this.usoEquipo = usoEquipo;
        return this;
    }

    public So getSo() {
        return so;
    }

    public void setSo(So so) {
        this.so = so;
    }

    public Equipos withSo(So so) {
        this.so = so;
        return this;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public Equipos withHardware(Hardware hardware) {
        this.hardware = hardware;
        return this;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public Equipos withSoftware(Software software) {
        this.software = software;
        return this;
    }

}
