/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Jose
 */
public class DesignFactory implements ServicioFactory{
//Factoria concreta que implementa
    //solo intancia el producto concreto que le corresponde
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioDesing();
    }
    
}
