/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electonicfranchise;

/**
 *
 * @author Student
 */
public class ElectonicFranchise {

    public static void main(String[] args) {
        
// Single dimenstional array

String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

// Two-dimenstional arrays

int[][] sales = {
    {1000, 2000, 3000};
    {2000, 3000, 4000};
    {1500, 1100, 1200};
 };
    
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("---------------------------");
    
    System.out.println("City           PS5   XBOX    SWITCH");
   
    for (int i = 0; i < 3; i++) {
    System.out.println(cities[i] + "  "
                       + sales[i][0] + "  "
                       + sales[i][1] + "  "
                       + sales[i][2] + "  ");
}
    // Calculate total sales
    int total1 = sales[0][0] + sales[0][1] + sales[0][2];
    int total2 = sales[1][0] + sales[1][1] + sales[1][2];
    int total3 = sales[2][0] + sales[2][1] + sales[2][2];
     
// Displaying total sales
    System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
    System.out.println("Cape Town + total1");
    System.out.println("Port Elizabeth + total 2");
    System.out.println("Pretoria + total3");

// Find city with the most sales
    
if (total1 > total2 && total1 > total3);
System.out.println("The City with the most sales is: Cape Town");
}
else if (total2 > total1 && total2 > total3);
System.out.println("The city with the most sales: Port Elizabeth");
}
else {
System.out.println("The city with the most sales : Pretoria");


    }
}
