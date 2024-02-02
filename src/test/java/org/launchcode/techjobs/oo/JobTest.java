package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import javax.swing.text.Position;

import java.util.Objects;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobID() {
        Job productTester = new Job();
        Job codeDesigner = new Job();
        assertNotEquals(productTester.getId(),codeDesigner.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(productTester.getName().contains("Product tester"));
        assertTrue(productTester.getEmployer() instanceof Employer);
        assertTrue(productTester.getLocation() instanceof Location);
        assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(productTester.getPositionType() instanceof PositionType);
        assertEquals("Product tester", productTester.getName());
        assertEquals("ACME", productTester.getEmployer().toString());
        assertEquals("Desert", productTester.getLocation().toString());
        assertEquals("Quality control", productTester.getPositionType().toString());
        assertEquals("Persistence", productTester.getCoreCompetency().toString());

    }
    @Test
    public void testJobsForEquality(){
        Job productTesters = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job productTesting = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(false,productTesters.getId()==productTesting.getId());
        }
@Test
    public void testToStringStartsAndEndsWithNewLine(){
    Job productTesters = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(true, productTesters.toString().startsWith("\n"));
    assertEquals(true,productTesters.toString().endsWith("\n"));
}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job productTesters = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("\n" +
            "\n" + "ID: " + "4" + "\n"+
            "\n" + "Name: " + "Product tester" + "\n"+
            "\n" + "Employer: " + "ACME" + "\n"+
            "\n" + "Location: " + "Desert" + "\n"+
            "\n" + "Position Type: " + "Quality control" + "\n"+
            "\n" + "Core Competency: " + "Persistence" + "\n"+
            "\n",productTesters.toString());
}
@Test
    public void testToStringHandlesEmptyField(){
    Job productTesters = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(null));
    productTesters.toString();
    assertEquals("\n" +
            "\n" + "ID: " + "3" + "\n"+
            "\n" + "Name: " + "Product tester" + "\n"+
            "\n" + "Employer: " + "ACME" + "\n"+
            "\n" + "Location: " + "Desert" + "\n"+
            "\n" + "Position Type: " + "Quality control" + "\n"+
            "\n" + "Core Competency: " + "Data not available" + "\n"+
            "\n",productTesters.toString());
}



    }

