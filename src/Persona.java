public class Persona {
    private String nombre;
    private String nif;
    private String fechaNac;

   
    public Persona(String nombre, String nif, String fechaNac) {
        this.nombre = nombre;
        this.nif = nif;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("NIF: " + nif);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
    }
}
