public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Boné", 49.99, "Boné vermelho");
        Produto p2 = new Produto("Tenis", 99.99, "Tenis Nike");

        System.out.println("Produto 1:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: R$" + p1.getPreco());
        System.out.println("Descrição: " + p1.getDescricao());

        System.out.println("\nProduto 2:");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Preço: R$" + p2.getPreco());
        System.out.println("Descrição: " + p2.getDescricao());
    }
}