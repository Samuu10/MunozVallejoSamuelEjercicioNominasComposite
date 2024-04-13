import java.util.ArrayList;
import java.util.List;

public class UniversidadComposite implements NominaComponente{
    //Atributos
    private List<NominaComponente> componentes;
    private String nombre;

    //Constructor
    public UniversidadComposite(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    @Override
    public void agregar(NominaComponente componente) {
        componentes.add(componente);
    }
    @Override
    public void eliminar(NominaComponente componente) {
        componentes.remove(componente);
    }

    @Override
    public double calcularNomina() {
        double total = 0;
        for (NominaComponente componente : componentes) {
            total += componente.calcularNomina();
        }
        return total;
    }
}