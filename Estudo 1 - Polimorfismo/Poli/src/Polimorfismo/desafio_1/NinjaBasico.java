package Polimorfismo.desafio_1;

public class NinjaBasico implements Ninjas {
    private String nome;
    private int idade;
    private String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {

        System.out.println("Ninja Basico");
        System.out.println(" Nome " + nome);
        System.out.println(" Idade " + idade);
        System.out.println(" Habilidade " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " esta executando a habilidade basica " + habilidade);
    }
}
