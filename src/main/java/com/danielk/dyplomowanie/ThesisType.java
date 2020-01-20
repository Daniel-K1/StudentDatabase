package com.danielk.dyplomowanie;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "TypPracy")
@Table(name = "TypPracy")
public class ThesisType {

    private long id;
    private String thesisType;

    private Set<Thesis> thesisSet;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_TypPracy")
    public long getId() {
        return id;
    }

    @Column(name = "TypPracy")
    public String getThesisType() {
        return thesisType;
    }

    @OneToMany(mappedBy = "thesisType")
    public Set<Thesis> getThesisSet() {
        return thesisSet;
    }

    public ThesisType() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setThesisType(String thesisType) {
        this.thesisType = thesisType;
    }

    public void setThesisSet(Set<Thesis> thesisSet) {
        this.thesisSet = thesisSet;
    }

}