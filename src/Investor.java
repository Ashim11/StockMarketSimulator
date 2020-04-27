
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
public class Investor {
    
    private int id;
    
    private int budget;
    
    private int numSharesPurchased;
    
    private Investor(int id, int budget){
        this.id = id;
        this.budget=budget;
        
    }
    private List<Company> investedCompanies = new ArrayList<>();
    
    private void addInvestedCompany(Company c){
        investedCompanies.add(c);
    
    }

    public int getId() {
        return id;
    }

    public int getBudget() {
        return budget;
    }

    public int getNumSharesPurchased() {
        return numSharesPurchased;
    }

    public List<Company> getInvestedCompanies() {
        return investedCompanies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setNumSharesPurchased(int numSharesPurchased) {
        this.numSharesPurchased = numSharesPurchased;
    }

    public void setInvestedCompanies(List<Company> investedCompanies) {
        this.investedCompanies = investedCompanies;
    }
    
    //builder pattern
    public static class InvestorBuilder{
		private int id;
		private int budget;

		public InvestorBuilder setId(int id){
			this.id = id;
			return this;
		}

		public InvestorBuilder setBudjet(int budget){
			this.budget = budget;
			return this;
		}

		public Investor build(){
			return new Investor(id,budget);
		}
	}

	public int updateInitial(List<?> list) {
		//List<Investor> investors = (List<Investor>) list;
		//int allInvestorBudget = investors.stream().mapToInt(value -> value.getBudget()).sum();
		return 1;
	}

	public int updateCurrent(List<?> list) {
		List<Investor> investors = (List<Investor>) list;
		int currentInvestorsBudget = investors.stream().mapToInt(investor -> investor.getBudget()).sum();
		return currentInvestorsBudget;
	}

	public void elementDetails(Object obj) {
		System.out.println("Investor ID:"+id+"  "+"Budget:"+budget);
	}
    
}
