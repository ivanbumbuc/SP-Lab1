package book;

public class Image implements Element{
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print()
    {
        System.out.println("Image with name: "+imageName);
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
}
