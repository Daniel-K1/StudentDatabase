package com.danielk.dyplomowanie;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "SlowoKluczowe")
@Table(name = "SlowoKluczowe")
public class Keyword {

    private long id;
    private String name;

    private Set<Thesis> thesisSet;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_SlowoKluczowe")
    public long getId() {
        return id;
    }

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "SlowaPracy",
            joinColumns = {@JoinColumn(name = "ID_SlowoKluczowe")},
            inverseJoinColumns = {@JoinColumn(name = "ID_PracaDyplomowa")}
    )
    public Set<Thesis> getThesisSet() {
        return thesisSet;
    }

    @Column(name = "TrescSlowa")
    public String getName() {
        return name;
    }

    public Keyword() {
    }

    public void setThesisSet(Set<Thesis> thesisSet) {
        this.thesisSet = thesisSet;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}