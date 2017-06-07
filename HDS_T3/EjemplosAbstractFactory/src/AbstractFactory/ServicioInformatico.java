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
public interface ServicioInformatico {
    //producto abtracto 
    //define los metodos que deben ser inplementados
    public void asignarTrabajo();
    public void indicarFechaEntrega();
    public void informarSobrePago();
}
