package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job testJob;
    Job testJob2;
    Job testJob3;
    Job testJob4;
    Job testJob5;
    Job testJob6;
    Job testJob7;
    Job testJob8;
    Job testJob9;
    Job testJob10;


    @Before
    public void initiatingJobs(){
        testJob = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        testJob4 = new Job ("Momento", new Employer("Harris"), new Location("Hawaii"), new PositionType("Analyst"), new CoreCompetency("Ruby"));
        testJob5 = new Job ("Alias", new Employer("Harris"), new Location("Hawaii"), new PositionType("Analyst"), new CoreCompetency("Kotlin"));
        testJob6 = new Job ("", new Employer("WeLink"), new Location("Utah"), new PositionType("Analyst"), new CoreCompetency("Python"));
        testJob7 = new Job ("Eddy", new Employer(""), new Location("Utah"), new PositionType("Analyst"), new CoreCompetency("JavaScript"));
        testJob8 = new Job ("Foxtrot", new Employer("Google"), new Location(""), new PositionType("Analyst"), new CoreCompetency("Rust"));
        testJob9 = new Job ("Tony", new Employer("Facebook"), new Location("Ivory Coast"), new PositionType(""), new CoreCompetency("GoLang"));
        testJob10 = new Job ("Mike", new Employer("Amazon"), new Location("California"), new PositionType("Data Architect"), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(testJob.getId() + 1, testJob2.getId());
        assertTrue(testJob2.getId() > testJob.getId());
        assertFalse(testJob.getId() > testJob2.getId());
    }

//    @Test
//    public void jobIdsAreDifferent1() {
//        assertEquals(1,testJob2.getId(),1);
//    }


    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue( testJob3.getName() instanceof String);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().getValue());
        assertEquals("Desert", testJob3.getLocation().getValue());
        assertEquals("Quality control",testJob3.getPositionType().getValue());
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        boolean check = testJob4.equals(testJob5);
        assertFalse(check);
//        System.out.println("ID of testJob4 is: " + testJob4.getId());
//        System.out.println("ID of testJob5 is: " + testJob5.getId());
//        assertNotSame(testJob4,testJob5);
    }

    @Test
    public void startsAndEndsWithABlankLine() {
        assertEquals('\n', testJob3.toString().charAt(0));
        assertEquals('\n', testJob3.toString().charAt(testJob3.toString().length() - 1));
        //retrieving last character of string is always index  - 1


    }

    @Test
    public void hasLabelsForEachField() {
        assertEquals("\nID : " + testJob3.getId() +
                "\nName : " + testJob3.getName() +
                "\nEmployer : " + testJob3.getEmployer() +
                "\nLocation : " + testJob3.getLocation() +
                "\nPosition Type : " + testJob3.getPositionType() +
                "\nCore Competency : " + testJob3.getCoreCompetency() + "\n", testJob3.toString());

    }

    @Test
    public void dataNotAvailableTests() {
        assertTrue(testJob6.toString().contains("Name Data Not Available"));
        assertTrue(testJob7.toString().contains("Employer Data Not Available"));
        assertTrue(testJob8.toString().contains("Location Data Not Available"));
        assertTrue(testJob9.toString().contains("Position Type Data Not Available"));
        assertTrue(testJob10.toString().contains("Core Competency Data Not Available"));
    }


}
