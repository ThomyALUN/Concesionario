
package Vista;

import Controlador.ControladorBusesYBusetas;
import Modelo.BusesYBusetas;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandra
 */
public class MenuBusesYBusetas {
    
      private Scanner leerDatos; 
      private ControladorBusesYBusetas contBusesYBusetas;

    private void borrarUnBusYBusetas(){
        System.out.println("Digite la placa a borrar: ");
        BusesYBusetas BusYBusetas = new BusesYBusetas();
        BusYBusetas.setId(leerDatos.next());
        if(contBusesYBusetas.borrar(BusYBusetas))
            System.out.println("Objeto borrado");
        else
            System.out.println("Algo ocurrio, no se pudo eliminar");
    }
    
    
    public MenuBusesYBusetas() {
        //Separar memoria para esos objetos
        leerDatos = new Scanner(System.in);
        contBusesYBusetas = new ControladorBusesYBusetas();
    }
    
    private void limpiarEscaner() {
        leerDatos.nextLine();
    }
    private void leerBusesYBusetas()
    {
        BusesYBusetas busoBuseta = new BusesYBusetas();
    
        System.out.println("Placa:");
        busoBuseta.setId(leerDatos.next());

        System.out.println("Color:");
        busoBuseta.setColor(leerDatos.next());

        System.out.println("Marca:");
        busoBuseta.setMarca(leerDatos.next());

        System.out.println("Número de cambios:");
        busoBuseta.setNumeroCambios(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de chasis:");
        busoBuseta.setNumeroChasis(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de cilindros:");
        busoBuseta.setNumeroCilindros(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de motor:");
        busoBuseta.setNumeroMotor(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de puertas:");
        busoBuseta.setNumeroPuertas(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Galones por kilómetro::");
        busoBuseta.setGalonesKilometro(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tamaño de las llantas:");
        busoBuseta.setTamañoLLanta(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tipo de gasolina:");
        busoBuseta.setTipoGasolina(leerDatos.nextLine());

        System.out.println("Tipo de transmisión:");
        busoBuseta.setTipoTransmision(leerDatos.nextLine());
        
        System.out.println("Tipo de Bus o Busetas:");
        System.out.println("1.Electrica \n2.Gasolina");
        int vlr=leerDatos.nextInt();
        String seleccion;
        if (vlr==1){
            seleccion="Eléctrica";
        }
        else{
            seleccion="Gasolina";
        }
        busoBuseta.setTipoBuseta(seleccion);
        limpiarEscaner();
        
        boolean fueIns=contBusesYBusetas.insertar(busoBuseta);
        if (fueIns) {
            JOptionPane.showMessageDialog(null, "Bus insertado");
            System.out.println("La información del bus fue almacenada.");
        }
        else {
        JOptionPane.showMessageDialog(null, "Bus no insertado");
            System.out.println("la informacion del bus no fue almacenada. placa duplicada");
        }
     

        
    }
    
    public void consultarunBusesYBusetas(){
        //Solo ocntiene la placa
        BusesYBusetas BusYBusetas = new BusesYBusetas();
        System.out.println("Digite la placa que desea: ");
        BusYBusetas.setId(leerDatos.next());
        BusYBusetas = (BusesYBusetas) contBusesYBusetas.consultarUno(BusYBusetas);
        System.out.println(BusYBusetas.toString());
    }
    
    public void modificarUnBusYBusetas(){
        //Solo ocntiene la placa
        
        BusesYBusetas BusYBusetas = new BusesYBusetas();
        System.out.println("Digite la placa del auto que desea modificar: ");
        BusYBusetas.setId(leerDatos.next());
        System.out.println("Digite la nueva placa: ");
        String datoNuevo = leerDatos.next();
        BusYBusetas = (BusesYBusetas) contBusesYBusetas.modificar(BusYBusetas,datoNuevo);
        System.out.println(BusYBusetas.toString());
    }
    
    
    

    public void menuBusYBusetas()
    {
        System.out.println("\n***Bienvenido al software del Concesionario***\n");
        System.out.println("A continuación se enseñarán las opciones posibles:");
        System.out.println("1. Insertar la buseta o bus que desea");
        System.out.println("2. Consultar todos");
        System.out.println("3. Consultar un bus O buseta");
        System.out.println("4. Modificar buses o busetas");
        System.out.println("5. Ordenar busetas por placa");
        System.out.println("6. Ordenar buses o busetas por número de motor");
        System.out.println("7. Ordenar busetas o buses por marca");
        System.out.println("8. Borrar buses o busetas");
        System.out.println("Digite su opción:");
        int opc = leerDatos.nextInt();

        limpiarEscaner(); //Limpia el escaner luego de leer un número.

        switch (opc) {

            case 1:
                leerBusesYBusetas();  //leerAutomovil();
                break;

            case 2:
                contBusesYBusetas.consultarTodos();
                break;

            case 3:
                consultarunBusesYBusetas();
                break;

            case 4:
                modificarUnBusYBusetas();
                break;

            case 5:
                contBusesYBusetas.Ordenar();
                break;

            case 6:
                contBusesYBusetas.Ordenar(0, ControladorBusesYBusetas.arregloBusesYBusetas.size() - 1);
                break;

            case 7:
                contBusesYBusetas.Ordenamiento();
                break;
            case 8:
                borrarUnBusYBusetas();
                break;

            default:
                System.out.println("Opción no válida.");
                System.exit(0);
                break;
        
        }
        limpiarEscaner();
    }    
   
}