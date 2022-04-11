package spacecrafts;

/**
 * interfaz para la creación de métodos para los cohetes de propulsión.
 */
public interface IRockets {
    /**
     * método sobrescrito de la interface IRockets para eyección de cohetes de propulsión.
     */
    public void release();

    /**
     * método sobrescrito de la interface IRockets para detener la combustion de los cohetes de propulsión.
     */
    public void stopCombustion();
}
