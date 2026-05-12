public class ActaNotas {
    public String periodoAcademico;
    periodoAcademico = "2026-A";

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo acta de notas del período 2026-A");
        System.out.println("Acta académica lista para revisión");
        System.out.println("Atributo sugerido: " + periodoAcademico);
    }
}
