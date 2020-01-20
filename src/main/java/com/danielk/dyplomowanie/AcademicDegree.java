package com.danielk.dyplomowanie;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "StopienNaukowy")
@Table(name = "StopienNaukowy")
public class AcademicDegree {

    private long id;
    private String degreeName;

    private Set<Employee> employeeSet;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_StopienNaukowy")
    public long getId() {
        return id;
    }

    @Column(name="NazwaStopnia")
    public String getDegreeName() {
        return degreeName;
    }

    @OneToMany(mappedBy = "academicDegree")
    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public AcademicDegree() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}