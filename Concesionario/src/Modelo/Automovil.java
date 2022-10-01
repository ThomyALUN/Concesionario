
package Modelo;

import java.util.Objects;

public class Automovil implements Comparable<Object>{
    
    private String id;
    private String color;
    private String marca;
    private int numeroChasis;
    private int numeroMotor;
    private int numeroPuertas;
    private float tamañoLLanta;
    private String tipoTransmision;
    private int numeroCambios;
    private int numeroCilindros;
    private float galonesKilometro;
    private String tipoGasolina;

    //constructor --> es el que se invoca al crear un objeto de la clase.
    public Automovil(String id, String color, String marca, int numeroChasis, int numeroMotor, int numeroPuertas, float tamañoLLanta, String tipoTransmision, int numeroCambios, int numeroCilindros, float galonesKilometro, String tipoGasolina) {
        this.id = id;
        this.color = color;
        this.marca = marca;
        this.numeroChasis = numeroChasis;
        this.numeroMotor = numeroMotor;
        this.numeroPuertas = numeroPuertas;
        this.tamañoLLanta = tamañoLLanta;
        this.tipoTransmision = tipoTransmision;
        this.numeroCambios = numeroCambios;
        this.numeroCilindros = numeroCilindros;
        this.galonesKilometro = galonesKilometro;
        this.tipoGasolina = tipoGasolina;
    }
    
    //constructor vacio.
    public Automovil(){} 

    //getter and setter 
    //get: obtener el valor de una propiedad de la clase para utilizarlo en diferentes metodos.
    //set: brinda acceso a propiedades especificas para asignar un valor fuera de la clase.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public float getTamañoLLanta() {
        return tamañoLLanta;
    }

    public void setTamañoLLanta(float tamañoLLanta) {
        this.tamañoLLanta = tamañoLLanta;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumeroCambios() {
        return numeroCambios;
    }

    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public float getGalonesKilometro() {
        return galonesKilometro;
    }

    public void setGalonesKilometro(float galonesKilometro) {
        this.galonesKilometro = galonesKilometro;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    @Override
    public String toString() {
        return "Automovil{" + "id=" + id + ", color=" + color + ", marca=" + marca + ", numeroChasis=" + numeroChasis + ", numeroMotor=" + numeroMotor + ", numeroPuertas=" + numeroPuertas + ", tama\u00f1oLLanta=" + tamañoLLanta + ", tipoTransmision=" + tipoTransmision + ", numeroCambios=" + numeroCambios + ", numeroCilindros=" + numeroCilindros + ", galonesKilometro=" + galonesKilometro + ", tipoGasolina=" + tipoGasolina + '}';
    }
    

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Automovil other = (Automovil) obj;
        return Objects.equals(this.id, other.id);
    }

    
    @Override
    public int compareTo(Object obj) {
    Automovil auto = new Automovil();
    auto = (Automovil)obj;
            return (this.getId().compareToIgnoreCase(auto.getId()) >1 ? 1:
                    (this.getId().compareToIgnoreCase(auto.getId()) == 0 ? 0 : -1));    
    }   
     
     
     
     
     
     
    
}
