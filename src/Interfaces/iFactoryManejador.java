/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import dominio.Estandar;
import dominio.Express;
import dominio.Paquetes;
import dominio.Transporte;

/**
 *
 * @author Link
 */
public interface iFactoryManejador {
    
    public Paquetes crearSobre();
    public Paquetes crearCajaPequeña();
    public Paquetes crearCajaMediana();
    public Paquetes crearCajaGrande();
    public Estandar getEnvioEstandar();
    public Express getEnvioExpress();
    public Transporte crearDron();
    public Transporte crearBicicleta();
    public Transporte crearAuto();
    public Transporte crearMotocicleta();
    
}
