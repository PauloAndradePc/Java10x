package sobreescrita.desafio_2.animal;

public class Main {
    public static void main(String[] args) {
        Animal c = new Cachorro();
        c.setNome("Maya");
        c.setIdade(8);
        System.out.println(c.getNome() + " tem " + c.getIdade() + " anos ");
        c.fazerSom();

        Animal gato = new Gato();
        gato.setNome("Bond ");
        gato.setIdade(3);
        System.out.println();
        gato.fazerSom();
    }
}
