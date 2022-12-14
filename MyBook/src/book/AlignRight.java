package book;

public class AlignRight implements AlignStrategy{
    @Override
    public String render(Paragraph paragraph) {
        return paragraph.getText()+"#####";
    }
}
