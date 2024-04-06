public class Mamifero extends Animal {
    private String pelo;

    public Mamifero(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }

    public String getPelo() {
        return pelo;
    }
}