public class PagoEfectivo extends PagoBase {

    @Override
    public void procesarPago(double monto) {

        if (validarMonto(monto)) {
            System.out.println("Pago en efectivo realizado.");
            System.out.println("Monto: $" + monto);
        }
    }
}