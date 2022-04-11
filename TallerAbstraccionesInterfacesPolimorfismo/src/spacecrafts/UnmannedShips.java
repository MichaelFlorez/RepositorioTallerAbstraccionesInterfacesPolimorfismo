package spacecrafts;

/**
 * clase abstracta que ejecuta sistema de impresión de información de naves espaciales tipo no tripulada.
 * @author Michael Florez Rico
 */

public class UnmannedShips extends Spacecraft {

    private int push;

    /**
     * Constructor vacio
     */
    public UnmannedShips(){

    }

    /**
     * Constructor sobrecargado.
     * @param weight peso de la nave.
     * @param country pais de origen.
     * @param fuel tipo de combustible usado.
     * @param launchDate año de lanzamiento
     * @param push push empuje.
     */
    public UnmannedShips(int weight, String country, String fuel, int launchDate, int push) {
        super(weight, country, fuel, launchDate);
        this.push = push;
    }

    /**
     * método abstracto sobrescrito de la clase abstracta para encendido de la nave.
     */
    @Override
    public void turnon() {
        System.out.println("***The spacecraft is on and ready to be launched.***");

    }

    /**
     * método abstracto sobrescrito de la clase abstracta para lanzamiento de la nave.
     */
    @Override
    public void launch() {
        System.out.println("***The spacecraft has been launched.***");

    }

    /**
     * Método get para obtener el empuje de la nave.
     * @return empuje de la nave
     */
    public int getPush() {
        return push;
    }

    /**
     * Método set para fijar el empuje de la nave.
     * @param push
     */
    public void setPush(int push) {
        this.push = push;
    }

    /**
     * Método toString
     * @return resumen de datos de la nave.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nPush= " + push + "kg";
    }
}
