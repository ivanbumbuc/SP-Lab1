package book;

public class Paragraph implements Element{
    private String text;
    private AlignStrategy alignStrategy ;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print()
    {
        if(alignStrategy==null)
            System.out.println("Paragraph: "+text);
        else
            System.out.println("Paragraph: "+alignStrategy.render(this));
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    public void setAlignStrategy(AlignStrategy alignStrategy)
    {
        this.alignStrategy=alignStrategy;
    }

    @Override
    public Element get(int position) {
        return null;
    }

    public String getText()
    {
        return text;
    }
}
