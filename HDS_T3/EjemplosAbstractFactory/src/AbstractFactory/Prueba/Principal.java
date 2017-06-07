/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Prueba;


import AbstractFactory.DesignFactory;
import AbstractFactory.ServicioFactory;
import AbstractFactory.ServicioInformatico;
import AbstractFactory.SoftwareFactory;        
import AbstractFactory.WebsiteFactory;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author Jose
 */
public class Principal {
    
    private static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        
        int o;
        do{
            o = preguntarServicio();
            switch(o){
                case 1:
                    usarServicio(new DesignFactory());
                    break;
                case 2:
                    usarServicio(new SoftwareFactory());
                    break;
                 case 3:
                    usarServicio(new SoftwareFactory());
                    break;
                 case 4:
                    usarServicio(new SoftwareFactory());
                    break;
                 default:
                     System.out.println("se ha ingresado una opcion invalidad");
            }
            System.out.println("\n");
        }while(o!=4);
        
    }
    public static void usarServicio(ServicioFactory factory){
        
        ServicioInformatico servicio = factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }
    public static int preguntarServicio(){
        System.out.println(
                "Menu De Opciones \n"
                + "------------------------->\n"
                +"1. Solicitar servico de siseño grafico.\n"
                +"2. Solicitar desarrollo de sowftware educativo.\n"
                +"3. Solicitar creacion de sitio web.\n"
                +"4. Cerrar programa \n"
                +"Seleccione opcion");
        
         return Integer.parseInt(S.nextLine());
    }
   
}
