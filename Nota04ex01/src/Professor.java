public class Professor extends Pessoa{
    private double salario;

    public Professor(String nome, int idade, double salario){
        this.nome=nome;
        this.idade=idade;
        this.salario=salario;
    }


    public void exibirprofessor() {
        super.exibir();
        System.out.println(salario);
    }
}
