//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    PagoEfectivo e1 = new PagoEfectivo();
    PagoTarjeta tar1 = new PagoTarjeta();
    Transferencia t1 = new Transferencia();


    System.out.println("//////////////////////////////");
    e1.procesarPago(100);
    System.out.println("//////////////////////////////");
    tar1.procesarPago(250);
    System.out.println("//////////////////////////////");
    t1.procesarPago(-50);

}
