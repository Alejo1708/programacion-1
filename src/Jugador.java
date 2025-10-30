public class Jugador extends Persona {
    private int numFed;

    public Jugador(String nombre, String nif, String fechaNac, int numFed) {
        super(nombre, nif, fechaNac);
        this.numFed = numFed;
    }

    public int getNumFed() {
        return numFed;
    }

    public void setNumFed(int numFed) {
        this.numFed = numFed;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Federacion: " + numFed);
    }
}
