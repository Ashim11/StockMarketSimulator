
import java.util.List;

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
This class wil implements the trading day between a list of companies and 
investor and after trading simlulation is complete shows report to user with choice. 

*/
public class Trading {
    
    //list of input companies for the simulation
    private List<Seller> companies;
    
    //list of input investors for the simulation
    private List<Investor> investors;
    
    //total number of shares sold by any company in current phase
    private int totalSharesSoldInCurrPhase;
    
    //computed seller with highest capital
    private Seller highestCapitalCompany;
    
    //computed seller with lowest capital
    private Seller lowestCapitalCompany;
    
    //computed investor with highest number of shares purchased 
    private Investor highestSharesPurchasedInvestor;
    
    //computed investor with lowest number of shares purchased 
    private Investor lowestSharesPurchasedInvestor;
    
    
    
    
    
}
