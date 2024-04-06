public class Leao extends Mamifero {
    public Leao(String pelo) {
        super("Mamífero", "Patas", pelo);
    }

    public void exibirInformacoes() {
        System.out.println("Classe: " + getClasse());
        System.out.println("Locomoção: " + getLocomocao());
        System.out.println("Tipo de Pelo: " + getPelo());
    }
}