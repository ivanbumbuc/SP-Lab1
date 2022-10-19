package book;

import java.util.LinkedList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> images=new LinkedList<>();
    private List<Paragraph> paragraphs = new LinkedList<>();
    private List<Table> tables = new LinkedList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String name)
    {
        Paragraph paragraph=new Paragraph(name);
        this.paragraphs.add(paragraph);
    }
    public void createNewImage(String name)
    {
        Image image=new Image(name);
        this.images.add(image);
    }
    public void createNewTable(String name)
    {
        Table table=new Table(name);
        this.tables.add(table);
    }
    public void print()
    {
        System.out.println("SubChapter:  "+name);
        for(Paragraph x:paragraphs)
        {
            x.print();
        }
        for(Image x:images)
        {
            x.print();
        }
        for(Table x:tables)
        {
            x.print();
        }
    }
}
