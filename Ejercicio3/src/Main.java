//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cajero c = new Cajero();
    Administrador a = new Administrador();
    Supervisor s = new Supervisor();

    c.iniciarSesion("cajero", "123");
    a.gestionarDatos();

    System.out.println();

    a.iniciarSesion("admin", "admin123");
    a.generarReporte();
    a.gestionarDatos();

    System.out.println();

    s.iniciarSesion("supervisor", "sup123");
    s.generarReporte();
}
