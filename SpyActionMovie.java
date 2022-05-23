public class SpyActionMovie extends Movie {
    double ticket_price;
    SpyActionMovie(double ticket_price, String title,String name_of_Director){
        super(title, name_of_Director) ;
        this.ticket_price = ticket_price;
    }

    public String toString(){
        return super.toString() +"  price ="+ this.ticket_price;
    }

}
