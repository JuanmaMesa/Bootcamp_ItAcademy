package nivell1_Observator;

public class MarketAgency implements MarketObserver {

    String name;

    public MarketAgency( String name) {
        this.name = name;
    }

    @Override
    public void update(Broker agent) {
        System.out.println("Agencia: "+name +" notificada. Nuevo valor en bolsa: "+ agent.getStockvalue());

    }
}
