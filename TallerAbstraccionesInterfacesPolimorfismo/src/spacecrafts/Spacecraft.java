package spacecrafts;

/**
 * clase abstracta que ejecuta sistema de impresión de información de naves espaciales genéricas.
 * @author Michael Florez Rico
 */

public abstract class Spacecraft {

    private int weight;
    private String country;
    private String fuel;
    private int launchDate;

    /**
     * Constructor vacío
     */
    public Spacecraft() {

    }
    /**
     * Constructor sobrecargado
     * @param weight peso de la nave.
     * @param country pais de origen.
     * @param fuel tipo de combustible usado.
     * @param launchDate año de lanzamiento
     */
    public Spacecraft(int weight, String country, String fuel, int launchDate) {
        this.weight = weight;
        this.country = country;
        this.fuel = fuel;
        this.launchDate = launchDate;
    }

    /**
     * Método abstracto, para encendido de la nave.
     */
    public abstract void turnon();

    /**
     * Método abstracto, para el lanzamiento de la nave.
      */
    public abstract void launch();

    /**
     * Método get para obtener el peso de la nave.
     * @return peso de la nave.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Método set para fijar el peso de la nave.
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Método get para obtener el pais de origen.
     * @return pais de origen
     */
    public String getCountry() {
        return country;
    }

    /**
     * Método set para fijar el pais de origen.
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Metodo get para obtener el tipo de combustible.
     * @return tipo de combustible
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * Método set para fijar el tipo de combustible.
     * @param fuel
     */
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    /**
     * Metodo get para obtener el año de lanzamiento.
     * @return año de lanzamiento.
     */
    public int getLaunchDate() {
        return launchDate;
    }

    /**
     * Método set para fijar el año de lanzamiento.
     * @param launchDate
     */
    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * Método toString
     * @return resumen de datos de la nave.
     */
    @Override
    public String toString() {
        return  "Weight= " + weight + "kg"+
                "\nCountry= " + country +
                "\nFuel= " + fuel +
                "\nLaunch Date= " + launchDate;
    }

}
