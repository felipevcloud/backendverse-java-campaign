import java.util.ArrayList;

public class RegistroDoArsenal {

    private ArrayList<Artefato> artefatos = new ArrayList<>();
    private ArrayList<Integer> resultados = new ArrayList<>();

    public boolean registrarArtefato(Artefato artefato) {
        if (artefato != null) {
            artefatos.add(artefato);
            System.out.println(artefato.getNome() + " foi armazenado no Arsenal Dimensional.");
            return true;
        }
        System.out.println("Não foi possível registrar um artefato inexistente.");
        return false;
    }

    public void calcularPoderesFinais() {
        for (Artefato artefato : artefatos) {
            resultados.add(CalculadoraDoArsenal.calcularPoderFinal(artefato.getPoderBase(), artefato.getMultiplicador()));
        }
    }

    public void apresentarCatalogo() {
        for(int i = 0; i < artefatos.size(); i++) {
            artefatos.get(i).apresentarDados();
            System.out.println("Poder Final: " + resultados.get(i));
            if (resultados.get(i) == Artefato.LIMITE_MAXIMO) {
                System.out.println("Limite universal de poder atingido.");
            }
            System.out.println();
        }
    }

    public int quantidadeRegistrada() {
        return artefatos.size();
    }

    public void apresentarRelatorioFinal() {
        System.out.println("Quantidade Registrada: " + quantidadeRegistrada());
        System.out.println("Total de artefatos criados: " + Artefato.getTotalDeArtefatos());
        System.out.println("Limite máximo universal: " + Artefato.LIMITE_MAXIMO);
        int maximo = 0, minimo = Artefato.LIMITE_MAXIMO;
        for (int i = 0; i < resultados.size(); i++) {
            minimo = Math.min(minimo, resultados.get(i));
            maximo = Math.max(maximo, resultados.get(i));
        }
        System.out.println("Maior poder registrado: " + maximo);
        System.out.println("Menor poder registrado: " + minimo);

    }
}
