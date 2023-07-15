 class Magazine extends LibraryItem { 
    private String issueDate; 
    private String publisher; 
  
    public Magazine(String title, String itemID, String issueDate, String publisher) { 
        super(title, itemID); 
        this.issueDate = issueDate; 
        this.publisher = publisher; 
    } 
  
    public void displayItemDetails() { 
        System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Publisher: " + publisher);
    }
    
    // Getters
    public String getIssueDate() {
        return issueDate;
    }

    public String getPublisher() {
        return publisher;
    }

    // Setters
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
