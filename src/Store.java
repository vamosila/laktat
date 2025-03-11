/*
* File: Store.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: I-N
* Date: 2025-03-11
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static ArrayList<Employee> readFile(){
        try{
            ArrayList<Employee> empList=tryReadFile();
            return empList;
        }catch(FileNotFoundException e){
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    private static ArrayList<Employee> tryReadFile() throws FileNotFoundException{
        ArrayList<Employee> empList=new ArrayList<>();
        File file=new File("laktatkft.txt");
        try(Scanner sc=new Scanner(file,"utf-8")){
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                // System.out.println(line);
                String[] row=line.split(";");
                Employee emp=new Employee();
                emp.setName(row[0]);
                emp.setCity(row[1]);
                emp.setAddress(row[2]);
                // emp.setBirthDate(LocalDate.parse(row[3]));
                String[] date=row[3].split("-");
                int year=Integer.parseInt(date[0]);
                int month=Integer.parseInt(date[1]);
                int day=Integer.parseInt(date[2]);
                emp.setBirthDate(LocalDate.of(year,month,day));
                emp.setSalary(Double.parseDouble(row[4]));
                empList.add(emp);
            }
        }
        return empList;
    }
}
