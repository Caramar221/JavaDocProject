/**
 * La clase {@code Car} representa un modelo de coche.
 * <p>
 * Contiene información básica sobre un vehículo, como la marca,
 * el modelo, el año de fabricación y el precio.
 * Esta clase proporciona métodos para acceder y modificar
 * estos atributos, así como para obtener una descripción textual del coche.
 * </p>
 *
 * @author Carlos Aragonés Martín
 * @version 1.0
 * @since 2026
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructor que crea un nuevo objeto {@code Car} con los valores especificados.
     *
     * @param make  la marca del coche
     * @param model el modelo del coche
     * @param year  el año de fabricación
     * @param price el precio del coche
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Devuelve la marca del coche.
     *
     * @return la marca del coche
     */
    public String getMake() {
        return make;
    }

    /**
     * Establece la marca del coche.
     *
     * @param make la nueva marca del coche
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Devuelve el modelo del coche.
     *
     * @return el modelo del coche
     */
    public String getModel() {
        return model;
    }

    /**
     * Establece el modelo del coche.
     *
     * @param model el nuevo modelo del coche
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Devuelve el año de fabricación del coche.
     *
     * @return el año del coche
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece el año de fabricación del coche.
     *
     * @param year el nuevo año de fabricación
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Devuelve el precio del coche.
     *
     * @return el precio del coche
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del coche.
     *
     * @param price el nuevo precio del coche
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Decvuelve una descripción completa del cohe.
     *
     * <p>Ejemplo de salida:</p>
     * <p>
     * El coche es de2025 Toyota Corolla precio 26800€
     * </p>
     *
     * @return una cadena con la descripción del coche
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * Devuelve una representación en forma de texto del objeto {@code Car}.
     *
     * @return una descripción del coche
     */
    @Override
    public String toString() {
        return carDescription();
    }

    /**
     * Método principal que sirve como ejemplo de uso de la clase {@code Car}.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}

