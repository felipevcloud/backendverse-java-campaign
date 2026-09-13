import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

public class CentralContratos {

    private final Map<String, ContratoGuilda> contratos = new HashMap<>();

    public void cadastrar(ContratoGuilda contrato) {
        contratos.put(contrato.getId(), contrato);
    }

    public int quantidade() {
        return contratos.size();
    }

    public boolean existe(String id) {
        return contratos.containsKey(id);
    }

    public Optional<ContratoGuilda> buscarPorId(String id) {
        return Optional.ofNullable(contratos.get(id));
    }

    public List<ContratoGuilda> listarPorStatus(StatusContrato status) {
        return contratos.values().stream()
                .filter(contrato -> contrato.getStatus().equals(status))
                .sorted(Comparator.comparing(ContratoGuilda::getPrazo).thenComparing(ContratoGuilda::getId))
                .toList();
    }

    public BigDecimal totalRecompensasPorStatus(StatusContrato status) {
        return contratos.values().stream()
                .filter(contratoGuilda -> contratoGuilda.getStatus().equals(status))
                .map(contratoGuilda -> contratoGuilda.getRecompensa().valor())
                .reduce(BigDecimal.ZERO, (accumulator, element) -> accumulator.add(element));
    }

    public List<ContratoGuilda> listarPorAventureiro(String codigoAventureiro) {
        return contratos.values().stream()
                .filter(contratoGuilda -> contratoGuilda.getAventureiro().map(aventureiro -> aventureiro.codigo().equals(codigoAventureiro)).orElse(false))
                .toList();
    }
}