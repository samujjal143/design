package org.example.patterns.observer;

public interface StockObserver {
    void update(String stockSymbol, double stockPrice);
}
