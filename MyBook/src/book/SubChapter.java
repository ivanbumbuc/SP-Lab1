package book;

import java.util.LinkedList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements=new LinkedList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String name)
    {
        Element paragraph=new Paragraph(name);
        this.elements.add(paragraph);
    }
    public void createNewImage(String name)
    {
        Element image=new Image(name);
        this.elements.add(image);
    }
    public void createNewTable(String name)
    {
        Element table=new Table(name);
        this.elements.add(table);
    }
    public void print()
    {
        System.out.println("SubChapter:  "+name);
        for(Element x:elements)
        {
            x.print();
        }
    }
}
