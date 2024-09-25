/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Link
 */
public class Envio {
    private Servicio servicio;
    private Transporte transporte;
    private Paquetes paquete;
    private double distancia;
    private double costoFinal;
    private double tiempoEntrega;
    
    public Envio(){
        
    }

    public Envio(Servicio servicio, Transporte transporte, Paquetes paquete, double distancia, double costoFinal) {
        this.servicio = servicio;
        this.transporte = transporte;
        this.paquete = paquete;
        this.distancia = distancia;
        costoFinal=0;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Paquetes getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquetes paquete) {
        this.paquete = paquete;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    public double getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(double tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    @Override
    public String toString() {
        return "Envio{" + "servicio=" + servicio + ", transporte=" + transporte + ", paquete=" + paquete + ", distancia=" + distancia + ", costoFinal=" + costoFinal + ", tiempoEntrega=" + tiempoEntrega + '}';
    }
    
    
    
}
