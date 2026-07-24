public class NucleoArquitetonico {

    private String identificacao;
    private int energia;

    NucleoArquitetonico(String identificacao, int energia) {
        if (identificacao.isEmpty() || identificacao == null) {
            identificacao = "Núcleo Desconhecido";
            System.out.println("[Núcleo] Identificação inválida. Valor padrão aplicado: Núcleo Desconhecido.");
        }

        if (energia <= 0) {
            energia = 1;
            System.out.println("[Núcleo] Energia inválida. Valor mínimo aplicado: 1.");
        }

        this.identificacao = identificacao;
        this.energia = energia;

        System.out.println("[Núcleo] "+ identificacao + " estabilizado com " + energia + " de energia.");
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public int getEnergia() {
        return energia;
    }


    public boolean consumirEnergia(int custo) {
        if (energia >= custo) {
            energia -= custo;
            System.out.println(identificacao + " forneceu " + custo + " de energia.");
            System.out.println("Energia restante: " + energia);
            return true;
        } else {
            System.out.println(identificacao + " não possui energia suficiente.");
            System.out.println("Ativação recusada. Energia preservada: " + energia);
            return false;
        }
    }

    public void apresentarEstado() {
        System.out.println("Núcleo: " + identificacao + "\n" +
                "Energia disponível: " + energia);
    }
}
