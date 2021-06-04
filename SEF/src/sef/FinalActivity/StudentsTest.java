package sef.FinalActivity;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

public class StudentsTest extends TestCase {

    private Students student;

    protected void setUp() throws Exception {
        student = new Students();
    }

    public void testSetAndGetSchoolName() {
        String testName = "aSchoolName";
        assertNull(student.getSchoolName());
        student.setSchoolName(testName);
        assertEquals(testName, student.getSchoolName());

    }
    public void testSetAndGetName() {
        String testName = "aName";
        assertNull(student.getName());
        student.setName(testName);
        assertEquals(testName, student.getName());
    }
    public void testSetAndGetAge() {
        int testAge = 55;
        student.setAge(testAge);
        assertEquals (testAge, student.getAge());
        student.setAge(testAge);
        assertEquals(testAge, student.getAge());
    }

}
