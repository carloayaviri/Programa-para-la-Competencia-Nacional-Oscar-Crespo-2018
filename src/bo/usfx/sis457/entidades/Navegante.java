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
public class Navegante extends Competidor {
    private String CertificadoMecanica;

    public Navegante(String Documento, String Nombres, String Apellidos, int NroLicencia, String Categoria,String CertificadoMecanica) {
        super(Documento, Nombres, Apellidos, NroLicencia, Categoria);
        this.CertificadoMecanica = CertificadoMecanica;
    }

    public String getCertificadoMecanica() {
        return CertificadoMecanica;
    }

    public void setCertificadoMecanica(String CertificadoMecanica) {
        this.CertificadoMecanica = CertificadoMecanica;
    }
    
     @Override
    public String getTipoPersona() {
        return "Es el Navegante";
    }
    
}
