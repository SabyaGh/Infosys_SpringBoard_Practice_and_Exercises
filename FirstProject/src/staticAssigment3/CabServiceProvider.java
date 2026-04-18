package staticAssigment3;

public class CabServiceProvider {
	 	private String cabServiceName;
	    private int totalCabs;
	    
	    public CabServiceProvider(String cabServiceName,int totalCabs){
	        this.cabServiceName = cabServiceName;
	        this.totalCabs = totalCabs;
	    }
	    
	    public double calculateRewardPrice(Driver driver){
	        double Bonus = 0;
	        float rating = driver.getAverageRating();
	        if(cabServiceName.equals("Halo")){
	           if(rating >=4.5 && rating <=5) {
	        	   Bonus =10*rating;
	           }
	           else if(rating>=4&&rating<4.5) {
	        	   	Bonus = 5*rating;
	           }
	           else if(rating<4) {
	        	   Bonus= 0;
	           }
	        }
	        else if(cabServiceName.equals("Aber")) {
	        	if(rating >=4.5 && rating<=5) {
	        		Bonus = 8*rating;
	        	}
	        	else if(rating>=4&&rating <4.5) {
	        		Bonus = 3*rating;
	        	}
	        	else if(rating<4) {
	        		Bonus =  0;
	        	}
	        }
	        else {
	        	Bonus = 0;
	        }
	        return Math.round(Bonus*100.0)/100.0;
	    }
	    public String getCabServiceName(){
	        return cabServiceName;
	    }
	    public void setCabServiceName(String cabServiceName){
	        this.cabServiceName = cabServiceName;
	    }
	    
	    public int getTotalCabs(){
	        return totalCabs;
	    }
	    public void setTotalCabs(int totalCabs){
	        this.totalCabs = totalCabs;
	    }

}
