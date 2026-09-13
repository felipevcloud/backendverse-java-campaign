public class Episode14Lab {
    public static void main(String[] args) {

        for (PrioridadeChamado prioridade : PrioridadeChamado.values()) {
            System.out.printf(
                    "%s -> imediato=%s%n",
                    prioridade,
                    prioridade.exigeAtendimentoImediato()
            );
        }

        System.out.println("\n=== entrada textual ===");

        testarEntrada("ALTA");
        testarEntrada("CRITICA");
        testarEntrada("URGENTISSIMA");

        testarTransicoes();
    }

    private static void testarEntrada(String texto) {
        try {
            PrioridadeChamado prioridade = PrioridadeChamado.valueOf(texto);

            System.out.printf(
                    "%s -> válido, imediato=%s%n",
                    texto,
                    prioridade.exigeAtendimentoImediato()
            );
        } catch (IllegalArgumentException e) {
            System.out.printf("%s -> prioridade inválida%n", texto);
        }
    }

    private static void testarTransicoes() {
        System.out.println("\n=== transições ===");

        System.out.println(
                "ABERTO -> EM_ATENDIMENTO = "
                        + StatusChamado.ABERTO
                        .podeAvancarPara(StatusChamado.EM_ATENDIMENTO)
        );

        System.out.println(
                "ABERTO -> RESOLVIDO = "
                        + StatusChamado.ABERTO
                        .podeAvancarPara(StatusChamado.RESOLVIDO)
        );

        System.out.println(
                "EM_ATENDIMENTO -> RESOLVIDO = "
                        + StatusChamado.EM_ATENDIMENTO
                        .podeAvancarPara(StatusChamado.RESOLVIDO)
        );

        System.out.println(
                "RESOLVIDO -> ABERTO = "
                        + StatusChamado.RESOLVIDO
                        .podeAvancarPara(StatusChamado.ABERTO)
        );
    }
}

enum PrioridadeChamado {
    BAIXA,
    MEDIA,
    ALTA,
    CRITICA;

    public boolean exigeAtendimentoImediato() {
        return this == CRITICA;
    }
}

enum StatusChamado {
    ABERTO,
    EM_ATENDIMENTO,
    RESOLVIDO;

    public boolean podeAvancarPara(StatusChamado destino) {
        if (this == ABERTO && destino == EM_ATENDIMENTO) {
            return true;
        }

        if (this == EM_ATENDIMENTO && destino == RESOLVIDO) {
            return true;
        }

        return false;
    }
}