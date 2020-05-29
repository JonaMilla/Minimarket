package modelo;

public class Producto {
    int id;
    String nombre;
    int precio;
    int stock;
    String estado;

    public Producto() {
    }

    public Producto(int id, String nombre, int precio, int stock, String estado) throws Exception {
        this.setId(id);
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setStock(stock);
        this.setEstado(estado);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().length() >0) {
            this.nombre = nombre.trim();
        }else{
            throw new Exception("El nombre es obligatorio");
        }
        
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

}
