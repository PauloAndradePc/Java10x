package Polimorfismo.desafio_1;

public class NinjaAvancado implements Ninjas {

    String nome, especialidade, habilidade;
    int idade;

    public NinjaAvancado(String nome, String especialidade, String habilidade, int idade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void executarHabilidade() {
        System.out.println(" Ninja avançado ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    public void mostrarInformacoes(){

        System.out.println(" Nome " + nome + " esta executando avançada " + habilidade + ", com especialidade em: " + especialidade + "!");
    }
}
