package Vista;

import Controlador.ControladorCamionetasYJeep;
import Modelo.CamionetasYJeep;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuCamionetasYJeep {
    private Scanner leerDatos;
    private ControladorCamionetasYJeep contCamionetaYJeep;
    
    public MenuCamionetasYJeep() {
        leerDatos = new Scanner(System.in);
        contCamionetaYJeep = new ControladorCamionetasYJeep();
    }
    private void borrarUnCamionetasYJeep(){
        System.out.println("Digite la placa a borrar: ");
        CamionetasYJeep camioneta= new CamionetasYJeep();
        camioneta.setId(leerDatos.next());
        if(contCamionetaYJeep.borrar(camioneta))
            System.out.println("Objeto borrado");
        else
            System.out.println("Algo ocurrio, no se pudo eliminar");
    }
    
    
    //Método utilizado para limpiar el escáner luego de leer un número y antes de leer una cadena.
    private void limpiarEscaner() {
        leerDatos.nextLine();
    }

    public void MenuCamionetasYJeep() {}
  
    public void leerCamionetasYJeep() {
        CamionetasYJeep camioneta = new CamionetasYJeep();

        System.out.println("Placa:");
        camioneta.setId(leerDatos.next());

        System.out.println("Color:");
        camioneta.setColor(leerDatos.next());

        System.out.println("Marca:");
        camioneta.setMarca(leerDatos.next());

        System.out.println("Número de cambios:");
        camioneta.setNumeroCambios(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de chasis:");
        camioneta.setNumeroChasis(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de cilindros:");
        camioneta.setNumeroCilindros(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de motor:");
        camioneta.setNumeroMotor(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de puertas:");
        camioneta.setNumeroPuertas(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Galones por kilómetro::");
        camioneta.setGalonesKilometro(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tamaño de las llantas:");
        camioneta.setTamañoLLanta(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tipo de gasolina:");
        camioneta.setTipoGasolina(leerDatos.nextLine());

        System.out.println("Tipo de transmisión:");
        camioneta.setTipoTransmision(leerDatos.nextLine());
        
        System.out.println("Tipo: \n1. Pick-Up \n2. Furgoneta \n3. Automovil todo terreno \n4. Minivan");
        camioneta.setTipoCamionetaJeep(leerDatos.nextInt());
        limpiarEscaner();
        
        System.out.println("Tipo de Carroceria: \n1. Con platon \n2. Con esteras");
        camioneta.setTipoCarroceria(leerDatos.nextInt());
        limpiarEscaner();
        
        System.out.println("Tipo de chasis: \n1. 4x4 \n2. 4x2");
        camioneta.setTipoChasis(leerDatos.nextInt());
        limpiarEscaner();    
        boolean fueIns = contCamionetaYJeep.insertar(camioneta);
        if (fueIns) {
            JOptionPane.showMessageDialog(null, "Camioneta O jeep insertado");
            System.out.println("La información de la camioneta o jeep fue almacenada.");
        } else {
            JOptionPane.showMessageDialog(null, "Auto no insertado");
            System.out.println("la informacion de la camioneta o jeep no fue almacenada. placa duplicada");
        }
    }
    public void consultarunCamionetaYJeep(){
        //Solo ocntiene la placa
        CamionetasYJeep camion = new CamionetasYJeep();
        System.out.println("Digite la placa que desea: ");
        camion.setId(leerDatos.next());
        camion = (CamionetasYJeep) contCamionetaYJeep.consultarUno(camion);
        System.out.println(camion.toString());
    }
    
    public void modificarUnCamionetasYJeep(){
        //Solo ocntiene la placa
        
        CamionetasYJeep camion = new CamionetasYJeep();
        System.out.println("Digite la placa del auto que desea modificar: ");
        camion.setId(leerDatos.next());
        System.out.println("Digite la nueva placa: ");
        String datoNuevo = leerDatos.next();
        camion = (CamionetasYJeep) contCamionetaYJeep.modificar(camion, datoNuevo);
        System.out.println(camion.toString());
    }
    
    
    

    public void menuCamionetasYJeep()
    {
        System.out.println("\n***Bienvenido al software del Concesionario***\n");
        System.out.println("A continuación se enseñarán las opciones posibles:");
        System.out.println("1. Insertar la camioneta o Jeep que desea");
        System.out.println("2. Consultar todos");
        System.out.println("3. Consultar una camioneta o Jeep");
        System.out.println("4. Modificar camioneta o Jeep");
        System.out.println("5. Ordenar camioneta o Jeep por placa");
        System.out.println("6. Ordenar camioneta o Jeep por número de motor");
        System.out.println("7. Ordenar camioneta o Jeep por marca");
        System.out.println("8. Borrar camioneta o Jeep");
        System.out.println("Digite su opción:");
        int opc = leerDatos.nextInt();

        limpiarEscaner(); //Limpia el escaner luego de leer un número.

        switch (opc) {

            case 1:
                leerCamionetasYJeep();  //leerAutomovil();
                break;

            case 2:
                contCamionetaYJeep.consultarTodos();
                break;

            case 3:
                consultarunCamionetaYJeep();
                break;

            case 4:
                modificarUnCamionetasYJeep();
                break;

            case 5:
                contCamionetaYJeep.Ordenar();
                break;

            case 6:
                contCamionetaYJeep.Ordenar(0, ControladorCamionetasYJeep.arregloCamionetasYJeep.size() - 1);
                break;

            case 7:
                contCamionetaYJeep.Ordenamiento();
                break;
            case 8:
                borrarUnCamionetasYJeep();
                break;

            default:
                System.out.println("Opción no válida.");
                System.exit(0);
                break;
        
        }
        limpiarEscaner();
    }    
   
}
