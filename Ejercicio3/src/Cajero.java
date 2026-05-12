public class Cajero implements Autenticable, Gestionable{

    private String usuarioCorrecto = "cajero";
    private String claveCorrecta = "123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if(usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Cajero autenticado.");
            return true;
        }

        System.out.println("Credenciales incorrectas.");
        return false;
    }

    @Override
    public void gestionarDatos() {
        System.out.println("El cajero está gestionando pagos y ventas.");
    }
}
