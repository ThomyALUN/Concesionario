package Controlador;

import Modelo.Volquetas;
import java.util.ArrayList;
import java.util.Collections;

public class ControladorVolquetas implements CRUD{ // atributo de clase

    public static ArrayList<Volquetas> arregloVolquetas = new ArrayList<Volquetas>();

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        
        Volquetas volqueta = (Volquetas) obj;
        
        if (arregloVolquetas.isEmpty()){
            inserto = arregloVolquetas.add(volqueta);
        }
        else {
            for (Volquetas volque: arregloVolquetas){
                if (volque.equals(volqueta)){
                    inserto = false;
                }
            }
            if(inserto){
                inserto = arregloVolquetas.add(volqueta);
            }
        }
        
        return inserto;
    }
    @Override
    public Object consultarUno(Object obj) {
        Volquetas volqueta = new Volquetas();
        volqueta = (Volquetas)obj;    
        Collections.sort(arregloVolquetas);//ArrayList es una colección
        Collections.binarySearch(arregloVolquetas, volqueta);
        int pos = Collections.binarySearch(arregloVolquetas, volqueta);
        
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }else
        {
            volqueta =  arregloVolquetas.get(pos);
        }
        return volqueta;
    }

    @Override
    public void consultarTodos() {
        for(Volquetas volqueta:arregloVolquetas){
            System.out.println(volqueta.toString());
        }
    }

    @Override
    public Object modificar(Object obj, String datoActualizado) {   
        Volquetas volqueta = new Volquetas();
        volqueta = (Volquetas)obj;    
        Collections.sort(arregloVolquetas);//ArrayList es una colección
        Collections.binarySearch(arregloVolquetas, volqueta);
        int pos = Collections.binarySearch(arregloVolquetas, volqueta);
        
        
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }else
        {
            
            arregloVolquetas.get(pos).setId(datoActualizado);
            volqueta = arregloVolquetas.get(pos);
        }
        return volqueta;
        
    }

    @Override
    public boolean borrar(Object obj) {
        
        boolean borro=false;
        Volquetas volqueta = new Volquetas();
        volqueta = (Volquetas)obj;    
        
        borro = arregloVolquetas.remove(volqueta);
        return borro;
    
    }

    @Override
    public void Ordenar() {
        Collections.sort(arregloVolquetas);
    }

    @Override
    public void Ordenar(int izquierda, int derecha) {
        Volquetas pivote = arregloVolquetas.get(izquierda);  // tomamos primer elemento como pivote
        int i = izquierda;                               // i realiza la búsqueda de izquierda a derecha
        int j = derecha;                                 // j realiza la búsqueda de derecha a izquierda
        Volquetas aux;
        while (i < j) {                                  // mientras no se crucen las búsquedas                                   
            while (arregloVolquetas.get(i).getNumeroMotor() <= pivote.getNumeroMotor() && i < j) {
                i++;                                     // busca elemento mayor que pivote
            }
            while (arregloVolquetas.get(j).getNumeroMotor() > pivote.getNumeroMotor()) {
                j--;                                     // busca elemento menor que pivote
            }
            if (i < j) {                                 // si no se han cruzado                      
                aux = arregloVolquetas.get(i);               // los intercambia
                arregloVolquetas.set(i, arregloVolquetas.get(j));
                arregloVolquetas.set(j, aux);
            }
        }
        arregloVolquetas.set(izquierda, arregloVolquetas.get(j)); // se coloca el pivote en su lugar de forma que tendremos                                    
        arregloVolquetas.set(j, pivote);                      // los menores a su izquierda y los mayores a su derecha

        if (izquierda < j - 1) {
            Ordenar(izquierda, j - 1);                    // ordenamos subarray izquierdo
        }
        if (j + 1 < derecha) {
            Ordenar(j + 1, derecha);                      // ordenamos subarray derecho
        }
    }

    @Override
    public void Ordenamiento() {
        Volquetas autoAuxiliar = new Volquetas();                      //
        
        for (int i=0 ; i<arregloVolquetas.size() ; i++) {                  //arreglo burbuja
            for (int j=i ; j<arregloVolquetas.size() ; j++) {              //size --> tamaño del arreglo
                if (arregloVolquetas.get(i).getMarca().compareToIgnoreCase(arregloVolquetas.get(j).getMarca())>=0) 
                {
                    autoAuxiliar = arregloVolquetas.get(i);
                    arregloVolquetas.set(i, arregloVolquetas.get(j));
                    arregloVolquetas.set(j, autoAuxiliar);
                }
            }
        }
            
    }
    
}
