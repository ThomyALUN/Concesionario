
package Controlador;

public interface CRUD {
    public boolean insertar(Object obj);  //Create
    public Object consultarUno(Object obj);  //Read
    public void consultarTodos();  //Read - Imprime todo
    public Object modificar(Object obj, String datoActualizado);  //Update
    public boolean borrar(Object obj);  //Delete
    public void Ordenar();  //Sort
    public void Ordenar(int izquierda, int derecha);//QuickSort
    public void Ordenamiento(); 
}
