
import java.util.ArrayList;
import java.util.List;
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

/*
The main driver class that generates 100 companies and 100 investor and run 
the trading day simulation.
*/

public class Main {
    
        
        //constant to generate parameters of company and investor
        private static final int MIN_SHARE_PRICE = 500;
        private static final int MAX_SHARE_PRICE = 1000;
        private static final int MIN_BUDGET = 1000;
        private static final int MAX_BUDGET = 10000;
        private static final int MIN_NUM_SHARES= 10;
        private static final int MAX_NUM_SHARES= 100;
        
        
        /*
        Generates a list of companies with random number of shares and price 
        
        @param howMany how many companies to be generates
        @return the list of generated seller
        */
        public static List<Seller> createCompanies(int howMany){
            List<Seller> companies = new ArrayList<Seller>();
            for(int i=0; i < howMany; i++){
                Seller seller = Factory.createSeller(MIN_NUM_SHARES, MAX_NUM_SHARES, MIN_SHARE_PRICE, MAX_SHARE_PRICE);
                companies.add(seller);
            }
            return companies;
        }
        
        /*
        Generate a list of investor with random value of budget.
        
        @param howMany how many investors to be generated
        @return the list of generated investors
        */
        public static List<Investor> createInvestors(int howMany){
            List<Investor> investors = new ArrayList<Investor>();
            for(int i=0; i < howMany; i++){
                Investor investor = Factory.createInvestor(MIN_BUDGET, MAX_BUDGET);
		investors.add(investor);
            }
            return investors;
        }
        
    
    public static void main(String[]args){
        
        //generate 100 sellers
        List<Seller> companies = createCompanies(100);
        System.out.println("Generated 100 companies with random number of shares and price.");
        
        //generate 100 investors 
        List<Investor> investors = createInvestors(100);
        System.out.println("Generated 100 investors with random budget.");
        
        //run the trading day
        System.out.println("Running simulation for a trading day...please wait");
        Trading trading = new Trading(companies, investors);
        trading.run();
    
    
    
    
    }
    
}
