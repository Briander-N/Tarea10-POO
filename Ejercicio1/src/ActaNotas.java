public class ActaNotas implements Imprimible{
    public String periodoAcademico;


    @Override
    public void imprimir() {
        periodoAcademico = "2026-A";
        System.out.println("Imprimiendo acta de notas del período 2026-A");
        System.out.println("Acta académica lista para revisión");
        System.out.println("Periodo Academico: " + periodoAcademico);
    }
}
