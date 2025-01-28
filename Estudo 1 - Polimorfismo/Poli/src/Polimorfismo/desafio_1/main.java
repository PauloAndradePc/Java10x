package Polimorfismo.desafio_1;

public class  main {
    public static void main(String[] args) {

        NinjaBasico Naruto= new NinjaBasico("Naruto Uzumaki", 17, "Razengan");
        TipoHabilidade Razengan = TipoHabilidade.Ninjutsu;
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
        System.out.println("A habilidade é do tipo: " + Razengan);
        System.out.println();
        NinjaAvancado Sasuke=new NinjaAvancado("Sasuke Uchiha", "Jutsu Bola de Fogo", "fogo", 18);
        Sasuke.mostrarInformacoes();
        Sasuke.executarHabilidade();
        TipoHabilidade BoladeFogo = TipoHabilidade.Ninjutsu;
        System.out.println("A habilidade é do tipo: " + BoladeFogo);
    }
}
