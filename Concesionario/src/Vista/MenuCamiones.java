package Vista;

import Controlador.ControladorCamiones;
import Modelo.Camiones;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuCamiones {
    private Scanner leerDatos;
    private ControladorCamiones contCamiones;
    
    public MenuCamiones() {
        leerDatos = new Scanner(System.in);
        contCamiones = new ControladorCamiones();
    }
    private void borrarUnCamion(){
        System.out.println("Digite la placa a borrar: ");
        Camiones camion= new Camiones();
        camion.setId(leerDatos.next());
        if(contCamiones.borrar(camion))
            System.out.println("Objeto borrado");
        else
            System.out.println("Algo ocurrio, no se pudo eliminar");
    }
    
    
    //Método utilizado para limpiar el escáner luego de leer un número y antes de leer una cadena.
    private void limpiarEscaner() {
        leerDatos.nextLine();
    }

    public void MenuCamiones() {}
  
    public void leerCamiones() {
        Camiones camion = new Camiones();

        System.out.println("Placa:");
        camion.setId(leerDatos.next());

        System.out.println("Color:");
        camion.setColor(leerDatos.next());

        System.out.println("Marca:");
        camion.setMarca(leerDatos.next());

        System.out.println("Número de cambios:");
        camion.setNumeroCambios(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de chasis:");
        camion.setNumeroChasis(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de cilindros:");
        camion.setNumeroCilindros(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de motor:");
        camion.setNumeroMotor(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de puertas:");
        camion.setNumeroPuertas(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Galones por kilómetro::");
        camion.setGalonesKilometro(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tamaño de las llantas:");
        camion.setTamañoLLanta(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tipo de gasolina:");
        camion.setTipoGasolina(leerDatos.nextLine());

        System.out.println("Tipo de transmisión:");
        camion.setTipoTransmision(leerDatos.nextLine());
        
        System.out.println("Tamaño del camion:");
        camion.setTamaño(leerDatos.nextLine());
       
        System.out.println("Tipo de llantas:");
        camion.setTipoLlantas(leerDatos.nextLine());
        
        System.out.println("Tipo de carrocería:");
        camion.setTipoCarroceria(leerDatos.nextLine());
        
        boolean fueIns = contCamiones.insertar(camion);
        if (fueIns) {
            JOptionPane.showMessageDialog(null, "Camioneta O jeep insertado");
            System.out.println("La información de la camioneta o jeep fue almacenada.");
        } else {
            JOptionPane.showMessageDialog(null, "Auto no insertado");
            System.out.println("la informacion de la camioneta o jeep no fue almacenada. placa duplicada");
        }
    }
    public void consultarunCamion(){
        //Solo ocntiene la placa
        Camiones camion = new Camiones();
        System.out.println("Digite la placa que desea: ");
        camion.setId(leerDatos.next());
        camion = (Camiones) contCamiones.consultarUno(camion);
        System.out.println(camion.toString());
    }
    
    public void modificarUnCamion(){
        //Solo obtiene la placa
        
        Camiones camion = new Camiones();
        System.out.println("Digite la placa del auto que desea modificar: ");
        camion.setId(leerDatos.next());
        System.out.println("Digite la nueva placa: ");
        String datoNuevo = leerDatos.next();
        camion = (Camiones) contCamiones.modificar(camion, datoNuevo);
        System.out.println(camion.toString());
    }
    
    
    

    public void menuCamiones()
    {
        System.out.println("\n***Bienvenido al software del Concesionario***\n");
        System.out.println("A continuación se enseñarán las opciones posibles:");
        System.out.println("1. Insertar el camion que desea ");
        System.out.println("2. Consultar todos");
        System.out.println("3. Consultar una camion");
        System.out.println("4. Modificar un camion");
        System.out.println("5. Ordenar camion por placa");
        System.out.println("6. Ordenar camion por número de motor");
        System.out.println("7. Ordenar camion por marca");
        System.out.println("8. Borrar camion");
        System.out.println("Digite su opción:");
        int opc = leerDatos.nextInt();

        limpiarEscaner(); //Limpia el escaner luego de leer un número.

        switch (opc) {

            case 1:
                leerCamiones();  //leerAutomovil();
                break;

            case 2:
                contCamiones.consultarTodos();
                break;

            case 3:
                consultarunCamion();
                break;

            case 4:
                modificarUnCamion();
                break;

            case 5:
                contCamiones.Ordenar();
                break;

            case 6:
                contCamiones.Ordenar(0, ControladorCamiones.arregloCamiones.size() - 1);
                break;

            case 7:
                contCamiones.Ordenamiento();
                break;
            case 8:
                borrarUnCamion();
                break;

            default:
                System.out.println("Opción no válida.");
                System.exit(0);
                break;
        
        }
        limpiarEscaner();
    }    
   
}
