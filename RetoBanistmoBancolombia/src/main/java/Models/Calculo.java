package Models;

public class Calculo {
    private String interes;
    private String capitalizacion;
    private String periodicidad;

    public Calculo(String interes, String capitalizacion, String periodicidad) {
        this.interes = interes;
        this.capitalizacion = capitalizacion;
        this.periodicidad = periodicidad;

    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(String capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
}
