public class Book {
    private String name;
    private Author author;
    private int price;
    private int qty;

    public Book(String name, Author author, int price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
void  getInfo(){
    System.out.println("Name a book: "+getName()+"\nPrice: "+getPrice()+"\nQty: "+getQty());
}

    @Override
    public String toString() {
        return "Book\n" +
                "name: " + name +
                " \nauthor: " + author +
                " \nprice: " + price +
                " \nqty: " + qty ;
    }
}
