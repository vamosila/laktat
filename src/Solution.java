/*
* File: Solution.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: I-N
* Date: 2025-03-11
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Solution {
    public static void startSolution(){
        ArrayList<Employee> empList=Store.readFile();
        task01(empList);
        task02(empList);
    }
    private static void task01(ArrayList<Employee> empList){
        System.out.println("1. feladat: ");
        int count=0;
        for(Employee emp:empList){
            if(Period.between(emp.getBirthDate(),LocalDate.now()).getYears()>30){
                count++;
            }
        }
        System.out.printf("\tEnnyi 30 évesnél idősebb dolgozó van: %d db\n\n",count);
    }
    private static void task02(ArrayList<Employee> empList){
        System.out.println("2. feladat: ");
        int count=0;
        double sum=0;
        for(Employee emp:empList){
            if(emp.getCity().equals("Budapest")){
                count++;
                sum+=emp.getSalary();
            }
        }
        double avg=sum/count;
        System.out.printf("\tA budapesti dolgozók átlagbére: %,.2f Ft\n\n",avg);
    }
}
