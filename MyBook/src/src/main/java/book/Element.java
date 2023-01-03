package book;

public interface Element{
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int position);
    void accept(Visitor visitor);

    String getData();
}
