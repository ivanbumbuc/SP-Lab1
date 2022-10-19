package book;

import java.util.LinkedList;
import java.util.List;

public class Book {
    private String title;
    private TableOfContente tableOfContente;
    private List<Author> authors = new LinkedList<>();
    private List<Chapter> chapters = new LinkedList<>();


    public Book(String title)
    {
        this.title=title;
    }

    public void addAuthor(Author author)
    {
        authors.add(author);
    }

    public int createChapter(String name)
    {
        Chapter chapter=new Chapter(name);
        chapters.add(chapter);
        return chapters.size()-1;
    }

    public Chapter getChapter(int index)
    {
        return chapters.get(index);
    }
}
