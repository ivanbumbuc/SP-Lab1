package book;

public class AlignCenter implements AlignStrategy {

    @Override
    public String render(Paragraph paragraph) {
        return "#####"+paragraph.getText()+"#####";
    }
}
