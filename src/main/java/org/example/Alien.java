package org.example;

public class Alien {

    private Computer computer;
    private int age;
    private int salary;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien(Computer computer){
        this.computer=computer;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Building the project.");
       computer.compile();
    }
}
