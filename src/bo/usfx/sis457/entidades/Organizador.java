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
public class Organizador extends Participante {
    private String Cargo;
    private String Comision;

    public Organizador(String Documento, String Nombres, String Apellidos,String Cargo, String Comision) {
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Cargo = Cargo;
        this.Comision = Comision;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getComision() {
        return Comision;
    }

    public void setComision(String Comision) {
        this.Comision = Comision;
    }

    
    @Override
    public String getTipoPersona() {
        return "Es Organizador";
    }
    
    
}
