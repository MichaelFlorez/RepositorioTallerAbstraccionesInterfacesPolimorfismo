package spacecrafts;

/**
 * clase abstracta que ejecuta sistema de impresión de información de naves espaciales tipo tripulada.
 * @author Michael Florez Rico
 */

public class MannedShips extends Spacecraft implements IZeroGravitySystem{

    private int speed;
    private int crewCapacity;

    /**
     * Constructor vacio
     */
    public MannedShips(){

    }

    /**
     * Constructor sobrecargado
     * @param weight peso de la nave.
     * @param country pais de origen.
     * @param fuel tipo de combustible usado.
     * @param launchDate año de lanzamiento
     * @param speed velocidad.
     * @param crewCapacity capacidad de tripulantes.
     */
    public MannedShips(int weight, String country, String fuel, int launchDate, int speed, int crewCapacity) {
        super(weight, country, fuel, launchDate);
        this.crewCapacity = crewCapacity;
        this.speed = speed;
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
     * método sobrescrito de la interfaz IZeroGravitySystem para activar la gravedad cero.
     */
    @Override
    public void turnOnZGS() {
        System.out.println("Zero Gravity System is activated.");
    }

    /**
     * método sobrescrito de la interfaz IZeroGravitySystem para desactivar la gravedad cero.
     */
    @Override
    public void turnOffZGS() {
        System.out.println("Zero Gravity System is deactivated.");
    }

    /**
     * Método get para obtener la velocidad de la nave.
     * @return la velocidad de la nave.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Método set para fijar la velocidad de la nave.
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Método get para obtener la capacidad de tripulantes.
     * @return capacidad de tripulantes.
     */
    public int getCrewCapacity() {
        return crewCapacity;
    }

    /**
     * Método set para fijar la capacidad de tripulantes.
     * @param crewCapacity
     */
    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    /**
     * Método toString
     * @return resumen de datos de la nave.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nSpeed= " + speed + "km/h" +
                "\nCrew Capacity= " + crewCapacity + " members";
    }
}
