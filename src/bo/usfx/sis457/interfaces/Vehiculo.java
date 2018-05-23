/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.interfaces;
/**
 *
 * @author GONZALO CARLO AYAVIRI
 */
public class Vehiculo implements CaracteristicasCompetencia,CaracteristicasOcupantes {
    
    private int Numero;
    private String Marca;
    private String Modelo;
    private String Cilindrada;
    private float DistaciaRecorrida;
    private float Latitud;
    private double Longitud;
    private String PilotoAbordo;
    private String NaveganteAbordo; 
    private float TiempoEnCompetencia;

    public Vehiculo(int Numero, String Marca, String Modelo, float DistaciaRecorrida, double Longitud, String PilotoAbordo, String NaveganteAbordo) {
        this.Numero = Numero;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.DistaciaRecorrida = DistaciaRecorrida;
        this.Longitud = Longitud;
        this.PilotoAbordo = PilotoAbordo;
        this.NaveganteAbordo = NaveganteAbordo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    public float getDistaciaRecorrida() {
        return DistaciaRecorrida;
    }

    public void setDistaciaRecorrida(float DistaciaRecorrida) {
        this.DistaciaRecorrida = DistaciaRecorrida;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    public String getPilotoAbordo() {
        return PilotoAbordo;
    }

    public void setPilotoAbordo(String PilotoAbordo) {
        this.PilotoAbordo = PilotoAbordo;
    }

    public String getNaveganteAbordo() {
        return NaveganteAbordo;
    }

    public void setNaveganteAbordo(String NaveganteAbordo) {
        this.NaveganteAbordo = NaveganteAbordo;
    }
    @Override
    public float getVelocidadPromedio(){
       float v=this.DistaciaRecorrida/this.TiempoEnCompetencia;
       return v;
    }
    @Override
    public String getGeoPosicion(){
        double latitud=this.Latitud;
        double longitud=this.Longitud;
        return "-"+latitud+",-"+longitud;
    }
    @Override
    public String getPiloto(){
          return "Piloto{" 
                + ", Nombres y Apellidos="+ PilotoAbordo+'}';
    }
    @Override
    public String getNavegante(){
          return "Navegante{" 
                + ", Nombres y Apellidos="+ NaveganteAbordo+'}';
    }
}
