import java.util.*;

public class ArquivoDigital {

    private List<Digimon> catalogo;
    private Set<Digimon> registrosUnicos;
    private Map<Digimon, Integer> avistamentos;

    public ArquivoDigital() {
        catalogo = new ArrayList<>();
        registrosUnicos = new HashSet<>();
        avistamentos = new HashMap<>();
    }

    public boolean registrarDigimon(Digimon digimon) {
        if (digimon == null) {
            System.out.println("Não foi possível registrar uma entidade digital inexistente.");
            return false;
        } else {
            if (registrosUnicos.add(digimon)) {
                catalogo.add(digimon);
                avistamentos.put(digimon, 1);
                System.out.println("[Novo registro] " + digimon.getNome() + " foi adicionado ao Arquivo Digital.");
            } else {
                avistamentos.put(digimon, avistamentos.get(digimon) + 1);
                System.out.println("[Avistamento] " + digimon.getNome() + " já estava catalogado. Total: " + avistamentos.get(digimon) + ".");
            }
        }
        return true;
    }

    public int consultarAvistamentos(Digimon digimon) {
        if (digimon == null || !avistamentos.containsKey(digimon)) {
            return 0;
        } else {
            return avistamentos.get(digimon);
        }
    }

    public Digimon buscarPorCodigo(String codigo) {
        for (Digimon digimon : catalogo) {
            if (digimon.getCodigo().equals(codigo)) {
                return digimon;
            }
        }
        return null;
    }

    public List<Digimon> buscarPorNome(String termo) {
        List<Digimon> resultados = new ArrayList<>();
        for (Digimon digimon : catalogo) {
            if (digimon.getNome().toLowerCase().contains(termo)) {
                resultados.add(digimon);
            }
        }
        return resultados;
    }

    public void apresentarCatalogo() {
        List<Digimon> copia = new ArrayList<>(catalogo);
        Collections.sort(copia);
        for (Digimon digimon : copia) {
            System.out.println(digimon.getNome() + " | " + digimon.getCodigo() + " | Avistamentos: " + avistamentos.get(digimon));
        }
    }

    public void apresentarRankingDeAmeaca() {
        List<Digimon> copia = new ArrayList<>(catalogo);
        Collections.sort(copia, new ComparadorPorAmeaca());
        for (int i = 0; i < copia.size(); i++) {
            System.out.println(i+1 + "º - " + copia.get(i).getNome() + " | Ameaça: " + copia.get(i).getNivelDeAmeaca() + " | Dados: " + copia.get(i).getQuantidadeDeDados());
        }
    }

    public int quantidadeDeTipos() {
        return catalogo.size();
    }

    public int quantidadeDeRegistrosUnicos() {
        return registrosUnicos.size();
    }

    public int calcularTotalDeAvistamentos() {
        int total = 0;
        for (Digimon digimon : catalogo) {
            total += avistamentos.get(digimon);
        }
        return total;
    }

    public Digimon encontrarMaisAvistado() {
        Digimon avistado = catalogo.get(0);
        for (Digimon digimon : catalogo) {
            if (avistamentos.get(digimon) == avistamentos.get(avistado)) {
                avistado.compareTo(digimon);
            } else if (avistamentos.get(digimon) > avistamentos.get(avistado)){
                avistado = digimon;
            }
        }
        return avistado;
    }

    public void apresentarAvistamentos() {
        List<Digimon> copia = new ArrayList<>(catalogo);
        Collections.sort(copia);
        for (Digimon digimon : copia) {
            System.out.println(digimon.getNome() + ": " + avistamentos.get(digimon));
        }
        System.out.println();
    }

    public void apresentarRelatorioFinal() {
        System.out.println("Tipos únicos no catálogo: " + quantidadeDeTipos());
        System.out.println("Registros únicos no Set: " + quantidadeDeRegistrosUnicos());
        System.out.println("Digimon criados: " + Digimon.getTotalDeDigimonsCriados());
        System.out.println("Total de avistamentos: " + calcularTotalDeAvistamentos());
        System.out.println("Mais avistado: " + encontrarMaisAvistado().getNome());
        System.out.println("Avistamentos do mais encontrado: " + avistamentos.get(encontrarMaisAvistado()));
        System.out.println();
    }
}
