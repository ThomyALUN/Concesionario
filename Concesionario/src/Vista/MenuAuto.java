
package Vista;

import Controlador.ControladorAuto;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Modelo.Automovil;

public class MenuAuto{
    
    private Scanner leerDatos; 
    private ControladorAuto contAuto;
    MenuCarros carro = new MenuCarros();
    MenuCamionetasYJeep camioneta = new MenuCamionetasYJeep();
    MenuVolquetas volqueta = new MenuVolquetas();
    MenuBusesYBusetas buseta = new MenuBusesYBusetas();
    
      
    public void insertarDatosDefault(){
        Automovil auto = new Automovil("ABC", "color", "marca", 0, 0, 0, 0, "tipoTransmision", 0, 0, 0, "tipoGasolina");
          
    }
      
    private void borrarUnAuto(){
        System.out.println("Digite la placa a borrar: ");
        Automovil auto = new Automovil();
        auto.setId(leerDatos.next());
        if(contAuto.borrar(auto))
            System.out.println("Objeto borrado");
        else
            System.out.println("Algo ocurrio, no se pudo eliminar");
    }
    public MenuAuto() {
        //Separar memoria para esos objetos
        leerDatos = new Scanner(System.in);
        contAuto = new ControladorAuto();
        insertarDatosDefault();
    }
    
      
    private void leerAutomovil()
    {
        Automovil carro1 = new Automovil();
        System.out.println("Ingrese los datos del auto.");

        System.out.println("Placa:");
        carro1.setId(leerDatos.nextLine());

        System.out.println("Color:");
        carro1.setColor(leerDatos.nextLine());

        System.out.println("Marca:");
        carro1.setMarca(leerDatos.nextLine());

        System.out.println("Número de cambios:");
        carro1.setNumeroCambios(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de chasis:");
        carro1.setNumeroChasis(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de cilindros:");
        carro1.setNumeroCilindros(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de motor:");
        carro1.setNumeroMotor(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Número de puertas:");
        carro1.setNumeroPuertas(leerDatos.nextInt());
        limpiarEscaner();

        System.out.println("Galones por kilómetro::");
        carro1.setGalonesKilometro(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tamaño de las llantas:");
        carro1.setTamañoLLanta(leerDatos.nextFloat());
        limpiarEscaner();

        System.out.println("Tipo de gasolina:");
        carro1.setTipoGasolina(leerDatos.nextLine());

        System.out.println("Tipo de transmisión:");
        carro1.setTipoTransmision(leerDatos.nextLine());

        boolean fueIns = contAuto.insertar(carro1);
        if (fueIns) {
            JOptionPane.showMessageDialog(null, "Auto insertado");
            System.out.println("La información del auto fue almacenada.");
        } else {
            JOptionPane.showMessageDialog(null, "Auto no insertado");
            System.out.println("la informacion del auto no fue almacenada. placa duplicada");
        }
    }
    
    private void limpiarEscaner(){
        
        //Método utilizado para limpiar el escáner luego de leer un número y antes de leer una cadena.
        //Revisar https://es.stackoverflow.com/questions/121684/problema-clase-scanner-en-java-al-introducir-varios-strings-como-variables
    
        leerDatos.nextLine();
    
    }
    public void tipoAutomovil(){
        System.out.println("Elija el tipo de Automovil");
        System.out.println("1. Carro");
        System.out.println("2. Camioneta o Jeep");
        System.out.println("3. Volquetas");
        System.out.println("4. Camiones");
        System.out.println("5. Buses o Busetas");

        int opc=leerDatos.nextInt();
        
        limpiarEscaner(); //Limpia el escaner luego de leer un número.
        
        switch(opc){
            case 1:
                carro.menucarro();
                break;
                
            case 2:
                camioneta.menuCamionetasYJeep();
                break;
            
            case 3:
                volqueta.menuVolqueta();
                break;
                
            case 4:
                
                break;
            
            case 5:
                buseta.menuBusYBusetas();
                break;
        
       
                
        }
    }
    
    public void consultarUnAutomovil(){
        //Solo ocntiene la placa
        Automovil auto = new Automovil();
        System.out.println("Digite la placa que desea: ");
        auto.setId(leerDatos.next());
        auto = (Automovil) contAuto.consultarUno(auto);
        System.out.println(auto.toString());
    }
      
    public void menu()
    {
        System.out.println("1. Insertar Autos");
        System.out.println("2. Consultar todos");
        System.out.println("3. Consultar uno");
        System.out.println("4. Modificar Autos");
        System.out.println("5. Ordenar Autos- - por marca");
        System.out.println("6. Ordenar Autos -- por numero de motors");
        System.out.println("7. Borrar Autos");
        System.out.println("Digite su opción: ");
        int opc = leerDatos.nextInt();

        switch (opc)
        {
            case 1:
        
       
                
        }
    }
    
    
    
}