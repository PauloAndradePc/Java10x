package sobrecarga_sobreescrita_polimorfismo;

import javax.swing.plaf.IconUIResource;

public class Veiculo {

    private String nome;
    private String modelo;
    private int ano;

    public Veiculo() {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Sobrecarregar
    public void exibirInformacoes(){
        System.out.println(nome);
        System.out.println(modelo);
        System.out.println(ano);
    }
}
