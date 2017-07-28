package invoice;

public class Product {
	
	// Initiate private variable name and price 
	private String name; 
	private String description;
	private double price; 
	

    public void setName(String name){
    	this.name=name;
    }
    
    public String getName(){
    	return name;
    	
    }
    
    
    public void setDescription(String description){
    	this.description = description;
    }
    
    public String getDescription(){
    	return description;
    	
    }
    
    
    public void setPrice(double price){
    	this.price=price;
    	
    }
    
    public double getPrice(){
    	return price;
    	
    }
	


}

