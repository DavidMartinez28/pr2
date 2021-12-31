
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DiscoDuro {

    @SerializedName("tipo_dd")
    @Expose
    private String tipoDd;
    @SerializedName("cap_dd")
    @Expose
    private String capDd;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscoDuro() {
    }

    /**
     * 
     * @param capDd
     * @param tipoDd
     */
    public DiscoDuro(String tipoDd, String capDd) {
        super();
        this.tipoDd = tipoDd;
        this.capDd = capDd;
    }

    public String getTipoDd() {
        return tipoDd;
    }

    public void setTipoDd(String tipoDd) {
        this.tipoDd = tipoDd;
    }

    public DiscoDuro withTipoDd(String tipoDd) {
        this.tipoDd = tipoDd;
        return this;
    }

    public String getCapDd() {
        return capDd;
    }

    public void setCapDd(String capDd) {
        this.capDd = capDd;
    }

    public DiscoDuro withCapDd(String capDd) {
        this.capDd = capDd;
        return this;
    }

}
