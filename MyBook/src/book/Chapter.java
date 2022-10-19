package book;

import java.util.LinkedList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters=new LinkedList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String name)
    {
        SubChapter subChapter=new SubChapter(name);
        subChapters.add(subChapter);
        return subChapters.size()-1;
    }
    public SubChapter getSubChapter(int index)
    {
        return subChapters.get(index);
    }

    public void print(){
        System.out.println("Chapter Name: "+name);
    }
}
