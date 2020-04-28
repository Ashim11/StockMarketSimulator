
import java.util.ArrayList;
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
public class Simulator {
        List<Company> companies = new ArrayList<>();
	List<Investor> investors = new ArrayList<>();
	List<Investor> creditNotEnoughInvestors = new ArrayList<>();
    
        /*Creating Investor object*/
        Investor inv = new Investor.InvestorBuilder().setId("TEST").setBudjet(100).build(); 
        /*Creating Company object*/
	Company comp = new Company.CompanyBuilder().setId("TEST").setnumShares(100).setSharePrice(10).build();  
        
        
        
}
