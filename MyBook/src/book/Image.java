package book;

import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String imageName;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
