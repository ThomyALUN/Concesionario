package Controlador;

import Modelo.CamionetasYJeep;
import java.util.ArrayList;
import java.util.Collections;

public class ControladorCamionetasYJeep extends ControladorAuto {
    
    public static ArrayList<CamionetasYJeep> arregloCamionetasYJeep = new ArrayList<>();
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        
        CamionetasYJeep carroTemp = (CamionetasYJeep) obj;
        
        if (arregloCamionetasYJeep.isEmpty()){
            inserto = arregloCamionetasYJeep.add(carroTemp);
        }
        else {
            for (CamionetasYJeep camioneta: arregloCamionetasYJeep){
                if (camioneta.equals(carroTemp)){
                    inserto = false;
                }
            }
            if(inserto){
                inserto = arregloCamionetasYJeep.add(carroTemp);
            }
        }
        
        return inserto;
    }
    
    
    //recibe una placa
    @Override
    public Object consultarUno(Object obj) {
        CamionetasYJeep auto = new CamionetasYJeep();
        auto = (CamionetasYJeep) obj;
        Collections.sort(arregloCamionetasYJeep);
        int pos = Collections.binarySearch(arregloCamionetasYJeep, auto);
        System.out.println("Posición: " + pos);
        if (pos < 0) {
            System.out.println("Objeto no encontrado");
        } else {
            auto = arregloCamionetasYJeep.get(pos);
        }
        return auto;
    }

    @Override
    public void consultarTodos() {
        for (CamionetasYJeep auto : arregloCamionetasYJeep) {
            System.out.println(auto.toString());
        }
    }

    @Override
    public Object modificar(Object obj, String datoActualizado) {   
        CamionetasYJeep camioneta = new CamionetasYJeep();
        camioneta = (CamionetasYJeep)obj;    
        Collections.sort(arregloCamionetasYJeep);//ArrayList es una colección
        Collections.binarySearch(arregloCamionetasYJeep, camioneta);
        int pos = Collections.binarySearch(arregloCamionetasYJeep, camioneta);
        
        
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }else
        {
            
            arregloCamionetasYJeep.get(pos).setId(datoActualizado);
            camioneta = arregloCamionetasYJeep.get(pos);
        }
        return camioneta;
        
    }

    @Override
    public boolean borrar(Object obj) {
        CamionetasYJeep auto = (CamionetasYJeep) obj;
        boolean resultado = arregloCamionetasYJeep.remove(auto);
        return resultado;
    }

    //Collections.sort requiere un comparador (.compareTo()) y recibe una colección.
    @Override
    public void Ordenar() {
        Collections.sort(arregloCamionetasYJeep);
    }

    // internamente implementa el algoritmo Quicksort
    @Override
    public void Ordenar(int izquierda, int derecha) {
        CamionetasYJeep pivote = arregloCamionetasYJeep.get(izquierda);  // tomamos primer elemento como pivote
        int i = izquierda;                               // i realiza la búsqueda de izquierda a derecha
        int j = derecha;                                 // j realiza la búsqueda de derecha a izquierda
        CamionetasYJeep aux;
        while (i < j) {                                  // mientras no se crucen las búsquedas                                   
            while (arregloCamionetasYJeep.get(i).getNumeroMotor() <= pivote.getNumeroMotor() && i < j) {
                i++;                                     // busca elemento mayor que pivote
            }
            while (arregloCamionetasYJeep.get(j).getNumeroMotor() > pivote.getNumeroMotor()) {
                j--;                                     // busca elemento menor que pivote
            }
            if (i < j) {                                 // si no se han cruzado                      
                aux = arregloCamionetasYJeep.get(i);               // los intercambia
                arregloCamionetasYJeep.set(i, arregloCamionetasYJeep.get(j));
                arregloCamionetasYJeep.set(j, aux);
            }
        }
        arregloCamionetasYJeep.set(izquierda, arregloCamionetasYJeep.get(j)); // se coloca el pivote en su lugar de forma que tendremos                                    
        arregloCamionetasYJeep.set(j, pivote);                      // los menores a su izquierda y los mayores a su derecha

        if (izquierda < j - 1) {
            Ordenar(izquierda, j - 1);                    // ordenamos subarray izquierdo
        }
        if (j + 1 < derecha) {
            Ordenar(j + 1, derecha);                      // ordenamos subarray derecho
        }
    }   
    

    @Override
    public void Ordenamiento() {
       CamionetasYJeep autoAuxiliar = new CamionetasYJeep();                      //
        
        for (int i=0 ; i<arregloCamionetasYJeep.size() ; i++) {                  //arreglo burbuja
            for (int j=i ; j<arregloCamionetasYJeep.size() ; j++) {              //size --> tamaño del arreglo
                if (arregloCamionetasYJeep.get(i).getMarca().compareToIgnoreCase(arregloCamionetasYJeep.get(j).getMarca())>=0) 
                {
                    autoAuxiliar = arregloCamionetasYJeep.get(i);
                    arregloCamionetasYJeep.set(i, arregloCamionetasYJeep.get(j));
                    arregloCamionetasYJeep.set(j, autoAuxiliar);
                }
            }
        }
            
    }
 
}
    

