/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashim
 */
public abstract class SellerDecorator {
    
    private Seller seller;
    
    public SellerDecorator(Seller seller){
        this.seller = seller;
    }
    
    public void sell(){
        seller.sell();
    }
    
    public int getSharePrice(){
        return seller.getSharePrice();
    }
    
    public void setSharePrice(int sharePrice){
        seller.setSharePrice(sharePrice);
    }
    
    public boolean hasShares(){
        return seller.hasShares();
    }
    
    public int getNumSharesSold(){
        return seller.getNumSharesSold();
    }
    
    public int getCapital(){
        return seller.getCapital();
    }
    
    public String toString(){
        return seller.toString();
    }
    
   
    
}
