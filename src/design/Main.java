package design;

public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("소설책"));
        bookShelf.appendBook(new Book("과학책"));
        bookShelf.appendBook(new Book("철학책"));
        bookShelf.appendBook(new Book("기술책"));
//        bookShelf.appendBook(new Book("외모췍"));

        Iterator<Book> it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

        System.out.println();

    }
}
