package nivell1_Observator;

public class Main {

public static void main(String[] args){

    Broker observable = new Broker();

    MarketAgency observer = new MarketAgency("VanguardGroup");
    MarketAgency observer1= new MarketAgency("Goldman Sachs");


    observable.addObservers(observer1);
    observable.addObservers(observer);

    observable.setStockvalue(120.8);
    observable.setStockvalue(0);





}


}
