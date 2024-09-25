/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import dominio.Envio;
import dominio.Paquetes;
import dominio.Servicio;
import dominio.Transporte;

/**
 *
 * @author Link
 */
public interface iEnvioBuilder {
    public void buildServicio(Servicio servicio);
    public void buildTransporte(Transporte transporte);
    public void buildPaquete(Paquetes paquete);
    public void agregarCosto(double costo);
    public Envio getProducto();
    public void buildDistancia(double distancia);
    public void buildTiempoDeEntrega(double tiempoEntrega);
    public void reiniciar();
}
