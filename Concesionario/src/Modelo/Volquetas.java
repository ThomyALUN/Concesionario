package Modelo;

import Modelo.Automovil;
import java.util.Scanner;

public class Volquetas extends Automovil {
    
    private Scanner leerDatos;
    private String tipovolco;
    
    public Volquetas() {
        leerDatos = new Scanner(System.in);
    }

    public Volquetas(String tipovolco, String id, String color, String marca, int numeroChasis, int numeroMotor, int numeroPuertas, float tamañoLLanta, String tipoTransmision, int numeroCambios, int numeroCilindros, float galonesKilometro, String tipoGasolina) {
        super(id, color, marca, numeroChasis, numeroMotor, numeroPuertas, tamañoLLanta, tipoTransmision, numeroCambios, numeroCilindros, galonesKilometro, tipoGasolina);
        this.tipovolco = tipovolco;
    }


    public String getTipovolco() {
        return tipovolco;
    }

    public void setTipovolco(int opc) {
        
        switch (opc){
            case 1 : this.tipovolco= "mediano";break;
            case 2 : this.tipovolco= "grande";break;
            case 3 : this.tipovolco= "pequeño";break;
            case 4 : this.tipovolco= "tipo tractor";break;
        }
    }

    @Override
    public String toString() {
        return "Volquetas{" + " tipovolco=" + tipovolco +", id=" + getId() + ", color=" + getColor() + ", marca=" + getMarca() + ", numeroChasis=" + getNumeroChasis() + ", numeroMotor=" + getNumeroMotor() + ", numeroPuertas=" + getNumeroPuertas() + ", tama\u00f1oLLanta=" + getTamañoLLanta() + ", tipoTransmision=" + getTipoTransmision() + ", numeroCambios=" + getNumeroCambios() + ", numeroCilindros=" + getNumeroCilindros() + ", galonesKilometro=" + getGalonesKilometro() + ", tipoGasolina=" + getTipoGasolina()+'}';
    }
    public int compareTo(Volquetas auto) {         //Usado por sort
        
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
