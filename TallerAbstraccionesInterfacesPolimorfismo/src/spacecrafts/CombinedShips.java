package spacecrafts;

/**
 * clase abstracta que ejecuta sistema de impresión de información de naves espaciales tipo combinada.
 * @author Michael Florez Rico
 */

public class CombinedShips extends Spacecraft implements IZeroGravitySystem {
    /**
     * Constructor vacío
     */
    public CombinedShips(){

    }

    /**
     * Constructor sobrecargado
     * @param weight peso de la nave.
     * @param country pais de origen.
     * @param fuel tipo de combustible usado.
     * @param launchDate año de lanzamiento
     */
    public CombinedShips(int weight, String country, String fuel, int launchDate) {
        super(weight, country, fuel, launchDate);
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
     * método sobrescrito de la interface IZeroGravitySystem para activar la gravedad cero.
     */
    @Override
    public void turnOnZGS() {
        System.out.println("Zero Gravity System is activated.");
    }

    /**
     * método sobrescrito de la interface IZeroGravitySystem para desactivar la gravedad cero.
     */
    @Override
    public void turnOffZGS() {
        System.out.println("Zero Gravity System is deactivated.");
    }

    /**
     * Método toString
     * @return resumen de datos de la nave.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
