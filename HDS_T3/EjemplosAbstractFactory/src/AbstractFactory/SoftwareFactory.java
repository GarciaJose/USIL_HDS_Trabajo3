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
public class SoftwareFactory implements ServicioFactory{
//Factoria concreta que implementa
    @Override
    public ServicioInformatico crearServicio() {
      return new ServicioSoftWareEducacional();
    }
    
}
