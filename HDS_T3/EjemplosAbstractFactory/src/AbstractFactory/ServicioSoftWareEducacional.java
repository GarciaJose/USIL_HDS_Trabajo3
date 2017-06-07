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
public class ServicioSoftWareEducacional implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("Nuestros programadores han sido informados sobre"
                + "que programa realizar");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("se a fijado como fecha de entrega el dia 14/08/17");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("el monto a pagar sera prporcional a la cantidad de "
                + "estudiantes que haran uso del curso");
    }
    
}
