// day 15 - interfaces
// interface is like a contract
// any class that implements it must define all its methods
// interface has no body for methods
// a class can implement multiple interfaces

interface Printable {
    void print(); // no body
}

interface Showable {
    void show(); // no body
}

// implementing one interface
class Document implements Printable {

    String content;

    Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("printing: " + content);
    }
}

// implementing multiple interfaces
class Photo implements Printable, Showable {

    String name;

    Photo(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("printing photo: " + name);
    }

    @Override
    public void show() {
        System.out.println("showing photo: " + name);
    }
}

public class Printable {
    public static void main(String[] args) {
        Document doc = new Document("my resume");
        doc.print();

        System.out.println();

        Photo p = new Photo("vacation.jpg");
        p.print();
        p.show();
    }
}
