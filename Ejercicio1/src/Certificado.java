public class Certificado implements Imprimible{

    public int numeroCertificado;

    numeroCertificado = 113;

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo certificado de matrícula del estudiante...");
        System.out.println("Certificado generado correctamente");
        System.out.println("Numero de certificado: " + numeroCertificado);
    }
}
