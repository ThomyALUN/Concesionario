
package Modelo;

public class Usuario implements Comparable<Usuario> {
    
    private long cedula;

    public long getCedula() {
        return cedula;
    }
    
    //Falta implementar los atributos (privados) y los métodos getter y setter

    @Override
    public int compareTo(Usuario persona) {
        return (this.getCedula()<persona.getCedula() ? 1 : 
                (this.getCedula()==persona.getCedula()) ? 0 : -1);
    }
    
}
