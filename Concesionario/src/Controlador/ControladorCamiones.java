package Controlador;

import Modelo.Camiones;
import Modelo.CamionetasYJeep;
import java.util.ArrayList;
import java.util.Collections;

public class ControladorCamiones extends ControladorAuto {
    
    public static ArrayList<Camiones> arregloCamiones  = new ArrayList<>();

    public ControladorCamiones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        
        Camiones  carroTemp = (Camiones) obj;
        
        if (arregloCamiones .isEmpty()){
            inserto = arregloCamiones .add(carroTemp);
        }
        else {
            for (Camiones  camion: arregloCamiones ){
                if (camion.equals(carroTemp)){
                    inserto = false;
                }
            }
            if(inserto){
                inserto = arregloCamiones .add(carroTemp);
            }
        }
        
        return inserto;
    }
    
    
    //recibe una placa
    @Override
    public Object consultarUno(Object obj) {
        Camiones auto = new Camiones();
        auto = (Camiones) obj;
        Collections.sort(arregloCamiones);
        int pos = Collections.binarySearch(arregloCamiones, auto);
        System.out.println("Posición: " + pos);
        if (pos < 0) {
            System.out.println("Objeto no encontrado");
        } else {
            auto = arregloCamiones.get(pos);
        }
        return auto;
    }

    @Override
    public void consultarTodos() {
        for (Camiones auto : arregloCamiones) {
            System.out.println(auto.toString());
        }
    }

    @Override
    public Object modificar(Object obj, String datoActualizado) {   
        Camiones camion = new Camiones();
        camion = (Camiones)obj;    
        Collections.sort(arregloCamiones);//ArrayList es una colección
        Collections.binarySearch(arregloCamiones, camion);
        int pos = Collections.binarySearch(arregloCamiones, camion);
        
        
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }else
        {
            
            arregloCamiones.get(pos).setId(datoActualizado);
            camion = arregloCamiones.get(pos);
        }
        return camion;
        
    }

    @Override
    public boolean borrar(Object obj) {
        CamionetasYJeep auto = (CamionetasYJeep) obj;
        boolean resultado = arregloCamiones.remove(auto);
        return resultado;
    }

    //Collections.sort requiere un comparador (.compareTo()) y recibe una colección.
    @Override
    public void Ordenar() {
        Collections.sort(arregloCamiones);
    }

    // internamente implementa el algoritmo Quicksort
    @Override
    public void Ordenar(int izquierda, int derecha) {
        Camiones pivote = arregloCamiones.get(izquierda);  // tomamos primer elemento como pivote
        int i = izquierda;                               // i realiza la búsqueda de izquierda a derecha
        int j = derecha;                                 // j realiza la búsqueda de derecha a izquierda
        Camiones aux;
        while (i < j) {                                  // mientras no se crucen las búsquedas                                   
            while (arregloCamiones.get(i).getNumeroMotor() <= pivote.getNumeroMotor() && i < j) {
                i++;                                     // busca elemento mayor que pivote
            }
            while (arregloCamiones.get(j).getNumeroMotor() > pivote.getNumeroMotor()) {
                j--;                                     // busca elemento menor que pivote
            }
            if (i < j) {                                 // si no se han cruzado                      
                aux = arregloCamiones.get(i);               // los intercambia
                arregloCamiones.set(i, arregloCamiones.get(j));
                arregloCamiones.set(j, aux);
            }
        }
        arregloCamiones.set(izquierda, arregloCamiones.get(j)); // se coloca el pivote en su lugar de forma que tendremos                                    
        arregloCamiones.set(j, pivote);                      // los menores a su izquierda y los mayores a su derecha

        if (izquierda < j - 1) {
            Ordenar(izquierda, j - 1);                    // ordenamos subarray izquierdo
        }
        if (j + 1 < derecha) {
            Ordenar(j + 1, derecha);                      // ordenamos subarray derecho
        }
    }   
    

    @Override
    public void Ordenamiento() {
       Camiones autoAuxiliar = new Camiones();                      //
        
        for (int i=0 ; i<arregloCamiones.size() ; i++) {                  //arreglo burbuja
            for (int j=i ; j<arregloCamiones.size() ; j++) {              //size --> tamaño del arreglo
                if (arregloCamiones.get(i).getMarca().compareToIgnoreCase(arregloCamiones.get(j).getMarca())>=0) 
                {
                    autoAuxiliar = arregloCamiones.get(i);
                    arregloCamiones.set(i, arregloCamiones.get(j));
                    arregloCamiones.set(j, autoAuxiliar);
                }
            }
        }
            
    }
 
}