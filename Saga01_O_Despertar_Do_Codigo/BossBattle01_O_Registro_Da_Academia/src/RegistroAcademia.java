public class RegistroAcademia {
   public static void main(String[] args) {
       System.out.println("=== Backendverse Academy ===\n" +
               "Boss Battle I — O Registro da Academia");
       System.out.println();

       System.out.println("Iniciando verificação dos registros...");
       System.out.println();

       AprendizRegistro varyon = new AprendizRegistro();
       AprendizRegistro luna = new AprendizRegistro();
       AprendizRegistro kai = new AprendizRegistro();
       AprendizRegistro[] alunos = new AprendizRegistro[5];

       varyon.nome = "Varyon";
       varyon.tecnicaPrincipal = "Java";
       varyon.nivel = 3;
       varyon.ativo = true;

       luna.nome = "Luna";
       luna.tecnicaPrincipal = "Lógica";
       luna.nivel = 2;
       luna.ativo = true;

       kai.nome = "Kai";
       kai.tecnicaPrincipal = "Arrays";
       kai.nivel = 1;
       kai.ativo = false;

       alunos[0] = varyon;
       alunos[1] = luna;
       alunos[2] = null;
       alunos[3] = kai;

       for(int i = 0; i < alunos.length; i++) {
           System.out.println("[Slot " + i + "]");
           if(alunos[i] != null) {
               alunos[i].apresentar();
               alunos[i].mostrarFicha();
           } else {
               System.out.println("Slot vazio detectado. Nenhum aprendiz registrado.");
           }
           System.out.println();
       }

       varyon.treinar();
       System.out.println();

       System.out.println("Teste de referência compartilhada:");
       System.out.println("Ficha pela referência original:");
       AprendizRegistro clone = varyon;
       clone.nivel = 5;
       varyon.mostrarFicha();
       System.out.println();

       System.out.println("Boss Battle I concluída.\n" +
               "Registro da Academia validado com sucesso.");



    }
}
