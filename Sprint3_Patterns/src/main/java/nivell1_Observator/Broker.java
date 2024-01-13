package nivell1_Observator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Broker {

    private final List<MarketObserver> observers = new ArrayList<>();
    private double stockValue;


    public void addObservers(MarketObserver observer) {

        observers.add(observer);
    }

    public void removeObservers(MarketObserver observer) {

        observers.remove(observer);

    }
    public void notifyObservers() {
        observers.stream().filter(Objects::nonNull).forEach(ob -> ob.update(this));
    }

    public double getStockvalue() {
        return stockValue;
    }

    public void setStockvalue(double value) {
        stockValue = value;
        notifyObservers();
    }



}
