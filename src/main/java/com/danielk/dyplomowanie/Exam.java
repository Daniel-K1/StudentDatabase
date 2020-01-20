package com.danielk.dyplomowanie;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Obrona")
@Table(name = "Obrona")
public class Exam {

    private long id;
    private Thesis thesis;
    private Student student;
    private String date;
    private Float finalDegree;

    private Set<Employee> employeeSet = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Obrona")
    public long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PracaDyplomowa")
    public Thesis getThesis() {
        return thesis;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Student")
    public Student getStudent() {
        return student;
    }

    @ManyToMany(mappedBy = "examSet")
    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    @Column(name = "Data")
    public String getDate() {
        return date;
    }


    @Column(name = "FinalnaOcena")
    public Float getFinalDegree() {
        return finalDegree;
    }

    public Exam() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setThesis(Thesis thesis) {
        this.thesis = thesis;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFinalDegree(Float finalDegree) {
        this.finalDegree = finalDegree;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
