package book;

import java.util.LinkedList;
import java.util.List;

public class Section implements Element{
    protected String title;
    protected List<Element> elements = new LinkedList<>();

    public Section(String title)
    {
        this.title=title;
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element e:elements)
        {
            e.print();
        }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        element.remove(element);
    }

    @Override
    public Element get(int position) {
        return elements.get(position);
    }
}
