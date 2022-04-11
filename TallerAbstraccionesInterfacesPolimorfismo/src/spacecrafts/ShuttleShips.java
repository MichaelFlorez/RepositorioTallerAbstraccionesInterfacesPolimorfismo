package spacecrafts;
/**
 * clase abstracta que ejecuta sistema de impresión de información de naves espaciales tipo lanzadera.
 * @author Michael Florez Rico
 */
public class ShuttleShips extends Spacecraft implements IRockets {
    private int push;
    private int loadingCapacity;
    private int height;
    private int power;

    /**
     * Constructor vacío.
     */
    public ShuttleShips(){

    }

    /**
     * Constructor sobrecargado
     * @param weight peso de la nave.
     * @param country pais de origen.
     * @param fuel tipo de combustible usado.
     * @param launchDate año de lanzamiento
     * @param push empuje.
     * @param loadingCapacity capacidad de carga.
     * @param height altura.
     * @param power potencia.
     */
    public ShuttleShips(int weight, String country, String fuel, int launchDate, int push, int loadingCapacity, int height, int power) {
        super(weight, country, fuel, launchDate);
        this.push = push;
        this.loadingCapacity = loadingCapacity;
        this.height = height;
        this.power = power;
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
     * método sobrescrito de la interface IRockets para eyección de cohetes de propulsión.
     */
    @Override
    public void release() {
        System.out.println("***Rockets have been release.***");
    }

    /**
     * método sobrescrito de la interface IRockets para detener la combustion de los cohetes de propulsión.
     */
    @Override
    public void stopCombustion() {
        System.out.println("***The combustion on the rockets has stopped.***");
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
     * Método get para obtener la capacidad de carga.
     * @return capacidad de carga.
     */
    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    /**
     * Método set para fijar la capacidad de carga.
     * @param loadingCapacity
     */
    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    /**
     * Método get para obtener la altura de la nave.
     * @return altura de la nave.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Método set para fijar la altura de la nave.
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Método get para obtener la potencia de la nave.
     * @return potencia de la nave
     */
    public int getPower() {
        return power;
    }

    /**
     * Método set para fijar la potencia de la nave.
     * @param power
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Método toString
     * @return resumen de datos de la nave.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nPush= " + push + "kg"+
                "\nLoadingCapacity= " + loadingCapacity + "kg" +
                "\nHeight= " + height + "m" +
                "\nPower= " + power +"HP";
    }
}
