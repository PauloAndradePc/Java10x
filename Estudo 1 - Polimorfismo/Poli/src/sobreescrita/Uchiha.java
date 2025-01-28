package sobreescrita;

public class Uchiha extends Ninja {

    //Todas vez que quiser trabalhar com polimorfismo e querermos sobreescrever , devemos usar o @Override
    // Devemos usar algo que se chama (anotation)
    //Devemos pegar a classe que queremos sobreescrever a classe.


    // Devemos usar da seguinte forma:
    @Override
    public void ataqueEspecial(){
        System.out.println(" O meu nome e " + nome + "esse e meu ataque Uchiha, um ataque de fogo");
    }
    //Devemos usar o metodo (@Override) todas as vezes que quisermos sobreescrever algum metodo.

}
