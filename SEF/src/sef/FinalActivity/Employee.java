package sef.FinalActivity;

public class Employee extends Person{
    private String name;
    private String jobTitle;
    private String Company;
    private int salary;
    private int age;

    public Employee(){}

    public Employee(String name, String jobTitle, String Company, int salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.Company = Company;
        this.salary = salary;
        this.age = age;

    }

    public Employee(String[] items) {
        name = items[0];
        jobTitle = items[1];
        salary = Integer.parseInt(items[2]);
        Company = items [3];
        age = Integer.parseInt(items[4]);


    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "My name is " + name + " and I am " + age + " years old. I am work as " + jobTitle + " in " + Company + " with salary " + salary;
    }

}