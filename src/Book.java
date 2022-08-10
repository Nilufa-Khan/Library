public class Book {
    String title;
    String authorName;
    long isbNumber;
    int publishingYear;

    public static void main(String[] args) {
        Book obj = new Book();
        System.out.println("Default = "+obj.authorName);
        System.out.println("Default = "+obj.title);
        System.out.println("Default = "+obj.publishingYear);
        System.out.println("Default = "+obj.isbNumber);
        obj.authorName = "Rabindra Nath Tagore";
        obj.isbNumber = 156763788432L;
        obj.title = "Gora";
        obj.publishingYear = 2002;
        System.out.println("After changes = "+obj.authorName);
        System.out.println("After changes = "+obj.title);
        System.out.println("After changes = "+obj.publishingYear);
        System.out.println("After changes = "+obj.isbNumber);

    }
}
