
package Modelo;

import Modelo.Automovil;
import java.util.Objects;
import java.util.Scanner;

public class Carros extends Automovil {
    private String tipoCarro;
    private String tipoDeCarroceria;
    
    

    public Carros(String tipoCarro, String tipoDeCarrocería, String id, String color, String marca, int numeroChasis, int numeroMotor, int numeroPuertas, float tamañoLLanta, String tipoTransmision, int numeroCambios, int numeroCilindros, float galonesKilometro, String tipoGasolina) {
        super(id, color, marca, numeroChasis, numeroMotor, numeroPuertas, tamañoLLanta, tipoTransmision, numeroCambios, numeroCilindros, galonesKilometro, tipoGasolina);
        this.tipoCarro = tipoCarro;
        this.tipoDeCarroceria = tipoDeCarroceria;
    }

    public Carros() {
    }

    public String getTipoCarro() {
        return tipoCarro;
    }
   
    public void setTipoCarro(int opcion) {
        int opc = opcion ;
        switch(opc){
            case 1:
                this.tipoCarro = "SUV";
                break;
            case 2:
                this.tipoCarro = "Sedan";
                break;
                
            case 3:
                this.tipoCarro = "QP";
                break;
        }
        
    }

    public String getTipoDeCarroceria() {
        return tipoDeCarroceria;
    }

    public void setTipoDeCarroceria(int opcion) {
        int opc = opcion ;
        switch(opc){
            case 1:
                this.tipoDeCarroceria = "Abierta";
                break;
            case 2:
                this.tipoDeCarroceria = "Cerrada";
                break;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    

    @Override
    public boolean equals(Object obj) { //Usado por remove
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carros otro = (Carros) obj;
        if (!Objects.equals(this.getId(), otro.getId())){
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Object obj) {
        Carros carro = new Carros();
        carro = (Carros)obj;
            return (this.getId().compareToIgnoreCase(carro.getId()) >1 ? 1:
                    (this.getId().compareToIgnoreCase(carro.getId()) == 0 ? 0 : -1));    
    }

    @Override
    public String toString() {
        return "Carros{" + "tipoCarro=" + tipoCarro + ", tipoCarroceria=" + tipoDeCarroceria + ", id=" + getId() + ", color=" + getColor() + ", marca=" + getMarca() + ", numeroChasis=" + getNumeroChasis() + ", numeroMotor=" + getNumeroMotor() + ", numeroPuertas=" + getNumeroPuertas() + ", tamañoLLanta=" + getTamañoLLanta() + ", tipoTransmision=" + getTipoTransmision() + ", numeroCambios=" + getNumeroCambios() + ", numeroCilindros=" + getNumeroCilindros() + ", galonesKilometro=" + getGalonesKilometro() + ", tipoGasolina=" + getTipoGasolina() + '}';
    }
    

    
    

    
}
