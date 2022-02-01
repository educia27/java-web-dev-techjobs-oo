package org.launchcode.techjobs_oo.Tests;
import org.junit.Assert;
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


    @Before
    public void testSettingJobId(){
        testJob = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        testJob4 = new Job ("Eddy", new Employer("Harris"), new Location("Hawaii"), new PositionType("Analyst"), new CoreCompetency("Java"));
        testJob5 = new Job ("Eddy", new Employer("Harris"), new Location("Hawaii"), new PositionType("Analyst"), new CoreCompetency("Java"));
    }

//    @Test
//    public void testSettingJobId() {
//        assertEquals(1,testJob.getId(),.001);
//        assertEquals(2,testJob2.getId(),.001);
//    }

    @Test
    public void jobIdsAreDifferent1() {
        assertEquals(1,testJob2.getId(),1);
    }

    @Test
    public void jobIdsAreDifferent2(){
        assertTrue(testJob2.getId() > testJob.getId());
    }

    @Test
    public void jobIdsAreDifferent3() {
        assertFalse(testJob.getId() > testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", testJob3.getName());
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertEquals(true, testJob3.getPositionType() instanceof PositionType);
        assertEquals(true, testJob3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        boolean check = testJob4.equals(testJob5);
        assertFalse(check);
//        System.out.println("ID of testJob4 is: " + testJob4.getId());
//        System.out.println("ID of testJob5 is: " + testJob5.getId());
    }




}
