
package Controlador;


import Modelo.BusesYBusetas;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alejandra
 */
public class ControladorBusesYBusetas implements CRUD{ // atributo de clase

    public static ArrayList<BusesYBusetas> arregloBusesYBusetas = new ArrayList<BusesYBusetas>();

    public ControladorBusesYBusetas() {
        BusesYBusetas bus1=new BusesYBusetas("Eléctrica", "XVC-123", "Azul", "Mazda", 0, 0, 0, 0, "Mecánica", 0, 0, 0, "Diesel");
        arregloBusesYBusetas.add(bus1);
        bus1=new BusesYBusetas("Gasolina", "ABC-742", "Verde", "Chevrolet", 0, 0, 0, 0, "Automática", 0, 0, 0, "Diesel");
        arregloBusesYBusetas.add(bus1);
        bus1=new BusesYBusetas("Gasolina", "DXB-981", "Plata", "Renault", 0, 0, 0, 0, "Automática", 0, 0, 0, "ACPM");
        arregloBusesYBusetas.add(bus1);
    }
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        
        BusesYBusetas carroTemp = (BusesYBusetas) obj;
        
        if (arregloBusesYBusetas.isEmpty()){
            inserto = arregloBusesYBusetas.add(carroTemp);
        }
        else {
            for (BusesYBusetas carro: arregloBusesYBusetas){
                if (carro.equals(carroTemp)){
                    inserto = false;
                }
            }
            if(inserto){
                inserto = arregloBusesYBusetas.add(carroTemp);
            }
        }
        
        return inserto;
    }
    @Override
    public Object consultarUno(Object obj) {
        BusesYBusetas carro = new BusesYBusetas();
        carro = (BusesYBusetas)obj;    
        Collections.sort(arregloBusesYBusetas);//ArrayList es una colección
        Collections.binarySearch(arregloBusesYBusetas, carro);
        int pos = Collections.binarySearch(arregloBusesYBusetas, carro);
        
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }else
        {
            carro =  arregloBusesYBusetas.get(pos);
        }
        return carro;
    }

    @Override
    public void consultarTodos() {
        for(BusesYBusetas carro:arregloBusesYBusetas){
            System.out.println(carro.toString());
        }
    }

    @Override
    public Object modificar(Object obj, String datoActualizado) {   
        BusesYBusetas carro = new BusesYBusetas();
        carro = (BusesYBusetas)obj;    
        Collections.sort(arregloBusesYBusetas);//ArrayList es una colección
        Collections.binarySearch(arregloBusesYBusetas, carro);
        int pos = Collections.binarySearch(arregloBusesYBusetas, carro);
        
        
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }else
        {
            
            arregloBusesYBusetas.get(pos).setId(datoActualizado);
            carro = arregloBusesYBusetas.get(pos);
        }
        return carro;
        
    }

    @Override
    public boolean borrar(Object obj) {
        
        boolean borro=false;
        BusesYBusetas carro = new BusesYBusetas();
        carro = (BusesYBusetas)obj;    
        
        borro = arregloBusesYBusetas.remove(carro);
        return borro;
    
    }

    @Override
    public void Ordenar() {
        Collections.sort(arregloBusesYBusetas);
    }

    @Override
    public void Ordenar(int izquierda, int derecha) {
        BusesYBusetas pivote = arregloBusesYBusetas.get(izquierda);  // tomamos primer elemento como pivote
        int i = izquierda;                               // i realiza la búsqueda de izquierda a derecha
        int j = derecha;                                 // j realiza la búsqueda de derecha a izquierda
        BusesYBusetas aux;
        while (i < j) {                                  // mientras no se crucen las búsquedas                                   
            while (arregloBusesYBusetas.get(i).getNumeroMotor() <= pivote.getNumeroMotor() && i < j) {
                i++;                                     // busca elemento mayor que pivote
            }
            while (arregloBusesYBusetas.get(j).getNumeroMotor() > pivote.getNumeroMotor()) {
                j--;                                     // busca elemento menor que pivote
            }
            if (i < j) {                                 // si no se han cruzado                      
                aux = arregloBusesYBusetas.get(i);               // los intercambia
                arregloBusesYBusetas.set(i, arregloBusesYBusetas.get(j));
                arregloBusesYBusetas.set(j, aux);
            }
        }
        arregloBusesYBusetas.set(izquierda, arregloBusesYBusetas.get(j)); // se coloca el pivote en su lugar de forma que tendremos                                    
        arregloBusesYBusetas.set(j, pivote);                      // los menores a su izquierda y los mayores a su derecha

        if (izquierda < j - 1) {
            Ordenar(izquierda, j - 1);                    // ordenamos subarray izquierdo
        }
        if (j + 1 < derecha) {
            Ordenar(j + 1, derecha);                      // ordenamos subarray derecho
        }
    }

    @Override
    public void Ordenamiento() {
        BusesYBusetas autoAuxiliar = new BusesYBusetas();                      //
        
        for (int i=0 ; i<arregloBusesYBusetas.size() ; i++) {                  //arreglo burbuja
            for (int j=i ; j<arregloBusesYBusetas.size() ; j++) {              //size --> tamaño del arreglo
                if (arregloBusesYBusetas.get(i).getMarca().compareToIgnoreCase(arregloBusesYBusetas.get(j).getMarca())>=0) 
                {
                    autoAuxiliar = arregloBusesYBusetas.get(i);
                    arregloBusesYBusetas.set(i, arregloBusesYBusetas.get(j));
                    arregloBusesYBusetas.set(j, autoAuxiliar);
                }
            }
        }
            
    }
    
}

