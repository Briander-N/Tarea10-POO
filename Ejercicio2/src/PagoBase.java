public abstract class PagoBase implements Pagable {

    protected boolean validarMonto(double monto) {

        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a cero.");
            return false;
        }
        return true;

    }
}