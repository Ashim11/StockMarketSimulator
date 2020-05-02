# StockMarketSimulator
Files Includes :
Main.java, Seller.java, Company.java, Investor.java, SellerDecorator.java, PriceModifierSeller.java, Trading.java, Factory.java

Usage of Design Patterns:

1. "Decorator" design pattern has been used to implement the fact that when a company 
  solds 10 shares then the share price gets doubled. This is implemented using the classes
  SellerDecorator, PriceModifierSeller, Seller and Company.
   
2. "Observer" design pattern has been used to implement the fact that when a total of 10 shares
   are sold (from any company) then all companies who have not sold any shares yet will get their share 
   price reduced by 2%. This is implemented by making Trading class extends Observable and Company class 
   implementing Observer interface. Trading class instance variable 'totalSharesSoldInCurrPhase' keeps
   track of total number of shares sold which when reaches 10 notifies all Company objects.
   
3. "Factory" design pattern has been used in class Factory which has two static methods to generate a company
    and investor with random values from given range.   
