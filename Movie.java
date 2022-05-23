public class Movie {
    String title;
    String name_of_Director;
    Movie(String title,String name_of_Director){
  this.title =title;
  this.name_of_Director = name_of_Director;
    }

    public String toString(){
        return this.title +" "+ this.name_of_Director ;
    }

}
