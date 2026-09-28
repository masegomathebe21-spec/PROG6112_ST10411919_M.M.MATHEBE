/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.console;

/**
 *
 * @author Student
 */
interface Console {
    
    public abstarct class Console implements IConsole {
    protected String consoleType;
    protected String store;
    protected int totalSales;
    
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
}
    public String getConsoleType() {
        return consoleType;
    }
    public String getStore() {
        return store;
    }
    public int gettotalSales() {
        return totalSales;
    }
    }
    
}
