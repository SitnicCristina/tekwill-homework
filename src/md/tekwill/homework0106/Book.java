package md.tekwill.homework0106;

public class Book extends Author{
    String name;
    Author author;
    double price;
    int qty = 0;

    public Book(String name, Author author, double price){
        super();
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){
        super();
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author author) {
        super();
        this.name = name;
        this.author = author;
    }

    public String getName() { return name;   }
    public Author getAuthor() { return author;  }
    public double getPrice() { return price; }
    public int getQty() { return qty; }

    public void setPrice(double price) { this.price = price; }
    public void setQty(int qty) { this.qty = qty; }


    @Override
    public String toString(){
        return "Book [name=" +name+ ",Author="+ author + ",price=" + price +",qty="+ qty+ "]";
    }
}
