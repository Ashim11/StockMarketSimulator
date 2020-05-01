
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
public class Main {
    
        
        //constant to generate parameters of company and investor
        private static final int MIN_SHARE_PRICE = 500;
        private static final int MAX_SHARE_PRICE = 1000;
        private static final int MIN_BUDGET = 1000;
        private static final int MAX_BUDGET = 10000;
        private static final int MIN_NUM_SHARES= 10;
        private static final int MAX_NUM_SHARES= 100;
        
        
        
        public static List<Seller> createCompanies(int howMany){
            List<Seller> companies = new ArrayList<Seller>();
            for(int i=0; i < howMany; i++){
                Seller seller = Factory.createSeller(MIN_NUM_SHARES, MAX_NUM_SHARES, MIN_SHARE_PRICE, MAX_SHARE_PRICE);
                companies.add(seller);
            }
            return companies;
        }
        
        public static List<Investor> createInvestors(int howMany){
            List<Investor> investors = new ArrayList<Investor>();
            for(int i=0; i < howMany; i++){
                Investor investor = Factory.createInvestor(MIN_BUDGET, MAX_BUDGET);
		investors.add(investor);
            }
            return investors;
        }
        
    
    public static void main(String[]args){
        
        

    
    
    
    
    }
    
}
