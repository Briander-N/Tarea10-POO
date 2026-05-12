public class Transferencia extends PagoBase {

    @Override
    public void procesarPago(double monto) {

        if (validarMonto(monto)) {
            System.out.println("Transferencia bancaria completada.");
            System.out.println("Monto: $" + monto);
        }
    }
}