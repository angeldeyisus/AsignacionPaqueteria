/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Interfaces.iTransporteFactory;
import dominio.Bicicleta;
import dominio.Transporte;

/**
 *
 * @author Link
 */
public class BicicletaCreator implements iTransporteFactory{

    @Override
    public Transporte crearTransporte() {
        return new Bicicleta();
    }
    
}
