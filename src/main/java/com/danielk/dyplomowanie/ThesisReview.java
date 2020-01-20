package com.danielk.dyplomowanie;

import javax.persistence.*;

@Entity(name = "Recenzja")
@Table(name = "Recenzja")
public class ThesisReview {

    private long id;
    private Employee employee;
    private Thesis thesis;
    private Float reviewDegree;
    private String comment;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Recenzja")
    public long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PracownikNaukowy",nullable = false)
    public Employee getEmployee() {
        return employee;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PracaDyplomowa", nullable = false)
    public Thesis getThesis() {
        return thesis;
    }

    @Column(name = "OcenaCzastkowa")
    public Float getReviewDegree() {
        return reviewDegree;
    }

    @Column(name = "Komentarz")
    public String getComment() {
        return comment;
    }

    public ThesisReview() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setThesis(Thesis thesis) {
        this.thesis = thesis;
    }

    public void setReviewDegree(Float reviewDegree) {
        this.reviewDegree = reviewDegree;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}