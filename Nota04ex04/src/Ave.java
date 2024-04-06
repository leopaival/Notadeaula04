
public class Ave extends Animal {
    private int qtdeOvos;

    public Ave(String classe, String locomocao, int qtdeOvos) {
        super(classe, locomocao);
        this.qtdeOvos = qtdeOvos;
    }

    public int getQtdeOvos() {
        return qtdeOvos;
    }
}