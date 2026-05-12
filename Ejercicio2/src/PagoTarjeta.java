public class PagoTarjeta extends PagoBase {

    @Override
    public void procesarPago(double monto) {

        if (validarMonto(monto)) {
            System.out.println("Pago con tarjeta aprobado.");
            System.out.println("Monto: $" + monto);
        }
    }
}