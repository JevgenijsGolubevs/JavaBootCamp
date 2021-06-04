package sef.FinalActivity;
import junit.framework.TestCase;
import junit.framework.Assert.*;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest extends TestCase {
    private Person person;

    protected void setUp() throws Exception {
        person = new Person();
    }

    public void testSetAndGetName() {
        String testName = "aName";
        assertNull(person.getName());
        person.setName(testName);
        assertEquals(testName, person.getName());
    }
    public void testSetAndGetAge() {
        int testAge = 22;
        person.setAge(testAge);
        assertEquals (testAge, person.getAge());
        person.setAge(testAge);
        assertEquals(testAge, person.getAge());
    }

}