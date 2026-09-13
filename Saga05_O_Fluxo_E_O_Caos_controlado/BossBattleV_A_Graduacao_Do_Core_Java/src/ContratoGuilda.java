import java.time.LocalDate;
import java.util.Optional;

public class ContratoGuilda {

    private final String id;
    private final String titulo;
    private final Recompensa recompensa;
    private final LocalDate prazo;
    private StatusContrato status;
    private Aventureiro aventureiro;

    public ContratoGuilda(String id, String titulo, Recompensa recompensa, LocalDate prazo) {
        if (id == null || titulo == null || recompensa == null || prazo == null) {
            throw new IllegalArgumentException("Null Argument");
        }

        if (id.isBlank() || titulo.isBlank()) {
            throw new IllegalArgumentException("Blank Argument");
        }

        this.id = id;
        this.titulo = titulo;
        this.recompensa = recompensa;
        this.prazo = prazo;
        this.status = StatusContrato.ABERTO;
        this.aventureiro = null;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Recompensa getRecompensa() {
        return recompensa;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public StatusContrato getStatus() {
        return status;
    }

    public Optional<Aventureiro> getAventureiro() {
        return Optional.ofNullable(aventureiro);
    }

    public void atribuirAventureiro(Aventureiro aventureiro) {
        if (aventureiro == null) {
            throw new IllegalArgumentException("Null Attribute");
        }

        if (this.aventureiro == null) {
            this.aventureiro = aventureiro;
        } else {
            throw new IllegalArgumentException("Contrato já tem um Aventureiro");
        }
    }

    public void aceitar() throws TransicaoContratoException {
        if (!status.equals(StatusContrato.ABERTO)) {
            throw new TransicaoContratoException(id + " - " + status + " -> Mudança para ACEITO negada");
        }
        status = StatusContrato.ACEITO;
    }

    public void concluir() throws TransicaoContratoException {
        if (!status.equals(StatusContrato.ACEITO)) {
            throw new TransicaoContratoException(id + " - " + status + " -> Mudança para CONCLUIDO negada");
        }
        status = StatusContrato.CONCLUIDO;
    }

    public void cancelar() throws TransicaoContratoException {
        if (status.equals(StatusContrato.CONCLUIDO) || status.equals(StatusContrato.CANCELADO)) {
            throw new TransicaoContratoException(id + " - " + status + " -> Mudança para CANCELADO negada");
        }
        status = StatusContrato.CANCELADO;
    }
}
