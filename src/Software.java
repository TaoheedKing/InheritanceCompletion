public class Software extends Product {

    public String programmer(){
        return "Programmer is...";
    }
    public String platform(){
        return "Linux, Mac, or PC...";
    } // linux, mac, or pc
    public String os(){
        return "The operating systems are...";
    }

    @Override
    public boolean equals(double price){
        System.out.println("this is an override from Software");
        return this.price==price;
    }

}