public class HorarioAcademico implements Imprimible{
    public String carrera = "Desarrollo de software";

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo horario académico de Ingeniería de Software");
        System.out.println("Horario generado con éxito");
        System.out.println("Carrera: " + carrera);
    }
}
