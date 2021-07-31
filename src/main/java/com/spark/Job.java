package com.spark;

import java.util.Comparator;


public class Job implements Comparator<Job> {

    public Job(){
    }

    private String title;
    private String company;
    private String location;
    private String type;
    private String level;
    private String yearsExp;
    private String country;
    private String skills;

    public Job(String title, String company, String location, String type, String level, String yearsExp, String country, String skills) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.type = type;
        this.level = level;
        this.yearsExp = yearsExp;
        this.country = country;
        this.skills = skills;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(String yearsExp) {
        this.yearsExp = yearsExp;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", level='" + level + '\'' +
                ", yearsExp='" + yearsExp + '\'' +
                ", country='" + country + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }

    @Override
    public int compare(Job o1, Job o2) {
        return o1.getCountry().compareTo(o2.getCountry()) & o1.getCompany().compareTo(o2.getCompany()) &
                o1.getYearsExp().compareTo(o2.getYearsExp()) & o1.getLevel().compareTo(o2.getLevel()) &
                o1.getLocation().compareTo(o2.getLocation()) & o1.getTitle().compareTo(o2.getTitle()) &
                o1.getType().compareTo(o2.getType()) & o1.getSkills().compareTo(o2.getSkills()) ;
    }
}