
import java.util.List;
import java.util.Observable;
import java.util.Scanner;

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

This class uses "Observer" behavioral design pattern that notifies each seller whenever 
10 shares are sold from any company.
*/
public class Trading extends Observable {
    
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
    
    
    /*
    class constructor that creates a new Trading object with given parameters.
    
    @param companies list input of seller
    @param investor input list of investor
    */
    public Trading(List<Seller> companies,List<Investor> investors){
        this.companies = companies;
        this.investors = investors;
        totalSharesSoldInCurrPhase = 0;
        for(Seller seller : companies) {
            this.addObserver(seller);
        }
    }
    
    /*
    Execute the simulation of a trading day.
    */
    public void run(){
        boolean sold = true;
        
        while (sold) {
            sold = false;
            for (Investor buyer : investors){
                Seller seller = chooseSellerWithLeastPrice(buyer);
                if (seller != null){
                    buyer.buy(seller);
                    seller.sell();
                    sold= true;
                    totalSharesSoldInCurrPhase++;
                    if(totalSharesSoldInCurrPhase == 10){
                        setChanged();
                        notifyObservers();
                        totalSharesSoldInCurrPhase = 0;
                    }
                }
            
            }
        }
            
        computerReport();
        System.out.println("Done");
        
        showReports();
    }
    
    /*
    Helper method for an investor to choose the company with least share price.
    
    @param buyer the investor
    @return the Seller with least share price if any, else return null if investor
    has no seller has shares left.
    
    */
    private Seller chooseSellerWithLeastPrice(Investor buyer){
    
        int minPrice = 99999999;
        Seller minSeller = null;
        
        for(Seller seller : companies){
            if(seller.hasShares() && buyer.hasBudget(seller.getSharePrice())){
                if(seller.getSharePrice() < minPrice){
                    minPrice = seller.getSharePrice();
                    minSeller = seller;
                
                }
            
            }
        }
        
        
        return minSeller;
    }
    
    
    /*
    this will compute all the required report 
    */
    private void computerReport(){
        int minCapital = companies.get(0).getCapital();
        int maxCapital = minCapital;
        int minSharesPurchased = investors.get(0).getNumSharesPurchased();
        int maxSharesPurchased = minSharesPurchased;
        lowestCapitalCompany = companies.get(0);
        highestCapitalCompany = companies.get(0);
        
        for(Seller seller : companies){
            if(minCapital > seller.getCapital()){
                minCapital = seller.getCapital();
                lowestCapitalCompany = seller;
                
            }
            if(maxCapital < seller.getCapital()){
                maxCapital = seller.getCapital();
                highestCapitalCompany = seller;
                
            }
        }
        
        for(Investor buyer : investors){
            if(minSharesPurchased > buyer.getNumSharesPurchased()){
                minSharesPurchased = buyer.getNumSharesPurchased();
                lowestSharesPurchasedInvestor = buyer;
            }
            if(maxSharesPurchased < buyer.getNumSharesPurchased()){
                maxSharesPurchased = buyer.getNumSharesPurchased();
                highestSharesPurchasedInvestor = buyer;
                
            }
        }
        
    
    }
    
    /*
    wil show interactive reports to user.
    */
    private void showReports(){
        Scanner input = new Scanner(System.in);
        int menuChoice = -1;
        boolean done = false;
        
        while(!done){
            //display report choices menu
            System.out.println("1. Report company with the highest capital");
            System.out.println("2. Report company with the lowest capital");
            System.out.println("3. Report investor with the highest number of shares");
            System.out.println("4. Report investor with the lowest number of shares");
            System.out.println("0. Quit");
            
            //read choice 
            System.out.println("\nEnter your choice [0-4]");
            menuChoice = input.nextInt();
            switch(menuChoice) {
			case 1:
				System.out.println(highestCapitalCompany.toString() + " (Capital: " + highestCapitalCompany.getCapital()+")\n");
				break;
			case 2:
				System.out.println(lowestCapitalCompany.toString() + " (Capital: " + lowestCapitalCompany.getCapital()+")\n");
				break;
			case 3:
				System.out.println(highestSharesPurchasedInvestor.toString() + " (#Shares Purchased: " + highestSharesPurchasedInvestor.getNumSharesPurchased()+")\n");
				break;
			case 4:
				System.out.println(lowestSharesPurchasedInvestor.toString() + " (#Shares Purchased: " + lowestSharesPurchasedInvestor.getNumSharesPurchased()+")\n");
				break;
			case 0:
				done = true;
				break;
			default:
				System.out.println("Invalid menu choice! Must be between 0 - 4.\n");
				break;
			}
            
        
        }
        
    
    }
    
}
