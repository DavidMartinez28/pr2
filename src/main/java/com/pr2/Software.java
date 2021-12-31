
package com.pr2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Software {

    @SerializedName("licencia_pago")
    @Expose
    private LicenciaPago licenciaPago;
    @SerializedName("licencia_libre")
    @Expose
    private LicenciaLibre licenciaLibre;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Software() {
    }

    /**
     * 
     * @param licenciaLibre
     * @param licenciaPago
     */
    public Software(LicenciaPago licenciaPago, LicenciaLibre licenciaLibre) {
        super();
        this.licenciaPago = licenciaPago;
        this.licenciaLibre = licenciaLibre;
    }

    public LicenciaPago getLicenciaPago() {
        return licenciaPago;
    }

    public void setLicenciaPago(LicenciaPago licenciaPago) {
        this.licenciaPago = licenciaPago;
    }

    public Software withLicenciaPago(LicenciaPago licenciaPago) {
        this.licenciaPago = licenciaPago;
        return this;
    }

    public LicenciaLibre getLicenciaLibre() {
        return licenciaLibre;
    }

    public void setLicenciaLibre(LicenciaLibre licenciaLibre) {
        this.licenciaLibre = licenciaLibre;
    }

    public Software withLicenciaLibre(LicenciaLibre licenciaLibre) {
        this.licenciaLibre = licenciaLibre;
        return this;
    }

}
