public class Supervisor implements Autenticable, Reportable{

    private String usuarioCorrecto = "supervisor";
    private String claveCorrecta = "sup123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if(usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Supervisor autenticado.");
            return true;
        }

        System.out.println("Credenciales incorrectas.");
        return false;
    }

    @Override
    public void generarReporte() {
        System.out.println("Supervisor generando reporte de actividades.");
    }


}
