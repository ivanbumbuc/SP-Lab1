package book;

public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print()
    {
        System.out.println("Table with Title: "+title);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int position) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
