package otherpack;  // Pacote do arquivo Main.java

import bookpack.Book;  // Importação da classe Book

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Book
        Book myBook = new Book("Java Programming", "John Doe", 2022);

        // Chamando o método Show() da classe Book
        myBook.Show();
    }
}
