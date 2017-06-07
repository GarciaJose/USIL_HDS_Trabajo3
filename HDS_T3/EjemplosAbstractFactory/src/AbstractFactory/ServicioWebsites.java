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
public class ServicioWebsites implements ServicioInformatico{

    @Override
    public void asignarTrabajo() {
        System.out.println("el personal encargado del desarrollo de sitio web "
                + "ha aceptado el trabajo");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("el sitio web con Garcia Desing sera terminado a mas "
                + "tardar el 03/07/17");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("el monto a pagar no incluye el pago por dominio y hosting");
    }

   
    
    
}
