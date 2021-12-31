
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Usuarios {

    @SerializedName("id_usuario")
    @Expose
    private String idUsuario;
    @SerializedName("nombre_usr")
    @Expose
    private String nombreUsr;
    @SerializedName("departamento_usr")
    @Expose
    private String departamentoUsr;
    @SerializedName("telContacto")
    @Expose
    private String telContacto;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("ubicacion")
    @Expose
    private String ubicacion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Usuarios() {
    }

    /**
     * 
     * @param ubicacion
     * @param departamentoUsr
     * @param idUsuario
     * @param nombreUsr
     * @param telContacto
     * @param email
     */
    public Usuarios(String idUsuario, String nombreUsr, String departamentoUsr, String telContacto, String email, String ubicacion) {
        super();
        this.idUsuario = idUsuario;
        this.nombreUsr = nombreUsr;
        this.departamentoUsr = departamentoUsr;
        this.telContacto = telContacto;
        this.email = email;
        this.ubicacion = ubicacion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuarios withIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public String getNombreUsr() {
        return nombreUsr;
    }

    public void setNombreUsr(String nombreUsr) {
        this.nombreUsr = nombreUsr;
    }

    public Usuarios withNombreUsr(String nombreUsr) {
        this.nombreUsr = nombreUsr;
        return this;
    }

    public String getDepartamentoUsr() {
        return departamentoUsr;
    }

    public void setDepartamentoUsr(String departamentoUsr) {
        this.departamentoUsr = departamentoUsr;
    }

    public Usuarios withDepartamentoUsr(String departamentoUsr) {
        this.departamentoUsr = departamentoUsr;
        return this;
    }

    public String getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(String telContacto) {
        this.telContacto = telContacto;
    }

    public Usuarios withTelContacto(String telContacto) {
        this.telContacto = telContacto;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuarios withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Usuarios withUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        return this;
    }

}
