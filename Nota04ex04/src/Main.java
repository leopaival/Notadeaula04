public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Juba");
        Arara arara = new Arara();

        System.out.println("Informações do Leão:");
        leao.exibirInformacoes();

        System.out.println("\nInformações da Arara:");
        System.out.println("Classe: " + arara.getClasse());
        System.out.println("Locomoção: " + arara.getLocomocao());
        System.out.println("Quantidade de ovos: " + arara.getQtdeOvos());
    }
}