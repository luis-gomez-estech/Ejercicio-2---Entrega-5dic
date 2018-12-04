package luis.gomez;

public class Casas {

    // Creo los atibutos de casas

    private String direccion;
    private int cp;
    private int numHabitaciones;
    private double metros;

    // Creo constructor para poder usar en el main estos atributos a la hora de crear objetos de la clase Casas

    public Casas(String direccion, int cp, int numHabitaciones, double metros) {
        this.direccion = direccion;
        this.cp = cp;
        this.numHabitaciones = numHabitaciones;
        this.metros = metros;
    }

    // Creo los getter y setter para acceder  a los atributos desde el main en este caso
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    // Creo el toString

    @Override
    public String toString() {
        return "Casas{" +
                "direccion='" + direccion + '\'' +
                ", cp=" + cp +
                ", numHabitaciones=" + numHabitaciones +
                ", metros=" + metros +
                '}';
    }
}