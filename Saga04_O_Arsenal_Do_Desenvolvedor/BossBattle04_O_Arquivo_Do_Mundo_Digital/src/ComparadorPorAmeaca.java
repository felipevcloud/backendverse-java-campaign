import java.util.Comparator;

public class ComparadorPorAmeaca implements Comparator<Digimon> {

    @Override
    public int compare(Digimon o1, Digimon o2) {
        if (o1.getNivelDeAmeaca() == o2.getNivelDeAmeaca() && o1.getQuantidadeDeDados() == o2.getQuantidadeDeDados()) {
            return o1.compareTo(o2);
        } else if (o1.getNivelDeAmeaca() == o2.getNivelDeAmeaca()) {
            return Integer.compare(o2.getQuantidadeDeDados(), o1.getQuantidadeDeDados());
        } else {
            return Integer.compare(o2.getNivelDeAmeaca(), o1.getNivelDeAmeaca());
        }
    }
}
