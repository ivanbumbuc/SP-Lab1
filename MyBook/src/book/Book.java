package book;

import java.util.LinkedList;
import java.util.List;

public class Book extends Section{
    private List<Author> authors = new LinkedList<>();


    public Book(String title)
    {
        super(title);
    }

    public void addAuthor(Author author)
    {
        authors.add(author);
    }


    public void addContent(Element element) {
        super.add(element);
    }
    @Override
    public void print()
    {
        System.out.println("Book: " +title+"\n");
        System.out.println("Authors: ");
        for(Author a:authors)
        {
            a.print();
        }
        System.out.println();
        super.print();
    }
}
