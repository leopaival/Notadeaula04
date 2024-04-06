public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome,int idade, int matricula){
        this.nome=nome;
        this.idade = idade;
        this.matricula=matricula;
    }

    public void exibiraluno(){
        super.exibir();
        System.out.println(matricula);
    }
}
