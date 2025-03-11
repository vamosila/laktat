/*
* File: Employee.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: I-N
* Date: 2025-03-11
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

import java.time.LocalDate;

public class Employee {
    private String name;
    private String city;
    private String address;
    private LocalDate birthDate;
    private double salary;
    public Employee() {
    }
    public Employee(String name, String city, String address, LocalDate birthDate, double salary) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.birthDate = birthDate;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
