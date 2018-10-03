import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> collectionOfBlogs = new ArrayList<>();

    void add(String title, String authorName, String publicationDate, String text){
        new BlogPost(title, authorName, publicationDate, text);
    }

    void delete(int index){
        collectionOfBlogs.remove(index);
    }

//    void update (int index, String title, String authorName, String publicationDate, String text){
//        collectionOfBlogs.add(index,new BlogPost(title, authorName, publicationDate, text));
//    }

    void update (int index, BlogPost blogPost){
        collectionOfBlogs.add(index, blogPost);
    }


}
