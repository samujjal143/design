package org.example;

import org.example.patterns.factory.Dish;
import org.example.patterns.factory.DishFactory;
import org.example.patterns.factory.PizzaFactory;
import org.example.patterns.observer.Investor;
import org.example.patterns.observer.StockMarketImpl;
import org.example.patterns.observer.StockObserver;
import org.example.patterns.singleton.Singleton;
import org.example.patterns.state.State;
import org.example.patterns.state.TVContext;
import org.example.patterns.state.TVStartState;
import org.example.patterns.state.TVStopState;
import org.example.patterns.strategy.EasyLevel;
import org.example.patterns.strategy.Game;
import org.example.patterns.strategy.HardLevel;
import org.example.patterns.strategy.MediumLevel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Enter your design pattern
                1. Singleton
                2. Factory Method
                3. Strategy
                4. Observer
                5. Adapter\s
                6. Builder\s
                7. State""");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println(Singleton.getInstance());
                break;
            case 2:
                DishFactory pizzaFactory = new PizzaFactory();
                Dish pizza = pizzaFactory.createDish();
                pizza.prepare();
                pizza.serve();
                break;
            case 3:
                Game game = new Game(new EasyLevel());
                game.startGame();
                game.setDifficultyLevelStrategy(new MediumLevel());
                game.startGame();
                game.setDifficultyLevelStrategy(new HardLevel());
                game.startGame();
                break;
            case 4:
                StockMarketImpl stockMarket = new StockMarketImpl();
                StockObserver investor1 = new Investor("Alice");
                StockObserver investor2 = new Investor("Bob");
                stockMarket.registerObserver(investor1);
                stockMarket.registerObserver(investor2);
                stockMarket.setStockPrice("INFY", 1250.0); // Both investors receive updates
                stockMarket.setStockPrice("TCS", 2500.0); // Both investors receive updates
                stockMarket.removeObserver(investor1);
                stockMarket.setStockPrice("WIPRO", 700.0); // Only investor2 receives the update
                break;
            case 7:
                TVContext context = new TVContext();
                State tvStartState = new TVStartState();
                State tvStopState = new TVStopState();
                context.setState(tvStartState);
                context.doAction();
                context.setState(tvStopState);
                context.doAction();
        }
    }
}