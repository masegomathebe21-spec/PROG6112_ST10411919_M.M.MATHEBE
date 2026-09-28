/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.console;

/**
 *
 * @author Student
 */
public abstarct class Console implements IConsole {
    protected String consoleType;
    protected String store;
    protected int totalSales;
    
    public Console(String consoleType, String store, int totalSales) {
        this.ConsoleType = consoleType;
        this.Store = store;
        this.totalSales = totalSales;
    }
    
    
    }
}

    