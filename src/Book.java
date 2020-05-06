public class Book extends Product {

    public String author(){
        return "Author name is...";
    }
    public int pages(){
        return 300;
    }


    @Override
    public boolean equals(double price){
        System.out.println("this is an override from Book");
        return this.price==price;
    }



}