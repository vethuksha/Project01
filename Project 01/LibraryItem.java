abstract class LibraryItem { 
     private String title; 
     private String itemID; 
     private boolean checkedOut; 
  
 public LibraryItem(String title, String itemID) { 
         this.title = title; 
         this.itemID = itemID; 
         this.checkedOut = false; 
    } 
  
     public void checkOut() { 
         if (!checkedOut) { 
         checkedOut = true; 
         System.out.println(title + " has been checked out."); 
         } 
		 else 
		{ 
             System.out.println(title + " is already checked out."); 
        } 
    } 
  
    public void checkIn() { 
       if (checkedOut) { 
       checkedOut = false; 
       System.out.println(title + " has been checked in."); 
        } 
		else 
		{ 
             System.out.println(title + " is already checked in."); 
        } 
    } 
	
	public abstract void displayItemDetails();
	
	public String getTitle(){
		return title;
	}
	public String getItemID(){
		return itemID;
	}
	public boolean isCheckedOut(){
		return checkedOut;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	public void setItemID(String itemID){
		this.itemID=itemID;
	}
	public void setCheckedOut(boolean checkedOut){
		this.checkedOut=checkedOut;
	}
 }
  
   


  

  
 
