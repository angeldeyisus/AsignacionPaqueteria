/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import dominio.Envio;
import dominio.Transporte;

/**
 *
 * @author Link
 */
public interface iEnvioManejador {
    public Envio crearEnvio(String servicio, double distancia, String tipoPaquete);
    public double getPrecioDistancia(double distancia);
    public void setServicio(String servicio);
    public void setTransporte(String servicio, double distancia, String tipoPaquete);
    public void setPaquete(String paquete);
    public void setDistancia(double distancia);
    public double getCosto(Envio envio);
    public double getTiempoEntrega(double distancia, Transporte transporte);
}
