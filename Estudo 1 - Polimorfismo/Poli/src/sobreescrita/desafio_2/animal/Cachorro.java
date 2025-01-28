package sobreescrita.desafio_2.animal;

public class Cachorro extends Animal{



    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println(" O cachorro late: Au Au! ");
    }

}
