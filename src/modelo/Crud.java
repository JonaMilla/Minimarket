package modelo;

import java.util.List;

public interface Crud <E> {
    
    public List listar();
    public int  add (E elemento);
    public int actualizar (E elemento);
    public void eliminar (int id);
   
}
