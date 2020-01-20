package com.danielk.dyplomowanie;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Student")
@Table(name = "Student")
public class Student {


    private long id;
    private String firstName;
    private String lastName;

    private Set<Thesis> thesisSet = new HashSet<>();
    private Set<Exam> examSet = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Student")
    public long getId() {
        return id;
    }

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "PraceStudenta",
            joinColumns = {@JoinColumn(name = "ID_Student")},
            inverseJoinColumns = {@JoinColumn(name = "ID_PracaDyplomowa")}
    )
    public Set<Thesis> getThesisSet() {
        return thesisSet;
    }

    @OneToMany(mappedBy = "student")
    public Set<Exam> getExamSet() {
        return examSet;
    }

    @Column(name = "Imie")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "Nazwisko")
    public String getLastName() {
        return lastName;
    }

    public Student() {
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setThesisSet(Set<Thesis> thesisSet) {
        this.thesisSet = thesisSet;
    }

    public void setExamSet(Set<Exam> examSet) {
        this.examSet = examSet;
    }
}