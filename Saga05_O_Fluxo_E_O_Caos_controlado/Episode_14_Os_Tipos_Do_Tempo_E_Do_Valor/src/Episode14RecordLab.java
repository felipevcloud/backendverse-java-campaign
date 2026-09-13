import java.util.ArrayList;
import java.util.List;

public class Episode14RecordLab {

    record PedidoCompra(String codigo, List<String> itens) {
        public PedidoCompra {
            if (codigo == null || codigo.isBlank()) {
                throw new IllegalArgumentException();
            }

            if (itens == null || itens.isEmpty()) {
                throw new IllegalArgumentException();
            }

            itens = List.copyOf(itens);
        }
    }

    record Playlist(String nome, List<String> musicas) {
        public Playlist {
            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("Nome não pode ser vazio.");
            }

            if (musicas == null || musicas.size() < 2) {
                throw new IllegalArgumentException("Playlist deve conter pelo menos duas músicas.");
            }

            musicas = List.copyOf(musicas);
        }
    }

    public static void main(String[] args) {

        List<String> origem = new ArrayList<>();
        origem.add("teclado");
        origem.add("mouse");

        PedidoCompra primeiro =
                new PedidoCompra("PED-42", origem);

        PedidoCompra segundo =
                new PedidoCompra(
                        "PED-42",
                        List.of("teclado", "mouse")
                );

        System.out.println("=== valor ===");
        System.out.println(primeiro);
        System.out.println("iguais = " + primeiro.equals(segundo));

        System.out.println("\n=== cópia defensiva ===");

        origem.add("RTX 9090 clandestina");

        System.out.println("origem = " + origem);
        System.out.println("pedido = " + primeiro.itens());

        System.out.println("\n=== accessor protegido ===");

        try {
            primeiro.itens().add("invasor");
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "lista interna não pode ser modificada"
            );
        }

        System.out.println("\n=== nascimento inválido ===");

        testarInvalido(
                "",
                List.of("mouse")
        );

        testarInvalido(
                "PED-99",
                List.of()
        );

        System.out.println("\n=== playlist ===");

        List<String> origemPlaylist = new ArrayList<>();
        origemPlaylist.add("Butter-Fly");
        origemPlaylist.add("Brave Heart");

        Playlist digiviceMix =
                new Playlist("Digital World", origemPlaylist);

        Playlist copia =
                new Playlist(
                        "Digital World",
                        List.of("Butter-Fly", "Brave Heart")
                );

        System.out.println(digiviceMix);
        System.out.println("iguais = " + digiviceMix.equals(copia));

        System.out.println("\n=== mutação externa ===");

        origemPlaylist.add("The Biggest Dreamer");

        System.out.println("origem = " + origemPlaylist);
        System.out.println("playlist = " + digiviceMix.musicas());

        System.out.println("\n=== tentativa de invasão ===");

        try {
            digiviceMix.musicas().add("vilão infiltrado");
            System.out.println("ERRO: lista foi modificada");
        } catch (UnsupportedOperationException e) {
            System.out.println("PASS: coleção protegida");
        }

        System.out.println("\n=== inválidos ===");

        testarPlaylistInvalida(
                "",
                List.of("Butter-Fly", "Brave Heart")
        );

        testarPlaylistInvalida(
                "Uma música só",
                List.of("Butter-Fly")
        );

        testarPlaylistInvalida(
                "Lista nula",
                null
        );
    }

    private static void testarInvalido(
            String codigo,
            List<String> itens
    ) {
        try {
            new PedidoCompra(codigo, itens);
            System.out.println("ERRO: deveria ter falhado");
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "rejeitado: " + e.getMessage()
            );
        }
    }

    private static void testarPlaylistInvalida(
            String nome,
            List<String> musicas
    ) {
        try {
            new Playlist(nome, musicas);
            System.out.println("FAIL: deveria rejeitar");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: " + e.getMessage());
        }
    }
}