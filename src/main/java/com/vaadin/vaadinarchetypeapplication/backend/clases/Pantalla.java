
package com.vaadin.vaadinarchetypeapplication.backend.clases;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Pantalla {

    @SerializedName("diagonal")
    @Expose
    private String diagonal;
    @SerializedName("resoluci\u00f3n")
    @Expose
    private String resoluciN;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pantalla() {
    }

    /**
     * 
     * @param diagonal
     * @param resoluciN
     */
    public Pantalla(String diagonal, String resoluciN) {
        super();
        this.diagonal = diagonal;
        this.resoluciN = resoluciN;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public Pantalla withDiagonal(String diagonal) {
        this.diagonal = diagonal;
        return this;
    }

    public String getResoluciN() {
        return resoluciN;
    }

    public void setResoluciN(String resoluciN) {
        this.resoluciN = resoluciN;
    }

    public Pantalla withResoluciN(String resoluciN) {
        this.resoluciN = resoluciN;
        return this;
    }

}
