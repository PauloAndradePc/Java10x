package sobrecarga.Exercicio.calculadora;

public class Calculadora {

    public Calculadora() {
    }

    //Metodo que calcula soma de dois numeros;
    private int soma(int a, int b){
        return a + b;
    }

    //Metodo que calcula três numeros.
    private int soma(int a, int b, int c){
        return a + b + c;
    }

    //Metodo que calcula dois numeros (double)
    private double somaDouble(double a, double b){
        return a + b;
    }

    //Metodo que calcula três numeros (double)
    private double somaDoouble(double a, double b, double c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.soma(3,9);
        System.out.println("Resultado da primeira soma dos numeros inteiros e: " + resultado1);

        int resultado2 = calculadora.soma(3, 8, 7);
        System.out.println("Resultado da soma dos três numeros inteiros e: " + resultado2);

        double resultado3 = calculadora.somaDouble(3.0, 7.8);
        System.out.println("Resultado da soma de dois doubles " + resultado3);

        double resultado4 = calculadora.somaDoouble(44.0, 43.9, 88.0);
        System.out.println("Resultado da soma de dois doubles " + resultado4);

    }

    /*
     Neste exercicio fizemos a sobrecarga dos metodos, utilizamos o poliformismo, criamos uma classe chamada 'Calculadora',
     e dentro dessa classe criamos um metodo chamado 'soma', dentro dele adicionamos 'assinatura' de números (inteiros).
      Fizemos a sobrecarga dos metodos, aonde criamos outros metodos om o mesmo nome, e modificamos a assinatura do metodo.
    */
}
