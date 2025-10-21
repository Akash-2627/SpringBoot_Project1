package com.college.placement.model;

import jakarta.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String jobRole;
    private double packageOffered;
    private double eligibilityCGPA;
    private String location;
    private String driveDate;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getJobRole() { return jobRole; }
    public void setJobRole(String jobRole) { this.jobRole = jobRole; }

    public double getPackageOffered() { return packageOffered; }
    public void setPackageOffered(double packageOffered) { this.packageOffered = packageOffered; }

    public double getEligibilityCGPA() { return eligibilityCGPA; }
    public void setEligibilityCGPA(double eligibilityCGPA) { this.eligibilityCGPA = eligibilityCGPA; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDriveDate() { return driveDate; }
    public void setDriveDate(String driveDate) { this.driveDate = driveDate; }
}
