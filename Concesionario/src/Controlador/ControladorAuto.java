
package Controlador;

import java.util.ArrayList;
import java.util.Collections;
import Modelo.Automovil;
import static java.util.Collections.binarySearch;

public class ControladorAuto implements CRUD {
    public static ArrayList<Automovil> arregloautos = new ArrayList<Automovil>();

    
    @Override
    public boolean insertar(Object obj) {
            Automovil autotem = new Automovil();
            autotem = (Automovil)obj; // Casting, cambiar el tipo de variable
            boolean inserto=true;  
            
            if(arregloautos.isEmpty()){
               return inserto =  arregloautos.add(autotem);
            }
            
            for(Automovil auto:arregloautos){
                if(auto.equals(autotem))
                    return inserto=false;
            }
            
            if(inserto){
                return inserto = arregloautos.add(autotem);
            }
            
            if(arregloautos.add(autotem)){
                inserto = true;
            }
            return inserto;
            
            
    }

    @Override
    public Object consultarUno(Object obj) {
        //Automovil vacio
        Automovil auto = new Automovil();
        auto = (Automovil)obj;    
        Collections.sort(arregloautos);//ArrayList es una colección
        Collections.binarySearch(arregloautos, auto);
        int pos = Collections.binarySearch(arregloautos, auto);
        System.out.println("Posición: " + pos);
        if(pos < 0)
        {
            System.out.println("Onjeto no encontrado");
        }else
        {
            auto =  arregloautos.get(pos);
        }
        return auto;
    }

    @Override
    public void consultarTodos() {
        
          for(Automovil auto:arregloautos)
              System.out.println(auto.toString());   
          
//          for(int i=0;i< arregloautos.size();i++)
//          {
//              System.out.println(arregloautos.get(i).toString());
//          }    
    }

    @Override
    public Object modificar(Object obj,String datoActualizado) {   
        Automovil auto= new Automovil();
        auto=(Automovil)obj;
        Collections.sort(arregloautos);
        String cadena = auto.getId();
        int pos=binarySearch(arregloautos, cadena);
        if(pos!=-1){
            arregloautos.set(pos,auto);
            return auto;
        }
        else{
            return null;
        }
        
    }

    @Override
    public boolean borrar(Object obj) {
        
        boolean borro=false;
        Automovil auto = new Automovil();
        auto = (Automovil)obj;    
        
        borro = arregloautos.remove(auto);
        return borro;
    
    }
  

    @Override
    public void Ordenar() {
        Collections.sort(arregloautos);//ArrayList es una colección
    }

    //
    @Override
    public void Ordenar(int izq, int der) {
        Automovil pivote=arregloautos.get(izq); // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Automovil aux;
 
        while(i < j){                          // mientras no se crucen las búsquedas                                   
        while(arregloautos.get(i) .getNumeroMotor()<= pivote.getNumeroMotor() && i < j) i++; // busca elemento mayor que pivote
        while(arregloautos.get(j) . getNumeroMotor() > pivote.getNumeroMotor()) j--;           // busca elemento menor que pivote
        if (i < j) {                        // si no se han cruzado                      
            aux= arregloautos.get(i);                      // los intercambia
            arregloautos.set(i,arregloautos.get(j));
            arregloautos.set(j,aux);
     }
   }
   
   arregloautos.set(izq,arregloautos.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
   arregloautos.set(j,pivote);                     // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      Ordenar(izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      Ordenar(j+1,der);          // ordenamos subarray derecho
    }

    @Override
    public void Ordenamiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    
    
