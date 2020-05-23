package modelo;

public class Cliente {
    int id;
    String nombre;
    String rut;
    String apellidoP;
    String apellidoM;
    String direccion;
    String estado;

    public Cliente() {
        
    }

    public Cliente(int id, String nombre, String rut, String apellidoP, String apellidoM, String direccion, String estado) throws Exception {
        this.setId(id);
        this.setNombre(nombre);
        this.setRut(rut);
        this.setApellidoP(apellidoP);
        this.setApellidoM(apellidoM);
        this.setDireccion(direccion);
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
        if (nombre.trim().length() > 0) {
           this.nombre = nombre.trim(); 
        }else{
            throw new Exception("El nomnbre es obligatorio");            
        }      
    }

    public String getRut() {
        return rut;
    }
    
    //17456879-9
    public void setRut(String rut) throws Exception {
        if (rut.trim().length()>0 && (rut.trim().length() == 10 || rut.trim().length() == 9)) {
            this.rut = rut.trim();
        }else{
            throw new Exception("El rut debe ser obligatorio");
        }       
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) throws Exception {
        if (apellidoP.trim().length()>0) {
            this.apellidoP = apellidoP;
        }else{
            throw new Exception("El apellido paterno debe ser obligatorio");
        }
        
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) throws Exception {
        if (apellidoM.trim().length()>0) {
            this.apellidoM = apellidoM;
        }else{
            throw new Exception("El apellido materno debe ser obligatorio");
        }
        
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws Exception {
       if(direccion.trim().length()>0){
        this.direccion = direccion;
       }else{
           throw new Exception("La dirección debe ser obligatorio");
       }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
}
