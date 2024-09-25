/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Link
 */
public abstract class Paquetes {
        private double cost;

    public Paquetes(double cost) {
        this.cost = cost;
    }

    public double getAditionalCost() {
        return cost;
    }

    public void setAditionalCost(double aditionalCost) {
        this.cost = cost;
    }
}
