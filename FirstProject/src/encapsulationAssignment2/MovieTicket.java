package encapsulationAssignment2;

class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;
    
    
    public MovieTicket(int movieId,int noOfSeats){
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }
    //Getter and Setter for MovieId
    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId = movieId;
    }
    //Getter and Setter for Number Of Seats
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }
    //Getter and Setter for Cost Per Ticket
    public double getCostPerTicket(){
        return costPerTicket;
    }
    public void setCostPerTicket(double costPerTicket){
            this.costPerTicket = costPerTicket;
    }
    
    public double calculateTotalAmount(){
        if(movieId == 111){
            setCostPerTicket(7.0);
        }
        else if(movieId == 112){
            setCostPerTicket(8.0);
        }
        else if(movieId == 113){
            setCostPerTicket(8.5);
        }
        else
            setCostPerTicket(0);
        
        double amount = noOfSeats*getCostPerTicket();
        return Math.round(amount);
    }
}


