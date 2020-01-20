package com.danielk.dyplomowanie;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "PracownikNaukowy")
@Table(name = "PracownikNaukowy")
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private AcademicDegree academicDegree;

    private Set<Thesis> thesisSet = new HashSet<>();
    private Set<ThesisReview> thesisReviewSet = new HashSet<>();
    private Set<Exam> examSet = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PracownikNaukowy")
    public long getId() {
        return id;
    }

    @OneToMany(mappedBy = "employee")
    public Set<ThesisReview> getThesisReviewSet() {
        return thesisReviewSet;
    }

    @OneToMany(mappedBy="employee")
    public Set<Thesis> getThesisSet() {
        return thesisSet;
    }

    @ManyToOne
    @JoinColumn(name="ID_StopienNaukowy", nullable = false)
    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    @ManyToMany
    @JoinTable(
            name = "KomisjaNaObronie",
            joinColumns = {@JoinColumn(name = "ID_PracownikNaukowy")},
            inverseJoinColumns = {@JoinColumn(name = "ID_Obrona")}
    )
    public Set<Exam> getExamSet() {
        return examSet;
    }

    @Column(name = "Nazwisko")
    public String getLastName() {
        return lastName;
    }

    @Column(name = "Imie")
    public String getFirstName() {
        return firstName;
    }

    public Employee() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAcademicDegree(AcademicDegree academicDegree) {
        this.academicDegree = academicDegree;
    }

    public void setThesisSet(Set<Thesis> thesisSet) {
        this.thesisSet = thesisSet;
    }

    public void setThesisReviewSet(Set<ThesisReview> thesisReviewSet) {
        this.thesisReviewSet = thesisReviewSet;
    }

    public void setExamSet(Set<Exam> examSet) {
        this.examSet = examSet;
    }
}