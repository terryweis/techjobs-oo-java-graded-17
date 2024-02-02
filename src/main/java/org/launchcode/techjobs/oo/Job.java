package org.launchcode.techjobs.oo;

import java.lang.reflect.Field;
import java.util.ArrayList;
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
        this.id = nextId;
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

    public String toString() {
        String notPresent = "Data not available";
        String n = getName();
        String e = String.valueOf(this.employer);
        String l = String.valueOf(this.location);
        String p = String.valueOf(this.positionType);
        String c = String.valueOf(this.coreCompetency);

        if(n == (null)) n = notPresent;
        if(e ==(null)) e = notPresent;
        if(l ==(null)) l = notPresent;
        if(p == (null)) p = notPresent;
        if(c == (null)) c = notPresent;


        return "\n" +
                    "\n" + "ID: " + this.id + "\n" +
                    "\n" + "Name: " + n + "\n" +
                    "\n" + "Employer: " + e + "\n" +
                    "\n" + "Location: " + l + "\n" +
                    "\n" + "Position Type: " + p + "\n" +
                    "\n" + "Core Competency: " + c + "\n" +
                    "\n";
        }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

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
}
