package Modelo;

import java.util.Scanner;

public class Camiones extends Automovil {
    
    private Scanner leerDatos;
    private String tipoCarroceria;
    private String tamaño;
    private String tipoLlantas;

    public Camiones() {
        leerDatos = new Scanner(System.in);
    }

    public Camiones(String tipoCarroceria, String tamaño, String tipoLlantas, String id, String color, String marca, int numeroChasis, int numeroMotor, int numeroPuertas, float tamañoLLanta, String tipoTransmision, int numeroCambios, int numeroCilindros, float galonesKilometro, String tipoGasolina) {
        super(id, color, marca, numeroChasis, numeroMotor, numeroPuertas, tamañoLLanta, tipoTransmision, numeroCambios, numeroCilindros, galonesKilometro, tipoGasolina);
        this.tipoCarroceria = tipoCarroceria;
        this.tamaño = tamaño;
        this.tipoLlantas = tipoLlantas;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
        System.out.println("1.rigida o articulada \n2. metalica o contenedor o carroceria de madera \n3. cisterna");
        int opc = leerDatos.nextInt();
        
        switch (opc){
            case 1 : this.tipoCarroceria= "rigida o articulada";break;
            case 2 : this.tipoCarroceria= "metalica o contenedor o carroceria de madera";break;
            case 3 : this.tipoCarroceria= "cisterna";break;
        }
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
        System.out.println("1. ligeros \n2. livianos \n3. semilivianos \n4. medianos \n5. semipesados \n6. pesados \n7. extrapesados \n8. megapesados \n9. terapesados \n10. ultrapesados \n11. gigapesados");
        int opc = leerDatos.nextInt();
        
        switch (opc){
            case 1 : this.tipoCarroceria= "ligeros";break;
            case 2 : this.tipoCarroceria= "livianos";break;
            case 3 : this.tipoCarroceria= "semilivianos";break;
            case 4 : this.tipoCarroceria= "medianos";break;
            case 5 : this.tipoCarroceria= "semipesados";break;
            case 6 : this.tipoCarroceria= "pesados";break;
            case 7 : this.tipoCarroceria= "extrapesados";break;
            case 8 : this.tipoCarroceria= "megapesados";break;
            case 9 : this.tipoCarroceria= "terapesados";break;
            case 10 : this.tipoCarroceria= "ultrapesados";break;
            case 11 : this.tipoCarroceria= "gigapesados";break;
        }
    }

    public String getTipoLlantas() {
        return tipoLlantas;
    }

    public void setTipoLlantas(String tipoLlantas) {
        this.tipoLlantas = tipoLlantas;
        System.out.println("1. tipo artilleria \n2. tipo campana ");
        int opc = leerDatos.nextInt();
        
        switch (opc){
            case 1 : this.tipoLlantas= "tipo artilleria";break;
            case 2 : this.tipoLlantas= "tipo campana";break;
        }
    }

    @Override
    public String toString() {
        return "Camiones{" + "tipoCarroceria=" + tipoCarroceria + ", tama\u00f1o=" + tamaño + ", tipoLlantas=" + tipoLlantas + ", id=" + getId() + ", color=" + getColor() + ", marca=" + getMarca() + ", numeroChasis=" + getNumeroChasis() + ", numeroMotor=" + getNumeroMotor() + ", numeroPuertas=" + getNumeroPuertas() + ", tamañoLLanta=" + getTamañoLLanta() + ", tipoTransmision=" + getTipoTransmision() + ", numeroCambios=" + getNumeroCambios() + ", numeroCilindros=" + getNumeroCilindros() + ", galonesKilometro=" + getGalonesKilometro() + ", tipoGasolina=" + getTipoGasolina() +'}';
    }
  
    public int compareTo(Camiones auto) {         //Usado por sort
        
        if (this.getId().compareToIgnoreCase(auto.getId())<1){
            return -1;
        }
        else if (this.getId().compareToIgnoreCase(auto.getId())==0){
            return 0;
        }
        else{
            return 1;
        }
        
    }
 
    
}

