/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Interfaces.iPaquetesFactory;
import dominio.Paquetes;
import dominio.Sobre;

/**
 *
 * @author Link
 */
public class SobreCreator implements iPaquetesFactory{

    @Override
    public Paquetes crearPaquete() {
        return new Sobre();
    }
    
}
