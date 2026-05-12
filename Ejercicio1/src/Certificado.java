public class Certificado implements Imprimible{

    public int numeroCertificado;

    @Override
    public void imprimir() {
        numeroCertificado = 113;
        System.out.println("Imprimiendo certificado de matrícula del estudiante...");
        System.out.println("Certificado generado correctamente");
        System.out.println("Numero de certificado: " + numeroCertificado);
    }
}
