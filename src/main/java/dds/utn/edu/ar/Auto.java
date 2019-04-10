package dds.utn.edu.ar;

public class Auto {

    private double combustible;
    private int temperatura;
    private boolean encendido;

    public Auto() {
        super();
        combustible = 0;
        temperatura = 0;
        encendido = false;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }


    
}
