/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashim
 */
public class Company {
    
    private int id;
    
    private int numShares;
    
    private int SharesPrice;
    
    private int numSharesSold;
    
    private Company(int id, int numShares, int SharePrice){
        
        this.id = id;
        this.SharesPrice= SharePrice;
        this.numShares = numShares;
        
    
    
    }

    public int getId() {
        return id;
    }

    public int getNumShares() {
        return numShares;
    }

    public int getSharesPrice() {
        return SharesPrice;
    }

    public int getNumSharesSold() {
        return numSharesSold;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }

    public void setSharesPrice(int SharesPrice) {
        this.SharesPrice = SharesPrice;
    }

    public void setNumSharesSold(int numSharesSold) {
        this.numSharesSold = numSharesSold;
    }
    
    
    
}
