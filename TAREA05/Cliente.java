package TAREA05;

public class Cliente {

    private Integer codigo;
    private String nombre;
    private String apellido;

    public Cliente(String nom, String ape, Integer codi) {
        this.codigo = codi;
        this.nombre = nom;
        this.apellido = ape;
    }
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codi) {
        this.codigo= codi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre= nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ape) {
        this.apellido= ape;
    }


}
