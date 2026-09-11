import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Episode13Lab {

    public static void main(String[] args) {

        testarConversao("42");
        testarConversao("Gatomon");

        System.out.println("\n=== ARQUIVO ===");

        testarArquivo();

        Reator reator = new Reator(100);

        try {
            reator.consumir(30);
            System.out.println("Após consumo válido: " + reator.getEnergia());

            reator.consumir(90);

        } catch (EnergiaInsuficienteException e) {
            System.out.println("Falha: " + e.getMessage());
            System.out.println("Disponível: " + e.getEnergiaDisponivel());
            System.out.println("Solicitado: " + e.getEnergiaSolicitada());
        }

        System.out.println("Energia final: " + reator.getEnergia());

        try {
            carregarDados();

        } catch (CarregamentoException e) {
            System.out.println("\n=== CAUSA ===");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Causa: " + e.getCause().getClass().getSimpleName());
        }

        System.out.println("\n=== RECURSO: SUCESSO ===");
        executarPortalComSucesso();

        System.out.println("\n=== RECURSO: FALHA ===");
        executarPortalComFalha();

        System.out.println("\n=== FALLBACK ===");
        System.out.println("Tema: " + carregarTema());

        System.out.println("\n=== PROPAGAÇÃO ===");
        try {
            System.out.println("Chave: " + carregarChave());
        } catch (IOException e) {
            System.out.println("Falha da chave chegou ao chamador.");
        }

        System.out.println("\n=== DECISÃO INDEPENDENTE ===");

        System.out.println("Idioma: " + carregarIdioma());

        try {
            System.out.println("Token: " + carregarTokenAssinatura());
        } catch (IOException e) {
            System.out.println("Falha do token chegou ao chamador.");
        }

        System.out.println("\n=== FINALLY: SUCESSO ===");
        demonstrarFinally(false);

        System.out.println("\n=== FINALLY: FALHA ===");
        demonstrarFinally(true);

        System.out.println("\n=== BOSS: SUCESSO ===");
        CofreCristais cofreSucesso = new CofreCristais(100);

        try {
            cofreSucesso.retirar(30, false);
            System.out.println("Cristais finais: " + cofreSucesso.getCristais());
        } catch (CristaisInsuficientesException | FalhaDespachoException e) {
            System.out.println("FALHA INESPERADA: " + e.getMessage());
        }


        System.out.println("\n=== BOSS: INSUFICIENTE ===");
        CofreCristais cofreInsuficiente = new CofreCristais(100);

        try {
            cofreInsuficiente.retirar(150, false);
        } catch (CristaisInsuficientesException e) {
            System.out.println("Disponíveis: " + e.getDisponiveis());
            System.out.println("Solicitados: " + e.getSolicitados());
        } catch (FalhaDespachoException e) {
            System.out.println("FALHA INESPERADA");
        }

        System.out.println("Cristais finais: " + cofreInsuficiente.getCristais());


        System.out.println("\n=== BOSS: FALHA INTERMEDIÁRIA ===");
        CofreCristais cofreFalha = new CofreCristais(100);

        try {
            cofreFalha.retirar(30, true);
        } catch (CristaisInsuficientesException e) {
            System.out.println("FALHA INESPERADA");
        } catch (FalhaDespachoException e) {
            System.out.println("Despacho falhou: " + e.getMessage());
            System.out.println(
                    "Causa: " + e.getCause().getClass().getSimpleName()
            );
        }

        System.out.println("Cristais finais: " + cofreFalha.getCristais());
    }

    static void testarConversao(String entrada) {
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Entrada Inválida");
        }

        System.out.println("Continua...");
    }

    static void testarArquivo() {
        try {
            Files.readString(Path.of("arquivo-que-nao-existe.txt"));
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo.");
        }
        System.out.println("Continua...");
    }

    static void carregarDados() throws CarregamentoException {
        try {
            Files.readString(Path.of("dados-inexistentes.txt"));
        } catch (IOException e) {
            throw new CarregamentoException("...", e);
        }
    }

    static void executarPortalComSucesso() {
        try (Portal portal = new Portal("Portal-Sucesso")) {
            portal.usar(false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void executarPortalComFalha() {
        try (Portal portal = new Portal("Portal-Falha")) {
            portal.usar(true);
        } catch (Exception e) {
            System.out.println("TRATADA: " + e.getMessage());
        }
    }

    static String carregarTema() {
        try {
            return Files.readString(Path.of("tema.txt"));
        } catch (IOException e) {
            return "PADRAO";
        }
    }

    static String carregarChave() throws IOException {
        return Files.readString(Path.of("chave.txt"));
    }

    static String carregarIdioma() {
        try {
            return Files.readString(Path.of("idioma.txt"));
        } catch (IOException e) {
            return "pt-BR";
        }
    }

    static String carregarTokenAssinatura() throws IOException{
        return Files.readString(Path.of("token-assinatura.txt"));
    }

    static void demonstrarFinally(boolean falhar) {
        try {
            System.out.println("INICIO");

            if (falhar) {
                throw new IllegalStateException();
            }

            System.out.println("SUCESSO");
        } catch (IllegalStateException e) {
            System.out.println("FALHA");
        } finally {
            System.out.println("LIMPEZA");
        }
    }
}

class EnergiaInsuficienteException extends Exception {
    private final int energiaDisponivel;
    private final int energiaSolicitada;

    EnergiaInsuficienteException(String mensagem, int energiaDisponivel, int energiaSolicitada) {
        super(mensagem);
        this.energiaDisponivel = energiaDisponivel;
        this.energiaSolicitada = energiaSolicitada;
    }

    public int getEnergiaDisponivel() {
        return energiaDisponivel;
    }

    public int getEnergiaSolicitada() {
        return energiaSolicitada;
    }
}

class Reator {

    private int energia;

    Reator(int energiaInicial) {
        this.energia = energiaInicial;
    }

    int getEnergia() {
        return energia;
    }

    void consumir(int quantidade) throws EnergiaInsuficienteException {
        if (quantidade > getEnergia()) {
            throw new EnergiaInsuficienteException("Energia Insuficiente", getEnergia(), quantidade);
        } else {
            energia -= quantidade;
        }
    }
}

class CarregamentoException extends Exception {

    CarregamentoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

class Portal implements AutoCloseable {

    private final String nome;

    Portal(String nome) {
        this.nome = nome;
        System.out.println("ABRIU: " + nome);
    }

    void usar(boolean falhar) throws Exception {
        System.out.println("USANDO: " + nome);

        if (falhar) {
            throw new Exception("Falha durante uso de " + nome);
        }

        System.out.println("USO CONCLUÍDO: " + nome);
    }

    @Override
    public void close() {
        System.out.println("FECHOU: " + nome);
    }
}