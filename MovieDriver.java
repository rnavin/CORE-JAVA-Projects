import java.util.ArrayList;
import java.util.List;

public class MovieDriver {
    public static void main(String[] args){
        List finalResult = new ArrayList();
        finalResult.add(new ActionMovie(120,"title = Action","Director = Test"));
        finalResult.add(new ComdeyMovie(120,"title = Comedy","Director = Test"));
        finalResult.add(new SpyActionMovie(120,"title = SpyAction","Director = Test"));
        System.out.println(finalResult);
    }
}
