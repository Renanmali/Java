//Criando uma classe do tipo aluno para a matéria de programação orientada a objetos//
package Poo;

public class Aluno {
    //Definindo quais serão os atributos que a classe aluno receberá//
    private String nome;
    private int matricula;
    private float cr;

    public String getNome() {
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public float setCr(){
        return cr;
    }

    public Aluno(){}

    public Aluno(String nome, int matricula, float cr){
        this.nome = nome;
        this.matricula = matricula;
        this.cr = cr;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public float getCr(){
        return cr;
    }
    
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", cr=" + cr + '}';
    }

    public static void main(String[] args){
        Aluno r1 = new Aluno();
        r1.nome = "renan";
        System.out.println(r1.nome);
    }
}
