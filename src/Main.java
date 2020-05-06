public class Main {
    public static void main(String[] args) {

        Product p = new Product();
        System.out.println(p.toString());
        p.setPrice(7.00);
        System.out.println("product's equal method result: "+p.equals(8.00));


        Book b = new Book();
        System.out.println(b.author());
        System.out.println("There are " + b.pages() + " pages");
        b.setPrice(9.99);
        System.out.println("equals or not: "+ b.equals(9.99));

        System.out.println();

        Software s = new Software();
        System.out.println(s.programmer());
        System.out.println(s.os());
        System.out.println(s.platform());

        s.setPrice(9.32);
        System.out.println("equals or not: " + s.equals(10.99));
    }
}
