package sef.FinalActivity;
import junit.framework.TestCase;
import junit.framework.Assert.*;
import org.junit.*;

public class EmployeeTest extends TestCase {

     private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }

    public void testSetAndGetName() {
        String testName = "aName";
        assertNull(employee.getName());
        employee.setName(testName);
        assertEquals(testName, employee.getName());
    }

    public void testSetAndGetjobTitle() {
        String testjobTitle = "ajobTitle";
        assertNull(employee.getJobTitle());
        employee.setJobTitle(testjobTitle);
        assertEquals(testjobTitle, employee.getJobTitle());
    }
    public void testSetAndGetCompany() {
        String testCompany = "aCompany";
        assertNull(employee.getCompany());
        employee.setCompany(testCompany);
        assertEquals(testCompany, employee.getCompany());
    }
    public void testSetAndGetSalary() {
        int testSalary = 123;
        employee.setSalary(testSalary);
        assertEquals(testSalary, employee.getSalary());
        employee.setSalary(123);
        assertEquals(testSalary, employee.getSalary());
    }

    public void testSetAndGetAge() {
        int testAge = 33;
        employee.setAge(testAge);
        assertEquals(testAge, employee.getAge());
        employee.setAge(33);
        assertEquals(testAge, employee.getAge());
    }



}