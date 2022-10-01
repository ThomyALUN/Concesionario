package Modelo;

import Modelo.Automovil;
import java.util.Scanner;

public class CamionetasYJeep extends Automovil{
 
   private Scanner leerDatos;
   private String tipoChasis;
   private String tipoCarroceria;
   private String tipoCamionetaJeep;
   
    public CamionetasYJeep() {
       Scanner leerDatos = new Scanner(System.in);
    }

    public CamionetasYJeep(String tipoChasis, String tipoCarroceria, String tipoCamionetaJeep, String id, String color, String marca, int numeroChasis, int numeroMotor, int numeroPuertas, float tamañoLLanta, String tipoTransmision, int numeroCambios, int numeroCilindros, float galonesKilometro, String tipoGasolina) {
        super(id, color, marca, numeroChasis, numeroMotor, numeroPuertas, tamañoLLanta, tipoTransmision, numeroCambios, numeroCilindros, galonesKilometro, tipoGasolina);
        this.tipoChasis = tipoChasis;
        this.tipoCarroceria = tipoCarroceria;
        this.tipoCamionetaJeep = tipoCamionetaJeep;
    }

    public String getTipoChasis() {
        return tipoChasis;
    }

    public void setTipoChasis(int opc) {
       
        switch (opc){
            case 1 : this.tipoChasis= "4x4";break;
            case 2 : this.tipoChasis= "4x2";break;
        }
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(int opc) {
        
        switch (opc){
            case 1 : this.tipoCarroceria= "platon";break;
            case 2 : this.tipoCarroceria= "esteras";break;
        }
    }

    public String getTipoCamionetaJeep() {
        return tipoCamionetaJeep;
    }

    public void setTipoCamionetaJeep(int opc) {
        switch (opc){
            case 1 : this.tipoCamionetaJeep= "Pick-Up";break;
            case 2 : this.tipoCamionetaJeep= "Furgoneta";break;
            case 3 : this.tipoCamionetaJeep= "Automovio todo terreno";break;
            case 4 : this.tipoCamionetaJeep= "Minivan";break;
        }
    }

    @Override
    public String toString() {
        return "CamionetasYJeep{" + "tipoChasis=" + tipoChasis + ", tipoCarroceria=" + tipoCarroceria + ", tipoCamionetaJeep=" + tipoCamionetaJeep +", id=" + getId() + ", color=" + getColor() + ", marca=" + getMarca() + ", numeroChasis=" + getNumeroChasis() + ", numeroMotor=" + getNumeroMotor() + ", numeroPuertas=" + getNumeroPuertas() + ", tama\u00f1oLLanta=" + getTamañoLLanta() + ", tipoTransmision=" + getTipoTransmision() + ", numeroCambios=" + getNumeroCambios() + ", numeroCilindros=" + getNumeroCilindros() + ", galonesKilometro=" + getGalonesKilometro() + ", tipoGasolina=" + getTipoGasolina()+'}';
    }

    public int compareTo(CamionetasYJeep auto) {         //Usado por sort
        
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
