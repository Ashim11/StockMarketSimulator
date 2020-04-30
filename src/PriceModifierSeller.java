
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vurix
 */
public class PriceModifierSeller extends SellerDecorator {
    
    private int numSharesSoldInCurrPhase;
    
    public PriceModifierSeller(Seller seller){
        super(seller);
        numSharesSoldInCurrPhase = 0;
    }
    
    @Override
    public void sell(){
        super.sell();
        numSharesSoldInCurrPhase++;
        if(numSharesSoldInCurrPhase == 0){
            int currSharePrice = this.getSharePrice();
            int doubleSharePrice = currSharePrice * 2;
            super.setSharePrice(doubleSharePrice);
            numSharesSoldInCurrPhase = 0;
        }
        
        
    }
    @Override
    public int getSharePrice(){
        return super.getSharePrice();
    }
    
    @Override
    public int getNumSharesSold(){
        return super.getNumSharesSold();
        
    }
    
    @Override
    public int getCapital(){
        return super.getCapital();
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public void update(Observable o, Object arg){
        super.update(o, arg);
    }
    
}
