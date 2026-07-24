public class BastiaoPrismatico extends Construcao implements Defensora, Expansora{

    public BastiaoPrismatico(String nome, String arquiteto, int integridade, NucleoArquitetonico nucleo, String sistemaPrincipal, int custo) {
        super(nome, arquiteto, integridade, nucleo, sistemaPrincipal, custo);
        System.out.println("[Bastião] Estrutura prismática materializada.\n");
    }

    @Override
    public boolean ativarSistemaPrincipal() {
        if (getNucleo().consumirEnergia(getCustoAtivacao())) {
            System.out.println(getNome() + " ativa o sistema Domínio Prismático!\n" +
                    "Luz e matéria redesenham o campo arquitetônico.\n");
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void ativarDefesa() {
        System.out.println(getNome() + " projeta uma Barreira de Luz Refratada!");
    }

    @Override
    public void expandirEstrutura() {
        System.out.println(getNome() + " multiplica suas torres pelo campo prismático!");
    }
}
