
package Controlador;


import Controlador.CRUD;
import Modelo.Carros;
import java.util.ArrayList;
import java.util.Collections;

public class ControladorCarro implements CRUD{ // atributo de clase

    public static ArrayList<Carros> arregloCarros = new ArrayList<Carros>();

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        
        Carros carroTemp = (Carros) obj;
        
        if (arregloCarros.isEmpty()){
            inserto = arregloCarros.add(carroTemp);
        }
        else {
            for (Carros carro: arregloCarros){
                if (carro.equals(carroTemp)){
                    inserto = false;
                }
            }
            if(inserto){
                inserto = arregloCarros.add(carroTemp);
            }
        }
        
        return inserto;
    }
    @Override
    public Object consultarUno(Object obj) {
        Carros carro = new Carros();
        carro = (Carros)obj;    
        Collections.sort(arregloCarros);//ArrayList es una colección
        Collections.binarySearch(arregloCarros, carro);
        int pos = Collections.binarySearch(arregloCarros, carro);
        
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }else
        {
            carro =  arregloCarros.get(pos);
        }
        return carro;
    }

    @Override
    public void consultarTodos() {
        for(Carros carro:arregloCarros){
            System.out.println(carro.toString());
        }
    }

    @Override
    public Object modificar(Object obj, String datoActualizado) {   
        Carros carro = new Carros();
        carro = (Carros)obj;    
        Collections.sort(arregloCarros);//ArrayList es una colección
        Collections.binarySearch(arregloCarros, carro);
        int pos = Collections.binarySearch(arregloCarros, carro);
        
        
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }else
        {
            
            arregloCarros.get(pos).setId(datoActualizado);
            carro = arregloCarros.get(pos);
        }
        return carro;
        
    }

    @Override
    public boolean borrar(Object obj) {
        
        boolean borro=false;
        Carros carro = new Carros();
        carro = (Carros)obj;    
        
        borro = arregloCarros.remove(carro);
        return borro;
    
    }

    @Override
    public void Ordenar() {
        Collections.sort(arregloCarros);
    }

    @Override
    public void Ordenar(int izquierda, int derecha) {
        Carros pivote = arregloCarros.get(izquierda);  // tomamos primer elemento como pivote
        int i = izquierda;                               // i realiza la búsqueda de izquierda a derecha
        int j = derecha;                                 // j realiza la búsqueda de derecha a izquierda
        Carros aux;
        while (i < j) {                                  // mientras no se crucen las búsquedas                                   
            while (arregloCarros.get(i).getNumeroMotor() <= pivote.getNumeroMotor() && i < j) {
                i++;                                     // busca elemento mayor que pivote
            }
            while (arregloCarros.get(j).getNumeroMotor() > pivote.getNumeroMotor()) {
                j--;                                     // busca elemento menor que pivote
            }
            if (i < j) {                                 // si no se han cruzado                      
                aux = arregloCarros.get(i);               // los intercambia
                arregloCarros.set(i, arregloCarros.get(j));
                arregloCarros.set(j, aux);
            }
        }
        arregloCarros.set(izquierda, arregloCarros.get(j)); // se coloca el pivote en su lugar de forma que tendremos                                    
        arregloCarros.set(j, pivote);                      // los menores a su izquierda y los mayores a su derecha

        if (izquierda < j - 1) {
            Ordenar(izquierda, j - 1);                    // ordenamos subarray izquierdo
        }
        if (j + 1 < derecha) {
            Ordenar(j + 1, derecha);                      // ordenamos subarray derecho
        }
    }

    @Override
    public void Ordenamiento() {
        Carros autoAuxiliar = new Carros();                      //
        
        for (int i=0 ; i<arregloCarros.size() ; i++) {                  //arreglo burbuja
            for (int j=i ; j<arregloCarros.size() ; j++) {              //size --> tamaño del arreglo
                if (arregloCarros.get(i).getMarca().compareToIgnoreCase(arregloCarros.get(j).getMarca())>=0) 
                {
                    autoAuxiliar = arregloCarros.get(i);
                    arregloCarros.set(i, arregloCarros.get(j));
                    arregloCarros.set(j, autoAuxiliar);
                }
            }
        }
            
    }
    
}
