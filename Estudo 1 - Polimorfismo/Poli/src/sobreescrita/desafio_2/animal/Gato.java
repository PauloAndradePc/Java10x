package sobreescrita.desafio_2.animal;

public class Gato extends Animal{

    @Override
    public void fazerSom() {
        super.fazerSom(); //Usando o super o que estiver escrito no metodo 'fazerSom' sera usado tambem na nossa Sobreescrita.
        System.out.println(" O gato mia! ");
    }
}
