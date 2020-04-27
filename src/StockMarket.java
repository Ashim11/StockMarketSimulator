
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
public class StockMarket {
    
    private List<Company> companies = new ArrayList<>();
	private List<Investor> investors = new ArrayList<>();

	public int updateInitial(List<?> list) {
		return 0;
	}

	public int updateCurrent(List<?> list) {
		return 0;
	}
        
        
	/*we can call this element details method at any time to get the updated list of investors and companies*/
	
	public void elementDetails(Object obj) {
            
            /* Composite Design pattern is using to print all details of Companies  */
		if(obj.getClass().equals(Company.class)){  
                    
			for(Company c:companies){		   		   
				c.elementDetails(obj);
			}
		}else if(obj.getClass().equals(Investor.class)){   
			for(Investor i:investors){					  
				i.elementDetails(obj);
			}
		}
	}
        
	public List<Company> addCompanies(){
		for (int i = 0; i < 100; i++) { /* creating random companies*/
			Company company = new Company.CompanyBuilder().setId("COM " + (i + 1))
					.setShares((int) (Math.random() * (1000 - 500) + 500))
					.setSharePrice((int) (Math.random() * (100 - 10) + 10)).build();
			companies.add(company);
		}
		return companies;
	}

	public List<Investor> addInvestors(){
		for (int i = 0; i < 100; i++) { /*creating random investors*/
			Investor c = new Investor.InvestorBuilder().setId("INV" + (i + 1))
					.setBudjet((int) (Math.random() * (10000 - 1000) + 1000)).build();
			investors.add(c);
		}
		return investors;
	}
}
