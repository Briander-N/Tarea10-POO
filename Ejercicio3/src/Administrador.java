public class Administrador implements Autenticable, Reportable, Gestionable{

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return false;
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void gestionarDatos() {

    }
}
