//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Certificado c = new Certificado();
    ActaNotas a = new ActaNotas();
    HorarioAcademico h = new HorarioAcademico();

    c.imprimir();
    System.out.println("//////////////////////////////");
    a.imprimir();
    System.out.println("//////////////////////////////");
    h.imprimir();

}
