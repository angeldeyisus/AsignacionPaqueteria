/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Interfaces.iPaquetesFactory;
import dominio.CajaMediana;
import dominio.Paquetes;

/**
 *
 * @author Link
 */
public class CajaMedianaCreator implements iPaquetesFactory{

    @Override
    public Paquetes crearPaquete() {
        return new CajaMediana();
    }
    
}
