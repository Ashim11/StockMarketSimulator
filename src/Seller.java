
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashim
 */

//This inteface defines a company that sell shares.

public interface Seller extends Observer {
    
    /*
    sell a single copy of the share at current price
    */
    public void sell();
    
    /*
    Get the current price of the shares.
    @return the current price of the share
    */
    public int getSharePrice();
    
    /*
    Update the current price of the share.
    @param sharePrice the new share price
    */
    public void setSharePrice(int sharePrice);
    
    /*
    Check whetther seller has shares left to sell.
    @return true of seller has shares, otherwise return false
    */
    public boolean hasShares();
    
    /*
    Get the number shares sold by the seller
    
    @return the number of shares sold
    */
    public int getNumSharesSold();
    
    /*
    Get the toatl capital of seller which is current share price times 
    number of shares sold.
    
    @return the total capital of seller
    */
    public int getCapital();
    
    /*
    Get a string representation of the seller.
   
    @return A string representation the seller.
    */
    public String toString();
    
    
    
}
