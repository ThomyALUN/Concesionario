
package Vista;

import Controlador.ControladorVolquetas;
import Modelo.Volquetas;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuVolquetas {
    private Scanner leerDatos;
    private ControladorVolquetas contVolquetas;

    //Separar memoria (constructor vacio)  
    public MenuVolquetas() {
        leerDatos = new Scanner(System.in);
        contVolquetas = new ControladorVolquetas();
    }
    
    //Método utilizado para limpiar el escáner luego de leer un número y antes de leer una cadena.
    private void limpiarEscaner() {
        leerDatos.nextLine();
    }

    public void MenuVolquetas() {}
    
    private void borrarUnVolqueta(){
        System.out.println("Digite la placa a borrar: ");
        Volquetas Volqueta = new Volquetas();
        Volqueta.setId(leerDatos.next());
        if(contVolquetas.borrar(Volqueta))
            System.out.println("Objeto borrado");
        else
            System.out.println("Algo ocurrio, no se pudo eliminar");
    }
    
    
    public void leerVolquetas() {
        Volquetas volqueta = new Volquetas();
        System.out.println("Ingrese los datos del volqueta.");

        System.out.println("Placa:");
        volqueta.setId(leerDatos.nextLine());

        System.out.println("Color:");
        volqueta.setColor(leerDatos.nextLine());

        System.out.println("Marca:");
        volqueta.setMarca(leerDatos.nextLine());

        System.out.println("Número de cambios:");
        volqueta.setNumeroCambios(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de chasis:");
        volqueta.setNumeroChasis(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de cilindros:");
        volqueta.setNumeroCilindros(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de motor:");
        volqueta.setNumeroMotor(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de puertas:");
        volqueta.setNumeroPuertas(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Galones por kilómetro::");
        volqueta.setGalonesKilometro(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tamaño de las llantas:");
        volqueta.setTamañoLLanta(leerDatos.nextFloat());
        limpiarEscaner();
        
        System.out.println("Tipo de gasolina:");
        volqueta.setTipoGasolina(leerDatos.nextLine());

        System.out.println("Tipo de transmisión:");
        volqueta.setTipoTransmision(leerDatos.nextLine());
        
        
        System.out.println("Tipo de volco: \n1. mediano \n2. grande \n3. pequeño \n4. tipo tractor");
        volqueta.setTipovolco(leerDatos.nextInt());
        

        boolean fueIns = contVolquetas.insertar(volqueta);
        if (fueIns) {
            JOptionPane.showMessageDialog(null, "Volqueta insertada");
            System.out.println("La información del volqueta fue almacenada.");
        } else {
            JOptionPane.showMessageDialog(null, "Volqueta no insertada");
            System.out.println("la informacion de la volqueta no fue almacenada. placa duplicada");
        }
    }
    
    public void consultarunVolquetas(){
        //Solo ocntiene la placa
        Volquetas volqueta = new Volquetas();
        System.out.println("Digite la placa que desea: ");
        volqueta.setId(leerDatos.next());
        volqueta = (Volquetas) contVolquetas.consultarUno(volqueta);
        System.out.println(volqueta.toString());
    }
    
    public void modificarUnVolqueta(){
        //Solo ocntiene la placa
        
        Volquetas volqueta = new Volquetas();
        System.out.println("Digite la placa del volqueta que desea modificar: ");
        volqueta.setId(leerDatos.next());
        System.out.println("Digite la nueva placa: ");
        String datoNuevo = leerDatos.next();
        volqueta = (Volquetas) contVolquetas.modificar(volqueta,datoNuevo);
        System.out.println(volqueta.toString());
    }
    
    
    

    public void menuVolqueta()
    {
        System.out.println("\n***Bienvenido al software del Concesionario***\n");
        System.out.println("A continuación se enseñarán las opciones posibles:");
        System.out.println("1. Insertar la volqueta que desea");
        System.out.println("2. Consultar todos");
        System.out.println("3. Consultar una volqueta");
        System.out.println("4. Modificar una volqueta");
        System.out.println("5. Ordenar volquetas por placa");
        System.out.println("6. Ordenar volquetas por número de motor");
        System.out.println("7. Ordenar volquetas por marca");
        System.out.println("8. Borrar volqueta");
        System.out.println("Digite su opción:");
        int opc = leerDatos.nextInt();

        limpiarEscaner(); //Limpia el escaner luego de leer un número.

        switch (opc) {

            case 1:
                leerVolquetas(); 
                break;

            case 2:
                contVolquetas.consultarTodos();
                break;

            case 3:
                consultarunVolquetas();
                break;

            case 4:
                modificarUnVolqueta();
                break;

            case 5:
                contVolquetas.Ordenar();
                break;

            case 6:
                contVolquetas.Ordenar(0, ControladorVolquetas.arregloVolquetas.size() - 1);
                break;

            case 7:
                contVolquetas.Ordenamiento();
                break;
            case 8:
                borrarUnVolqueta();
                break;

            default:
                System.out.println("Opción no válida.");
                System.exit(0);
                break;
        
        }
        limpiarEscaner();
    }    
    
    
}
