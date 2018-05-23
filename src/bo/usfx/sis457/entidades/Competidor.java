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
public class Competidor extends Participante{
    protected int NroLicencia;
    protected String Categoria;

    public Competidor(String Documento, String Nombres, String Apellidos, int NroLicencia, String Categoria) {
        
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.NroLicencia = NroLicencia;
        this.Categoria = Categoria;
    }
     
    public int getNroLicencia() {
        return NroLicencia;
    }

    public void setNroLicencia(int NroLicencia) {
        this.NroLicencia = NroLicencia;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    @Override
    public String getTipoPersona(){
        return "Es Competidor";
    }
}
