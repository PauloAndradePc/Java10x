package bookpack;

public class Book { // --> Book e seus membros devem ser public para serem usados por outros pacotes.
    private String title;
    private String author;
    private int pubDate;

    //Agora e publico.
    public Book(String title, String author, int pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    //Agora e publico.
    public void Show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }


}