package Modelo;

import Modelo.Automovil;
import java.util.Scanner;

public class BusesYBusetas extends Automovil {

    private String tipoBuseta;
    private Scanner leerDatos;
    
    public BusesYBusetas() {
       Scanner leerDatos = new Scanner(System.in);
    }

    public BusesYBusetas(String tipoBuseta, String id, String color, String marca, int numeroChasis, int numeroMotor, int numeroPuertas, float tamañoLLanta, String tipoTransmision, int numeroCambios, int numeroCilindros, float galonesKilometro, String tipoGasolina) {
        super(id, color, marca, numeroChasis, numeroMotor, numeroPuertas, tamañoLLanta, tipoTransmision, numeroCambios, numeroCilindros, galonesKilometro, tipoGasolina);
        this.tipoBuseta = tipoBuseta;
    }

    public String getTipoBuseta() {
        return tipoBuseta;
    }

    public void setTipoBuseta(String tipo) {
        this.tipoBuseta=tipo;
    }

    @Override
    public String toString() {
        return "BusesYBusetas{" + "tipoBuseta=" + tipoBuseta +", id=" + getId() + ", color=" + getColor() + ", marca=" + getMarca() + ", numeroChasis=" + getNumeroChasis() + ", numeroMotor=" + getNumeroMotor() + ", numeroPuertas=" + getNumeroPuertas() + ", tamañoLLanta=" + getTamañoLLanta() + ", tipoTransmision=" + getTipoTransmision() + ", numeroCambios=" + getNumeroCambios() + ", numeroCilindros=" + getNumeroCilindros() + ", galonesKilometro=" + getGalonesKilometro() + ", tipoGasolina=" + getTipoGasolina()+ '}';
    }
    
    

    
     
     
}
