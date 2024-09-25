/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

import Interfaces.iIterator;
import dominio.Envio;
import java.io.ObjectInputFilter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Link
 */
public class EnvioIterator implements iIterator{
    List<Double> collection;
    private int index;
    
    public EnvioIterator(Envio envio){
        collection = new ArrayList<>();
        collection.add(envio.getPaquete().getAditionalCost());
        collection.add(envio.getTransporte().getCost());
        collection.add(envio.getServicio().getCost());
        index=0;
    }

    @Override
    public double getNext() {
        double d = collection.get(index);
        index++;
        return d;
    }

    @Override
    public boolean hasNext() {
        return collection.size()>index;
    }
    
    
}
