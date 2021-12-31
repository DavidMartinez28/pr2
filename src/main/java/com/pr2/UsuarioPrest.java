
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class UsuarioPrest {

    @SerializedName("id_usuario")
    @Expose
    private String idUsuario;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UsuarioPrest() {
    }

    /**
     * 
     * @param idUsuario
     */
    public UsuarioPrest(String idUsuario) {
        super();
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioPrest withIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

}
