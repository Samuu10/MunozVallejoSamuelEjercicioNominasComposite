import java.util.ArrayList;
import java.util.List;

public class DepartamentoComposite implements NominaComponente{
    //Atributos
    private List<NominaComponente> componentes = new ArrayList<>();
    private String nombre;
    private double complemento;

    //Constructor
    public DepartamentoComposite(String nombre, double complemento) {
        this.nombre = nombre;
        this.complemento = complemento;
    }

    public void agregar(NominaComponente componente) {
        componentes.add(componente);
    }

    public void eliminar(NominaComponente componente) {
        componentes.remove(componente);
    }

    @Override
    public double calcularNomina() {
        double total = 0;
        for (NominaComponente componente : componentes) {
            total += componente.calcularNomina();
        }
        return total * (1 + complemento);
    }
}