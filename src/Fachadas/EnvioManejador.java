/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fachadas;

import EnvioBuilder.EnvioBuilder;
import Interfaces.iEnvioManejador;
import dominio.Envio;
import dominio.Transporte;
import iterator.EnvioIterator;

/**
 *
 * @author Link
 */
public class EnvioManejador implements iEnvioManejador{
    
    private FactoryManejador manejadorFactory;
    private EnvioBuilder envioBuilder;
    
    public EnvioManejador(){
        this.manejadorFactory = new FactoryManejador();
        this.envioBuilder = new EnvioBuilder();
    }

    @Override
    public Envio crearEnvio(String servicio, double distancia, String tipoPaquete) {
        envioBuilder.reiniciar();
        setServicio(servicio);
        setTransporte(servicio, distancia, tipoPaquete);
        setPaquete(tipoPaquete);
        setDistancia(distancia);
        envioBuilder.buildTiempoDeEntrega(getTiempoEntrega(distancia, envioBuilder.getProducto().getTransporte()));
        envioBuilder.agregarCosto(getPrecioDistancia(distancia));
        envioBuilder.agregarCosto(getCosto(envioBuilder.getProducto()));
        
        return envioBuilder.getProducto();
    }

    @Override
    public double getPrecioDistancia(double distancia) {
        if(distancia>10){
            return (distancia-10)*5;
        }
        return 0;
    }

    @Override
    public void setServicio(String servicio) {
        if(servicio.equalsIgnoreCase("Express")){
            envioBuilder.buildServicio(manejadorFactory.getEnvioExpress());
        } else{
            envioBuilder.buildServicio(manejadorFactory.getEnvioEstandar());
        }
    }

    @Override
    public void setTransporte(String servicio, double distancia, String tipoPaquete) {
        if(distancia <=1){
            if(servicio.equalsIgnoreCase("Express")){
                envioBuilder.buildTransporte(manejadorFactory.crearDron());
            } else {
                envioBuilder.buildTransporte(manejadorFactory.crearBicicleta());
            }
        }else{
            if(servicio.equalsIgnoreCase("Express")){
                envioBuilder.buildTransporte(manejadorFactory.crearMotocicleta());
            } else {
                envioBuilder.buildTransporte(manejadorFactory.crearBicicleta());
            }
        }if(tipoPaquete.equalsIgnoreCase("Caja Grande")){
            envioBuilder.buildTransporte(manejadorFactory.crearAuto());
        }
    }

    @Override
    public void setPaquete(String paquete) {
        if(paquete.equalsIgnoreCase("Caja Grande")){
            envioBuilder.buildPaquete(manejadorFactory.crearCajaGrande());
        } else {
            if(paquete.equalsIgnoreCase("Sobre")){
                envioBuilder.buildPaquete(manejadorFactory.crearSobre());
            } else {
                if(paquete.equalsIgnoreCase("Caja Pequeña")){
                    envioBuilder.buildPaquete(manejadorFactory.crearCajaPequeña());
                } else {
                    envioBuilder.buildPaquete(manejadorFactory.crearCajaMediana());
                }
            }
        }
    }

    @Override
    public void setDistancia(double distancia) {
        envioBuilder.buildDistancia(distancia);
    }

    @Override
    public double getCosto(Envio envio) {
        EnvioIterator iterador = new EnvioIterator(envio);
        double costo = 0;
        
        while(iterador.hasNext()){
            costo = costo + iterador.getNext();
        }
        return costo;
    }

    @Override
    public double getTiempoEntrega(double distancia, Transporte transporte) {
        return distancia*60/transporte.getAverageSpeed();
    }
    
}
