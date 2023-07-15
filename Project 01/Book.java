class Book extends LibraryItem { 
    private String author; 
    private int numPages; 
  
    public Book(String title, String itemID, String author, int numPages) { 
        super(title, itemID); 
        this.author = author; 
        this.numPages = numPages; 
    } 
  
    public void displayItemDetails() { 
	System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
    }
    
    // Getters
    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}


