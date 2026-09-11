public class CofreCristais {

    private int cristais;

    public CofreCristais(int cristaisIniciais) {
        this.cristais = cristaisIniciais;
    }

    int getCristais() {
        return cristais;
    }

    void retirar(int quantidade, boolean falharNoDespacho) throws CristaisInsuficientesException, FalhaDespachoException {
        if (quantidade > cristais) {
            throw new CristaisInsuficientesException("INSUFICIENTE", cristais, quantidade);
        }

        try (CanalEntrega canal = new CanalEntrega("Canal_Cofre")){
            canal.despachar(falharNoDespacho);
        } catch (Exception e) {
            throw new FalhaDespachoException("FALHA NO DESPACHO", e);
        }

        cristais -= quantidade;
    }
}

class CanalEntrega implements AutoCloseable {

    private final String nome;

    CanalEntrega(String nome) {
        this.nome = nome;
        System.out.println("ABRIU CANAL: " + nome);
    }

    void despachar(boolean falhar) throws Exception {
        System.out.println("DESPACHANDO");

        if (falhar) {
            throw new Exception("Falha durante despacho");
        }

        System.out.println("DESPACHO CONCLUÍDO");
    }

    @Override
    public void close() {
        System.out.println("FECHOU CANAL: " + nome);
    }
}

class FalhaDespachoException extends Exception {

    FalhaDespachoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}