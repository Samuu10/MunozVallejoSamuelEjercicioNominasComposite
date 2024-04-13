import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNominas {
    @Test
    public void testCalculoNominaProfesor() {
        ProfesorComposite profesor = new ProfesorComposite("Profesor 1", "NP1", 40, 50);
        double resultadoEsperado = 40 * 50;
        assertEquals(resultadoEsperado, profesor.calcularNomina(), 0.001);
    }

    @Test
    public void testCalculoNominaDepartamento() {
        DepartamentoComposite departamento = new DepartamentoComposite("Departamento 1", 0.03);
        ProfesorComposite profesor1 = new ProfesorComposite("Profesor 1", "NP1", 40, 50);
        ProfesorComposite profesor2 = new ProfesorComposite("Profesor 2", "NP2", 35, 45);
        departamento.agregar(profesor1);
        departamento.agregar(profesor2);
        double resultadoEsperado = (40 * 50 + 35 * 45) * (1 + 0.03);
        assertEquals(resultadoEsperado, departamento.calcularNomina(), 0.001);
    }

    @Test
    public void testCalculoNominaFacultad() {
        double complementoFacultad = 0.05; // Definimos el complemento directamente
        FacultadComposite facultad = new FacultadComposite("Facultad 1", complementoFacultad);
        DepartamentoComposite departamento1 = new DepartamentoComposite("Departamento 1", 0.03);
        DepartamentoComposite departamento2 = new DepartamentoComposite("Departamento 2", 0.07);
        ProfesorComposite profesor1 = new ProfesorComposite("Profesor 1", "NP1", 40, 50);
        ProfesorComposite profesor2 = new ProfesorComposite("Profesor 2", "NP2", 35, 45);
        departamento1.agregar(profesor1);
        departamento2.agregar(profesor2);
        facultad.agregar(departamento1);
        facultad.agregar(departamento2);

        // Calculamos la nómina esperada
        double nominaDepartamento1 = departamento1.calcularNomina();
        double nominaDepartamento2 = departamento2.calcularNomina();
        double resultadoEsperado = (nominaDepartamento1 + nominaDepartamento2) * (1 + complementoFacultad);

        assertEquals(resultadoEsperado, facultad.calcularNomina(), 0.001);
    }

    @Test
    public void testCalculoNominaUniversidad() {
        UniversidadComposite universidad = new UniversidadComposite("Mi Universidad");
        FacultadComposite facultad1 = new FacultadComposite("Facultad 1", 0.05);
        FacultadComposite facultad2 = new FacultadComposite("Facultad 2", 0.1);
        DepartamentoComposite departamento1 = new DepartamentoComposite("Departamento 1", 0.03);
        DepartamentoComposite departamento2 = new DepartamentoComposite("Departamento 2", 0.07);
        ProfesorComposite profesor1 = new ProfesorComposite("Profesor 1", "NP1", 40, 50);
        ProfesorComposite profesor2 = new ProfesorComposite("Profesor 2", "NP2", 35, 45);
        ProfesorComposite profesor3 = new ProfesorComposite("Profesor 3", "NP3", 30, 55);
        ProfesorComposite profesor4 = new ProfesorComposite("Profesor 4", "NP4", 25, 60);
        departamento1.agregar(profesor1);
        departamento1.agregar(profesor2);
        departamento2.agregar(profesor3);
        departamento2.agregar(profesor4);
        facultad1.agregar(departamento1);
        facultad2.agregar(departamento2);
        universidad.agregar(facultad1);
        universidad.agregar(facultad2);

        // Calculamos la nómina esperada
        double nominaFacultad1 = facultad1.calcularNomina();
        double nominaFacultad2 = facultad2.calcularNomina();
        double resultadoEsperado = (nominaFacultad1 + nominaFacultad2);

        assertEquals(resultadoEsperado, universidad.calcularNomina(), 0.001);
    }
}