class book{
private String title;
private String author;
private String publisher;
private String isbn;
private int year;
private double price;
private int quantity;

public void book(){
    //constructor
}

public String getTitle(){
    return this.title;
}

public void setTitle(String title){
    this.title = title;

}

public String getAuthor(){
    return this.author;
}

public void setAuthor(String author){
    this.author = author;
}
public String getPublisher(){
    return this.publisher;
}

public void setPublisher(String publisher){
    this.publisher = publisher;
}

public String getIsbn(){
    return this.isbn;
}

public void setIsbn(String isbn){
    this.isbn = isbn;
}

public int getYear(){
    return this.year;
}

public void setYear(int year){
    this.year = year;
}
public double getPrice(){
    return this.price;
}

public void setPrice(double price){
    this.price = price;
}
public int getQuantity(){
    return this.quantity;
}

public void setQuantity(int quantity){
    this.quantity= quantity;
}
        public void increaseQuantity(){
            quantity = quantity + 10;
            System.out.println(quantity);
        }
         public void decreaseQuantity(){
            quantity = quantity -20;
            System.out.println(quantity);
        }
         public void getInventaryValue(){
            double value = (price * quantity);
            System.out.println(value);
        }


}

class bookInventary{
    public static void main(String args[]){
        book b = new book();
        b.setTitle("Atomic Habit");
        b.setAuthor("XYZ");
        b.setPublisher("ABC");
        b.setIsbn("PQR");
        b.setYear(2020);
        b.setPrice(499.21);
        b.setQuantity(500);

        String title = b.getTitle();
        String author = b.getAuthor();
        String publisher= b.getPublisher();
        String isbn = b.getIsbn();
        int year = b.getYear();
        double price = b.getPrice();
        int quantity = b.getQuantity();

        System.out.println(title);
        System.out.println(author);
        System.out.println(publisher);
        System.out.println(isbn);
        System.out.println(year);
        System.out.println(price);
        System.out.println(quantity);
    



         

    }
}
