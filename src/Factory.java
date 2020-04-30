
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashim
 */

//This class generate company and seller with random parameters values

public class Factory {
    
    static Random rand = new Random();
    
    Static int nextSellerID = 1;
    Static int nextInvestorID = 2;
    
    /*
    Generate a company with number of shares and shares orice from given
    range.
    
    @param minNumShares the min number of shares
    @param maxNumShares the maximum number of shares 
    @param minShare the min share price 
    @param maxSharePrice the max share price 
    @return a Company with number of shares and price in given range.
    */
    public static Seller createSeller(int minNumShares, int maxNumShares, int minSharePrice, int maxSharePrice){
        int numShares = minNumShares + rand.nextInt(maxNumShares - minNumShares) + 1;
	int sharePrice  = minSharePrice + rand.nextInt(maxSharePrice - minSharePrice) + 1;
	Company c = new Company(nextSellerID, numShares, sharePrice);
        Seller seller = null;
       return seller;
       
    }
    
    /*
    Generate a investor with random budget.
    
    @param minBudget the min budget
    @param maxBudget the max budget
    @return a Investor with random budget in given range.
    
    */
    public static Investor createInvestor(int minBudget, int maxBudget ){
        int budget = minBudget + rand.nextInt(maxBudget - minBudget) + 1;
	Investor investor = new Investor(nextInvestorID, budget);
	nextInvestorID++;
        return investor;
    }
    
    
}
