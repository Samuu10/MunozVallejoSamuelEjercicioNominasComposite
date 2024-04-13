public class Main {
    public static void main(String[] args) {
        //Creamos la universidad
        UniversidadComposite universidad = new UniversidadComposite("Mi Universidad");

        //Creamos las facultades
        FacultadComposite facultad1 = new FacultadComposite("Facultad 1", 0.05);
        FacultadComposite facultad2 = new FacultadComposite("Facultad 2", 0.1);

        //Creamos los departamentos
        DepartamentoComposite departamento1 = new DepartamentoComposite("Departamento 1", 0.03);
        DepartamentoComposite departamento2 = new DepartamentoComposite("Departamento 2", 0.07);

        //Creamos los profesores
        ProfesorComposite profesor1 = new ProfesorComposite("Profesor 1", "NP1", 40, 50);
        ProfesorComposite profesor2 = new ProfesorComposite("Profesor 2", "NP2", 35, 45);
        ProfesorComposite profesor3 = new ProfesorComposite("Profesor 3", "NP3", 30, 55);
        ProfesorComposite profesor4 = new ProfesorComposite("Profesor 4", "NP4", 25, 60);

        //Agregamos los profesores a los departamentos
        departamento1.agregar(profesor1);
        departamento1.agregar(profesor2);
        departamento2.agregar(profesor3);
        departamento2.agregar(profesor4);

        //Agregamos los departamentos a las facultades
        facultad1.agregar(departamento1);
        facultad2.agregar(departamento2);

        //Agregamos las facultades a la universidad
        universidad.agregar(facultad1);
        universidad.agregar(facultad2);

        //Calculamps la nómina total de la universidad
        double nominaTotal = universidad.calcularNomina();
        System.out.println("Nómina total de la universidad: $" + nominaTotal);

        //Calculamos las nóminas parciales
        double nominaFacultad1 = facultad1.calcularNomina();
        double nominaFacultad2 = facultad2.calcularNomina();
        double nominaDepartamento1 = departamento1.calcularNomina();
        double nominaDepartamento2 = departamento2.calcularNomina();

        System.out.println("Nómina de Facultad 1: $" + nominaFacultad1);
        System.out.println("Nómina de Facultad 2: $" + nominaFacultad2);
        System.out.println("Nómina de Departamento 1: $" + nominaDepartamento1);
        System.out.println("Nómina de Departamento 2: $" + nominaDepartamento2);

        System.out.printf("Nómina de Profesor 1: $%.2f\n", profesor1.calcularNomina());
        System.out.printf("Nómina de Profesor 2: $%.2f\n", profesor2.calcularNomina());
        System.out.printf("Nómina de Profesor 3: $%.2f\n", profesor3.calcularNomina());
        System.out.printf("Nómina de Profesor 4: $%.2f\n", profesor4.calcularNomina());
    }
}