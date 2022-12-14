package book;

public class TableOfContente implements Element{
    private Book book;

    public TableOfContente(Book book) {
        this.book = book;
    }
    @Override
    public void print(){
        System.out.println("Table of Contente");
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
        visitor.visitTableOfContents(this);
    }
}
