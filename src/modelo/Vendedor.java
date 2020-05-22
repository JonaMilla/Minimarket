package modelo;

public class Vendedor {
    int id;
    String rut;
    String nombre;
    String apellidoP;
    String apellidoM;
    String telefono;
    String estado;
    String user;

    public Vendedor() {
    }

    public Vendedor(int id, String rut, String nombre, String apellidoP, String apellidoM, 
              String telefono, String estado, String user) throws Exception {
        this.setId(id);
        this.setRut(rut);
        this.setNombre(nombre);
        this.setApellidoP(apellidoP);
        this.setApellidoM(apellidoM);
        this.setTelefono(telefono);
        this.setEstado(estado);
        this.setUser(user);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws Exception{
        if (rut.trim().length() >0 && (rut.trim().length() == 10 || rut.trim().length() == 9)) {
            this.rut = rut;
        }else{
            throw new Exception("El rut debe ser obligatorio");
        }      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception{
        if (nombre.trim().length() >0) {
            this.nombre = nombre;
        }else{
            throw new Exception("El nombre debe ser obligatorio");
        }        
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) throws Exception {
        if (apellidoP.trim().length() >0) {
            this.apellidoP = apellidoP.trim();
        }else{
            throw new Exception("El apellido paterno debe ser obligatorio");
        }       
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) throws Exception {
        if (apellidoM.trim().length() >0) {
            this.apellidoM = apellidoM.trim();
        }else{
            throw new Exception("El apellido materno debe ser obligatorio");
        }
        
    }

    public String getTelefono() {
        return telefono;
    }
     //9 33384827
    //22 8251100
    public void setTelefono(String telefono) throws Exception{
        if (telefono.trim().length() >0 && (telefono.trim().length() == 9)) { 
            this.telefono = telefono.trim();
        }else{
            throw new Exception("El telefono debe ser obligatorio");
        }
        
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) throws Exception{
        if (user.trim().length()>0) {
            this.user = user.trim();
        }else{
            throw new Exception("El user debe ser obligatorio");
        }

    }
}
