/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

/**
 *
 * @author GONZALO CARLO AYAVIRI
 */
public class Piloto extends Competidor {
    private String CertificadoAfiliacion;

    public Piloto(String Documento, String Nombres, String Apellidos, int NroLicencia, String Categoria,String CertificadoAfiliacion) {
        super(Documento, Nombres, Apellidos, NroLicencia, Categoria);
        this.CertificadoAfiliacion = CertificadoAfiliacion;
    }

    public String getCertificadoAfiliacion() {
        return CertificadoAfiliacion;
    }

    public void setCertificadoAfiliacion(String CertificadoAfiliacion) {
        this.CertificadoAfiliacion = CertificadoAfiliacion;
    }

    @Override
    public String getTipoPersona(){  
        return "Es el Piloto";
    }  
}
