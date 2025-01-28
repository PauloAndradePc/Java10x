package sobreescrita.exercicio.impressora;

public class impressora {

    private void imprimir(String texto){
        System.out.println("Texto: " + texto);
    }

    private void imprimir(int numero){
        System.out.println("Numero binario: " + Integer.toBinaryString(numero));
    }

    public static void main(String[] args) {
        //Criando o objeto da classe.
        impressora Impressora = new impressora();

        //Chamando os diferentes metodos.
        Impressora.imprimir(42);
        Impressora.imprimir("Ola mundo, tudo bem? ");
    }

}
