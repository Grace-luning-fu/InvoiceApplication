package invoice;

public class Product {
	
	// Initiate private variable name and price 
	private String name; 
	private String description;
	private double price; 
	
    //setter and getter method for name
    public void setName(String name){
    	this.name=name;
    }
    
    public String getName(){
    	return name;
    	
    }
    
    //setter and getter method for description
    public void setDescription(String description){
    	this.description = description;
    }
    
    public String getDescription(){
    	return description;
    	
    }
    
    //setter and getter method for price
    public void setPrice(double price){
    	this.price=price;
    	
    }
    
    public double getPrice(){
    	return price;
    	
    }
	


}

