public class Main {
    public static void main(String[] args) {

        Product p = new Product();
        System.out.println(p.toString());

        Book b = new Book();
        System.out.println(b.author());
        System.out.println("There are " + b.pages() + " pages");

        System.out.println();

        Software s = new Software();
        System.out.println(s.programmer());
        System.out.println(s.os());
        System.out.println(s.platform());
    }
}
