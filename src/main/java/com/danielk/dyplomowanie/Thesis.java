package com.danielk.dyplomowanie;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "PracaDyplomowa")
@Table(name = "PracaDyplomowa")
public class Thesis {

    private long id;
    private Employee employee;
    private ThesisType thesisType;
    private String topic;
    private String summary;
    private String link;

    Set<Student> studentSet = new HashSet<>();
    Set<Keyword> keywordSet = new HashSet<>();
    Set<ThesisReview> reviewSet = new HashSet<>();
    Set<Exam> examSet = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PracaDyplomowa")
    public long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PracownikNaukowy", nullable = false)
    public Employee getEmployee() {
        return employee;
    }

    @ManyToOne
    @JoinColumn(name = "ID_TypPracy", nullable = false)
    public ThesisType getThesisType() {
        return thesisType;
    }

    @ManyToMany(mappedBy = "thesisSet")
    public Set<Keyword> getKeywordSet() {
        return keywordSet;
    }

    @ManyToMany(mappedBy = "thesisSet")
    public Set<Student> getStudentSet() {
        return studentSet;
    }

    @OneToMany(mappedBy = "thesis")
    public Set<ThesisReview> getReviewSet() {
        return reviewSet;
    }

    @OneToMany(mappedBy = "thesis")
    public Set<Exam> getExamSet() {
        return examSet;
    }

    @Column(name = "Temat")
    public String getTopic() {
        return topic;
    }

    @Column(name = "Streszczenie")
    public String getSummary() {
        return summary;
    }

    @Column(name = "PlikLink")
    public String getLink() {
        return link;
    }

    public Thesis() {
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setKeywordSet(Set<Keyword> keywordSet) {
        this.keywordSet = keywordSet;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setThesisType(ThesisType thesisType) {
        this.thesisType = thesisType;
    }

    public void setReviewSet(Set<ThesisReview> reviewSet) {
        this.reviewSet = reviewSet;
    }

    public void setExamSet(Set<Exam> examSet) {
        this.examSet = examSet;
    }
}