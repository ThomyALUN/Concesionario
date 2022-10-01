
package Vista;

import Controlador.ControladorCarro;
import Modelo.Carros;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jero
 */
public class MenuCarros {
    
      private Scanner leerDatos; 
      private ControladorCarro contCarros;
      
      public void insertarDatosDefault(){
          
          Carros carro = new Carros("tipoCarro", "tipoDeCarrocería", "AA", "color", "marca", 0, 0, 0, 0, "tipoTransmision", 0, 0, 0, "tipoGasolina");
          contCarros.insertar(carro);
          
          
          
       }
      
    private void borrarUncarro(){
        System.out.println("Digite la placa a borrar: ");
        Carros carro = new Carros();
        carro.setId(leerDatos.next());
        if(contCarros.borrar(carro))
            System.out.println("Objeto borrado");
        else
            System.out.println("Algo ocurrio, no se pudo eliminar");
    }
    
    
    public MenuCarros() {
        //Separar memoria para esos objetos
        leerDatos = new Scanner(System.in);
        contCarros = new ControladorCarro();
        insertarDatosDefault();
    }
    
    private void limpiarEscaner() {
        leerDatos.nextLine();
    }
    private void leerCarros()
    {
        Carros carro2 = new Carros();
    
        System.out.println("Placa:");
        carro2.setId(leerDatos.next());

        System.out.println("Color:");
        carro2.setColor(leerDatos.next());

        System.out.println("Marca:");
        carro2.setMarca(leerDatos.next());

        System.out.println("Número de cambios:");
        carro2.setNumeroCambios(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de chasis:");
        carro2.setNumeroChasis(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de cilindros:");
        carro2.setNumeroCilindros(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de motor:");
        carro2.setNumeroMotor(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de puertas:");
        carro2.setNumeroPuertas(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Galones por kilómetro::");
        carro2.setGalonesKilometro(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tamaño de las llantas:");
        carro2.setTamañoLLanta(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tipo de gasolina:");
        carro2.setTipoGasolina(leerDatos.nextLine());

        System.out.println("Tipo de transmisión:");
        carro2.setTipoTransmision(leerDatos.nextLine());
        
        System.out.println("Tipo de Carro:");
        System.out.println("1.SUV \n2.Sedan\n3.QP");
        carro2.setTipoCarro(leerDatos.nextInt());
        limpiarEscaner();
        
        System.out.println("Tipo de Carrocería:");
        System.out.println("1.Abierta \n2.Cerrada");
        carro2.setTipoDeCarroceria(leerDatos.nextInt());
        limpiarEscaner();
        
        
        
        

        boolean fueIns=contCarros.insertar(carro2);
        if (fueIns) {
            JOptionPane.showMessageDialog(null, "Auto insertado");
            System.out.println("La información del auto fue almacenada.");
        }
        else {
        JOptionPane.showMessageDialog(null, "Auto no insertado");
            System.out.println("la informacion del auto no fue almacenada. placa duplicada");
        }
     
     //private    float    cilindraje;
     //     private    float     precio;
//     private    int        numchasis;
//     private  int          nummotor; 
//     private int           tamllanta;
//     private String     transmisión;  
//     private int          numcambios;
//     private float       galoneskilometro;
//     private  String   tipogasolina;
        
    }
    
    public void consultarunCarros(){
        //Solo ocntiene la placa
        Carros carro = new Carros();
        System.out.println("Digite la placa que desea: ");
        carro.setId(leerDatos.next());
        carro = (Carros) contCarros.consultarUno(carro);
        System.out.println(carro.toString());
    }
    
    public void modificarUnCarro(){
        //Solo ocntiene la placa
        
        Carros carro = new Carros();
        System.out.println("Digite la placa del auto que desea modificar: ");
        carro.setId(leerDatos.next());
        System.out.println("Digite la nueva placa: ");
        String datoNuevo = leerDatos.next();
        carro = (Carros) contCarros.modificar(carro,datoNuevo);
        System.out.println(carro.toString());
    }
    
    
    

    public void menucarro()
    {
        System.out.println("\n***Bienvenido al software del Concesionario***\n");
        System.out.println("A continuación se enseñarán las opciones posibles:");
        System.out.println("1. Insertar el automovil que desea");
        System.out.println("2. Consultar todos");
        System.out.println("3. Consultar un auto");
        System.out.println("4. Modificar autos");
        System.out.println("5. Ordenar autos por placa");
        System.out.println("6. Ordenar autos por número de motor");
        System.out.println("7. Ordenar autos por marca");
        System.out.println("8. Borrar autos");
        System.out.println("Digite su opción:");
        int opc = leerDatos.nextInt();

        limpiarEscaner(); //Limpia el escaner luego de leer un número.

        switch (opc) {

            case 1:
                leerCarros();  //leerAutomovil();
                break;

            case 2:
                contCarros.consultarTodos();
                break;

            case 3:
                consultarunCarros();
                break;

            case 4:
                modificarUnCarro();
                break;

            case 5:
                contCarros.Ordenar();
                break;

            case 6:
                contCarros.Ordenar(0, ControladorCarro.arregloCarros.size() - 1);
                break;

            case 7:
                contCarros.Ordenamiento();
                break;
            case 8:
                borrarUncarro();
                break;

            default:
                System.out.println("Opción no válida.");
                System.exit(0);
                break;
        
        }
        limpiarEscaner();
    }    
   
}
