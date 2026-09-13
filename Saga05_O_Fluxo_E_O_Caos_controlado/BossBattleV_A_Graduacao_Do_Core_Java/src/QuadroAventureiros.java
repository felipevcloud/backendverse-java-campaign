import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class QuadroAventureiros {

    private final Map<String, Aventureiro> quadroAventureiros = new HashMap<>();

    public void registrarAventureiro(Aventureiro aventureiro) {
        if (!buscarPorCodigo(aventureiro.codigo()).isEmpty()) {
            throw new IllegalArgumentException("Código Inválido");
        }

        quadroAventureiros.put(aventureiro.codigo(), aventureiro);
    }

    public Optional<Aventureiro> buscarPorCodigo(String codigo) {
        return Optional.ofNullable(quadroAventureiros.get(codigo));
    }

    public int quantidade() {
        return quadroAventureiros.size();
    }

    public boolean existe(String id) {
        return quadroAventureiros.containsKey(id);
    }

    public String nomeOuPadrao(String codigo, String nomePadrao) {
        return quadroAventureiros.values().stream()
                .filter(aventureiro -> aventureiro.codigo().equals(codigo))
                .findFirst()
                .map(Aventureiro::nome)
                .orElse(nomePadrao);
    }
}
