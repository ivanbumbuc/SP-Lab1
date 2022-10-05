package book;

import java.util.LinkedList;

public class Book {
    private String title;
    private LinkedList<String> paragraphs;
    private LinkedList<String> images;
    private LinkedList<String> tables;

    public Book(String title)
    {
        this.title=title;
        paragraphs=new LinkedList<>();
        images=new LinkedList<>();
        tables=new LinkedList<>();
    }

    public void createNewParagraph(String paragraph)
    {
        this.paragraphs.add(paragraph);
    }
    public void createNewImage(String paragraph)
    {
        this.images.add(paragraph);
    }
    public void createNewTable(String paragraph)
    {
        this.tables.add(paragraph);
    }

    public void print()
    {
        System.out.println("Title: "+this.title);
        System.out.println("Paragraphs:");
        for(String x:paragraphs)
        {
            System.out.println(x);
        }
        System.out.println("Images:");
        for(String x:images)
        {
            System.out.println(x);
        }
        System.out.println("Tables: ");
        for(String x:tables)
        {
            System.out.println(x);
        }
    }
}
