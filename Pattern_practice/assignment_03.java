package Pattern_practice;

class author{
    String name,eMail;
    char gender;
    author (String name,String eMail,char gender){
        this.name=name;this.gender=gender;this.eMail=eMail;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString(){
        return "Author [NAME:"+name+" EMAIL :"+ eMail+"GENDER "+gender+"]";
    }
}
class Book {
    private String name;int qtyInStock;double price; author Author;
    Book(String name,int qtyInStock,double price, author Author){
        this.name=name;this.Author=Author;this.qtyInStock=qtyInStock;this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public author getAuthor() {
        return Author;
    }

    public void setAuthor(author author) {
        Author = author;
    }
    public String toString(){
        return "BOOK NAME:"+name+" AUTHOR"+Author+"PRICE:"+price +" QUANTITY:"+qtyInStock;
    }
}
public class assignment_03 {
    public static void main(String[] args) {
        System.out.println("There are different books from different authors");
        author author=new author("J K ROWLING","bdvbj@gmail.com",'M');
        Book b=new Book("HARRY POTTER",299,45,author);
        System.out.println(b);
    }
}
