package com.mycompany.devicesales;

public abstract class Consoles implements IConsoles {

    private final String consoleType;
    private final String store;
    private final int totalSales;

    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    public abstract void printReport();
}
