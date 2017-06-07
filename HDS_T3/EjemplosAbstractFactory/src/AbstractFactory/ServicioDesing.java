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
public class ServicioDesing implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("el trabajador a sido asignado a diseñadores graficos disponibles");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("ellos han determinado de terminar el trabajo como maximo el 12/07/17");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("debe realizar el pago al momento de recoger el logo");
    }

 
    
}
