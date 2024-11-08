package org.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarketImpl implements StockMarket {

    private final List<StockObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockSymbol, double stockPrice) {
        for (StockObserver observer : observers) {
            observer.update(stockSymbol, stockPrice);
        }
    }

    public void setStockPrice(String stockSymbol, double stockPrice) {
        notifyObservers(stockSymbol, stockPrice);
    }
}