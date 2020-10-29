public class Book {
    public int id, year, numOfPages, price;
    public String name, author, publisher;

    public void setID(int ID) { id = ID; }
    public void setYear(int Year) { year = Year; }
    public void setNumOfPages(int NumOfPages) { numOfPages = NumOfPages; }
    public void setPrice(int Price) { price = Price; }
    public void setName(String Name) { name = Name; }
    public void setAuhor(String Author) { author = Author; }
    public void setPublisher(String Publisher) { publisher = Publisher; }

    public int getID() { return id; }
    public int getYear() { return year; }
    public int getNumOfPages() { return numOfPages; }
    public int getPrice() { return price; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }

    public String toString() {
        return "ID: " + this.id + "\nName: " + this.name + "\nAuthor: " + this.author +
                "\nPublisher: " + this.publisher + "\nYear: " + this.year + "\nNumber of pages: "
                + this.numOfPages + "\nPrice: " + this.price + "\n";
    }
}