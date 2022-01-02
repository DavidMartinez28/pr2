
package com.vaadin.vaadinarchetypeapplication.backend.clases;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Prestamos {

    @SerializedName("id_prestamo")
    @Expose
    private String idPrestamo;
    @SerializedName("usuario_prest")
    @Expose
    private UsuarioPrest usuarioPrest;
    @SerializedName("equipo_prest")
    @Expose
    private EquipoPrest equipoPrest;
    @SerializedName("fechaInicio")
    @Expose
    private String fechaInicio;
    @SerializedName("fechaFin")
    @Expose
    private String fechaFin;
    @SerializedName("comentarios")
    @Expose
    private String comentarios;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prestamos() {
    }

    /**
     * 
     * @param usuarioPrest
     * @param fechaInicio
     * @param idPrestamo
     * @param equipoPrest
     * @param fechaFin
     * @param comentarios
     */
    public Prestamos(String idPrestamo, UsuarioPrest usuarioPrest, EquipoPrest equipoPrest, String fechaInicio, String fechaFin, String comentarios) {
        super();
        this.idPrestamo = idPrestamo;
        this.usuarioPrest = usuarioPrest;
        this.equipoPrest = equipoPrest;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.comentarios = comentarios;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Prestamos withIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
        return this;
    }

    public UsuarioPrest getUsuarioPrest() {
        return usuarioPrest;
    }

    public void setUsuarioPrest(UsuarioPrest usuarioPrest) {
        this.usuarioPrest = usuarioPrest;
    }

    public Prestamos withUsuarioPrest(UsuarioPrest usuarioPrest) {
        this.usuarioPrest = usuarioPrest;
        return this;
    }

    public EquipoPrest getEquipoPrest() {
        return equipoPrest;
    }

    public void setEquipoPrest(EquipoPrest equipoPrest) {
        this.equipoPrest = equipoPrest;
    }

    public Prestamos withEquipoPrest(EquipoPrest equipoPrest) {
        this.equipoPrest = equipoPrest;
        return this;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Prestamos withFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
        return this;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Prestamos withFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
        return this;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Prestamos withComentarios(String comentarios) {
        this.comentarios = comentarios;
        return this;
    }

}
