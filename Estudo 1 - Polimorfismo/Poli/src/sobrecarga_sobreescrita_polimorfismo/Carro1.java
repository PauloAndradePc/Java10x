package sobrecarga_sobreescrita_polimorfismo;

public class Carro1 extends Veiculo {

    private String cor;
    private String passageiros;

    public Carro1() {
        this.cor = cor;
        this.passageiros = passageiros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(String passageiros) {
        this.passageiros = passageiros;
    }

    //Sobreescrever
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); //Usado para que eu possa usar as informações da classe principais.

        System.out.println("Nome " + getNome() + ", Modelo: " + getModelo() + ", ano de lançamento: " + getAno() + ", Cor: " + getCor() + ", quantos passageiros cabem? " + getPassageiros());

    }
}
