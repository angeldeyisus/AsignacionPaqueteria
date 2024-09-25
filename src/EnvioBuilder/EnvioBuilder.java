/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnvioBuilder;

import Interfaces.iEnvioBuilder;
import dominio.Envio;
import dominio.Paquetes;
import dominio.Servicio;
import dominio.Transporte;

/**
 *
 * @author Link
 */
public class EnvioBuilder implements iEnvioBuilder{
    
    private Envio producto;

    @Override
    public void buildServicio(Servicio servicio) {
        producto.setServicio(servicio);
    }

    @Override
    public void buildTransporte(Transporte transporte) {
        producto.setTransporte(transporte);
    }

    @Override
    public void buildPaquete(Paquetes paquete) {
        producto.setPaquete(paquete);
    }

    @Override
    public void agregarCosto(double costo) {
        producto.setCostoFinal(producto.getCostoFinal()+costo);
    }

    @Override
    public Envio getProducto() {
        return producto;
    }

    @Override
    public void buildDistancia(double distancia) {
        producto.setDistancia(distancia);
    }

    @Override
    public void buildTiempoDeEntrega(double tiempoEntrega) {
        producto.setTiempoEntrega(tiempoEntrega);
    }

    @Override
    public void reiniciar() {
        this.producto = new Envio();
    }
    
}
