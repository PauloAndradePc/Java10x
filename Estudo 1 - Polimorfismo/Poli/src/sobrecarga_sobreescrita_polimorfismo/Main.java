package sobrecarga_sobreescrita_polimorfismo;

public class Main {
    public static void main(String[] args) {

        Carro1 carro1 = new Carro1();
        carro1.setNome("Fiat mobi");
        carro1.setModelo("Esportivo");
        carro1.setAno(2003);
        carro1.setCor("cinza e preto");
        carro1.setPassageiros("Cabem 4 passageiros");

        carro1.exibirInformacoes();
    }
}
