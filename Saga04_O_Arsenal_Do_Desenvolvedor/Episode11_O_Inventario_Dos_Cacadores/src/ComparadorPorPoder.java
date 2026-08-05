import java.util.Comparator;

public class ComparadorPorPoder implements Comparator<ItemDeCaca> {

    @Override
    public int compare(ItemDeCaca o1, ItemDeCaca o2) {
        if (o1.getPoder() == o2.getPoder()) {
            return o2.compareTo(o1);
        }
        return Integer.compare(o2.getPoder(), o1.getPoder());
    }
}
