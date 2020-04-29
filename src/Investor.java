

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashim
 */

//This class implements the investor for the trading simulation.

public class Investor {
    
    //unique ID
    private int id;
    
    //current budget
    private int budget;
    
    //number of shares purchased 
    private int numSharesPurchased;
    
    /*
    class constructor that instantiates a new Investor object
    with given parameters
    
    @param id the unique ID
    @param budget the initial budget
    
    */
    public Investor(int id, int budget){
        this.id = id;
        this.budget=budget;
        
    }
    
    /*
    Buy a share from seller
    @param share the given seller
    
    */
   public void buy(Seller share){
       budget -= share.getSharePrice();
       numSharesPurchased++;
       
   
   } 
   
   /*
   Get the unique ID of the investor
   @return the unique ID
   */
    public int getId() {
         return id;
    }

   /*
    Get total number of shares purchased 
    @return total number of shares purchased
    */
    public int getNumSharesPurchased() {
        return numSharesPurchased;
    }

   /*
    check whether there is budget left.
    
    @param the shares price 
    @return true if there is budget for the shares price, else return 0
    */
    public boolean hasBudget(int sharePrice){
        return budget >= sharePrice;
    }
    
    /*
    Get a string representation of the investor.
    
    @return A string representation the investor.
    */
    @Override
    public String toString(){
    return "Investor-"+id;
    }
        
}
