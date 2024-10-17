package day06;

import java.util.Date;

//5
public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private Double salary;
    private Date dob;
    
    public Person(long id, String firstName, String lastName, Double salary, Date dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString(){
        return "Person [id=" + id + ", first name=" + firstName + ", last name=" + lastName + ", salary=" + salary + ", date of birth=" + dob + "]";

        // csv format
        // return id + ", " + name + ", " + description + ", " + category;
    }
    
    
}
