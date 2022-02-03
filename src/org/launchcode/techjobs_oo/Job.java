package org.launchcode.techjobs_oo;


import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
        public Job() {
            id = nextId;
            nextId++;
        }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
            this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
            String data;
            String nameData = this.name;  //already declared as string
            String employerData = this.getEmployer().toString(); // must be converted to strings since deriving from object
            String locationData = this.getLocation().toString();
            String positionTypeData = this.getPositionType().toString();
            String coreCompetencyData = this.getCoreCompetency().toString();

        if (nameData == "") {
            nameData = " Name Data Not Available";
        } else if (employerData == "") {
            employerData = " Employer Data Not Available";
        } else if (locationData == "") {
            locationData = "Location Data Not Available";
        } else if (positionTypeData == "") {
            positionTypeData = "Position Type Data Not Available";
        } else if (coreCompetencyData == "") {
            coreCompetencyData = "Core Competency Data Not Available";
        }

        data = "\nID : " + getId() +
                "\nName : " + nameData +
                "\nEmployer : " + employerData +
                "\nLocation : " + locationData +
                "\nPosition Type : " + positionTypeData +
                "\nCore Competency : " + coreCompetencyData + "\n";

        return data;
    }



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
