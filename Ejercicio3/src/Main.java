import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    int opcion = 0;
    while (opcion != 4){
        System.out.println("SISTEMA DE INICIO DE SESION");
        System.out.println("Elige un rol: ");
        System.out.println("1. Cajero");
        System.out.println("2. Admin");
        System.out.println("3. Supervisor");
        System.out.println("4. Salir");

        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                Cajero c = new Cajero();
                c.iniciarSesion("cajero", "123");
                break;

            case 2:
                Administrador a = new Administrador();

                a.iniciarSesion("admin", "admin123");
                a.generarReporte();
                a.gestionarDatos();
                break;

            case 3:
                Supervisor s = new Supervisor();
                s.iniciarSesion("supervisor", "sup123");
                s.generarReporte();
                break;

            case 4:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opcion invalida, intente nuevamente!!");


        }
    }
}



