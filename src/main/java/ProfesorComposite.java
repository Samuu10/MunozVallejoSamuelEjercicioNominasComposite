public class ProfesorComposite implements NominaComponente{
    //Atributos
    private String nombre;
    private String np;
    private int horasTrabajadas;
    private double precioHora;

    //Constructor
    public ProfesorComposite(String nombre, String np, int horasTrabajadas, double precioHora) {
        this.nombre = nombre;
        this.np = np;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    @Override
    public void agregar(NominaComponente componente) {
        //No se pueden agregar componentes a un profesor
    }

    @Override
    public void eliminar(NominaComponente componente) {
        //No se pueden eliminar componentes a un profesor
    }

    @Override
    public double calcularNomina() {
        return horasTrabajadas * precioHora;
    }
}