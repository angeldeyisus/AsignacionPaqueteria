/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fachadas;

import Factory.AutoCreator;
import Factory.BicicletaCreator;
import Factory.CajaGrandeCreator;
import Factory.CajaMedianaCreator;
import Factory.CajaPequeñaCreator;
import Factory.DronCreator;
import Factory.MotocicletaCreator;
import Factory.SobreCreator;
import Interfaces.iFactoryManejador;
import dominio.Estandar;
import dominio.Express;
import dominio.Paquetes;
import dominio.Transporte;

/**
 *
 * @author Link
 */
public class FactoryManejador implements iFactoryManejador {
    private SobreCreator sobreCreador;
    private CajaPequeñaCreator cajaPequeñaCreator;
    private CajaMedianaCreator cajaMedianaCreator;
    private CajaGrandeCreator cajaGrandeCreator;
    private Estandar servicioEstandar;
    private Express servicioExpress;
    private DronCreator dronCreator;
    private BicicletaCreator bicicletaCreator;
    private MotocicletaCreator motocicletaCreator;
    private AutoCreator autoCreator;
    
    public FactoryManejador(){
        this.autoCreator = new AutoCreator();
        this.bicicletaCreator = new BicicletaCreator();
        this.cajaGrandeCreator = new CajaGrandeCreator();
        this.cajaMedianaCreator = new CajaMedianaCreator();
        this.cajaPequeñaCreator = new CajaPequeñaCreator();
        this.dronCreator = new DronCreator();
        this.motocicletaCreator = new MotocicletaCreator();
        this.servicioEstandar = new Estandar();
        this.servicioExpress = new Express();
        this.sobreCreador = new SobreCreator();
    }

    @Override
    public Paquetes crearSobre() {
        return sobreCreador.crearPaquete();
    }

    @Override
    public Paquetes crearCajaPequeña() {
        return cajaPequeñaCreator.crearPaquete();
    }

    @Override
    public Paquetes crearCajaMediana() {
        return cajaMedianaCreator.crearPaquete();
    }

    @Override
    public Paquetes crearCajaGrande() {
        return cajaGrandeCreator.crearPaquete();
    }

    @Override
    public Estandar getEnvioEstandar() {
        return servicioEstandar;
    }

    @Override
    public Express getEnvioExpress() {
        return servicioExpress;
    }

    @Override
    public Transporte crearDron() {
        return dronCreator.crearTransporte();
    }

    @Override
    public Transporte crearBicicleta() {
        return bicicletaCreator.crearTransporte();
    }

    @Override
    public Transporte crearAuto() {
        return autoCreator.crearTransporte();
    }

    @Override
    public Transporte crearMotocicleta() {
        return motocicletaCreator.crearTransporte();
    }
    
}
