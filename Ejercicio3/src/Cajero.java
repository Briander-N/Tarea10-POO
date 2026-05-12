public class Cajero implements Autenticable, Gestionable{
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return false;
    }

    @Override
    public void gestionarDatos() {

    }
}
