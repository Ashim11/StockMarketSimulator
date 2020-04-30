
import java.util.Observable;
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
// Company class defines a company that sells share.

public class Company implements Seller, Observer{
    
    //unique ID of the company
    private int id;
    
    //number of shares left
    private int numShares;
    
    //current price of share
    private int sharePrice;
    
    //total number of shares sold
    private int numSharesSold;
    
    
    /*
   class constroctor that instantiates a new company with given parameters.
    @param id the unique ID
     @param numShares the initial number of shares 
     @param sharePrice the initial share price 
    */
    public Company(int id, int numShares, int sharePrice){
        
        this.id = id;
        this.numShares = numShares;
        this.sharePrice= sharePrice;
        numSharesSold=0;
    }
    
    //sell a share
    public void sell(){
        numShares--;
        numSharesSold++;
    
    }
    
    //Get the current price of the share.
    //@return the current price of the share 
    public int getSharePrice(){
        return sharePrice;
    }
    
    //set the price of the share.
    //@return sharePrice the new price of the share
    public void setSharePrice(int sharePrice){
        this.sharePrice = sharePrice;
    
    }
    
    //get the number of shares sold by the seller.
    //@return the number of shares sold 
    public int getNumSharesSold(){
        return numSharesSold;
    
    }
    
    //check whether seller has shares left to sell.
    //@return true if seller has shares, otherwise return false 
    public boolean hasShares(){
        return (numShares > 0);
    }
    
    //get the total capital of the seller which is current share price times number of shares sold
    //@return the total capital of seller
    public int getCapital(){
        return (numSharesSold * sharePrice);
    }
    
    
    //get a string representation of the seller.
    //@return a string representing the seller 
    @Override
    public String toString(){
        return "Company-"+id;
    }
    
    //handler for the event when total number of shares sold is 10
    public void update(Observable o, Object arg){
        if(numSharesSold == 0){
            sharePrice -= sharePrice * 0.02;
        }
    }
}
