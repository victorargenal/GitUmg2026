package githubumg;

public class empleado {
    int id;
    String nombre;
    String apellido;
    String direccion;
    float salario;

    public empleado() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.salario=0;
    }
    public empleado(int id, String nombre, String apellido, String direccion,float salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.salario=salario;
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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    public float calcularsalario(){
        salario*=5;
        return salario;
    }
    
    public float mensaje(){
        salario*=0;
        return salario;
    }
}
