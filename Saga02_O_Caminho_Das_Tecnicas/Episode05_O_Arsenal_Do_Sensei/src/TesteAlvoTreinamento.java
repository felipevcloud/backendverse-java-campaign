public class TesteAlvoTreinamento {
    public static void main(String[] args) {
        System.out.println("=== Testes do Alvo de Treinamento ===");
        System.out.println();

        AlvoTreinamento teste = new AlvoTreinamento();
        teste.configurar("Teste", 10);
        if (teste.consultarResistencia() == 10) {
            System.out.println("[PASS] Resistência inicial configurada corretamente.");
        } else {
            System.out.println("[FAIL] Resistência inicial incorreta.");
        }

        teste.receberAtaque(4);
        if (teste.consultarResistencia() == 6) {
            System.out.println("[PASS] Ataque reduziu a resistência corretamente.");
        } else {
            System.out.println("[FAIL] Ataque reduziu a resistência incorretamente.");
        }

        if (teste.estaDestruido() == false) {
            System.out.println("[PASS] Alvo permaneceu ativo após ataque parcial.");
        } else {
            System.out.println("[FAIL] Alvo foi destruído após ataque parcial.");
        }

        teste.receberAtaque(6);
        if (teste.consultarResistencia() == 0) {
            System.out.println("[PASS] Resistência não ficou abaixo de zero.");
        } else {
            System.out.println("[FAIL] Resistência ficou abaixo de zero.");
        }

        if (teste.estaDestruido() == true) {
            System.out.println("[PASS] Alvo foi marcado como destruído.");
        } else {
            System.out.println("[FAIL] Alvo não foi marcado como destruído.");
        }

        AlvoTreinamento negativo = new AlvoTreinamento();
        negativo.configurar("Negativo", -2);
        if (negativo.consultarResistencia() == 0) {
            System.out.println("[PASS] Resistência negativa foi corrigida.");
        } else {
            System.out.println("[FAIL] Resistência negativa não foi corrigida.");
        }
        System.out.println();

        System.out.println("Testes concluídos.");

    }
}