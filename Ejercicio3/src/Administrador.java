public class Administrador implements Autenticable, Reportable, Gestionable{
    private String usuarioCorrecto = "admin";
    private String claveCorrecta = "admin123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if(usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Administrador autenticado.");
            return true;
        }

        System.out.println("Credenciales incorrectas.");
        return false;
    }

    @Override
    public void generarReporte() {
        System.out.println("Generando reporte general de la empresa.");

    }

    @Override
    public void gestionarDatos() {
        System.out.println("El administrador está gestionando información del sistema.");

    }
}
