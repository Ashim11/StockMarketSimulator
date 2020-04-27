
import java.util.List;
import java.util.stream.IntStream;

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

    private IntStream getnumSharesSold() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  //builder pattern 
    public static class CompanyBuilder{
        
        private int id;
        private int SharesPrice;
        private int numSharesSold;
        
    
        public CompanyBuilder setId(int id){
            this.id = id;
            return this;
        }
        
        public CompanyBuilder setSharesPrice(int SharesPrice){
            this.SharesPrice=SharesPrice;
            return this;
        
        }
        
        public CompanyBuilder setnumSharesSold(int numSharesSold){
            this.numSharesSold=numSharesSold;
            return this;
        
        }
        
        
        public Company build(){
            return new Company(id,SharesPrice,numSharesSold);
        }
        
	public int updateInitial(List<?> list) {
		List<Company> companies = (List<Company>) list;
		int initialSharesPrice = companies.stream().mapToInt(value -> value.getSharesPrice()).sum();
		return initialSharesPrice;
	}

	public int updateCurrent(List<?> list) {
		List<Company> companies = (List<Company>) list;
		int numSharesSold = companies.stream().mapToInt(value -> value.getnumSharesSold()).sum();
		return numSharesSold;
	}

	public void elementDetails(Object obj) {
		System.out.println("Company ID:"+id+"  "+"Shares"+SharesPrice);
	}
        
    }
    
}
