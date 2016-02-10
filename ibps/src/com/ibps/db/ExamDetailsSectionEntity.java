package com.ibps.db;

import javax.persistence.*;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "exam_details_section", schema = "", catalog = "ibps")
public class ExamDetailsSectionEntity {
    private int id;
    private int examDetailsId;
    private int sectionMasterId;
    private int noOfQuesSectionWise;
    private double marksPerQues;
    private double negativeMarkPerQues;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "exam_details_id", nullable = false, insertable = true, updatable = true)
    public int getExamDetailsId() {
        return examDetailsId;
    }

    public void setExamDetailsId(int examDetailsId) {
        this.examDetailsId = examDetailsId;
    }

    @Basic
    @Column(name = "section_master_id", nullable = false, insertable = true, updatable = true)
    public int getSectionMasterId() {
        return sectionMasterId;
    }

    public void setSectionMasterId(int sectionMasterId) {
        this.sectionMasterId = sectionMasterId;
    }

    @Basic
    @Column(name = "no_of_ques_section_wise", nullable = false, insertable = true, updatable = true)
    public int getNoOfQuesSectionWise() {
        return noOfQuesSectionWise;
    }

    public void setNoOfQuesSectionWise(int noOfQuesSectionWise) {
        this.noOfQuesSectionWise = noOfQuesSectionWise;
    }

    @Basic
    @Column(name = "marks_per_ques", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getMarksPerQues() {
        return marksPerQues;
    }

    public void setMarksPerQues(double marksPerQues) {
        this.marksPerQues = marksPerQues;
    }

    @Basic
    @Column(name = "negative_mark_per_ques", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getNegativeMarkPerQues() {
        return negativeMarkPerQues;
    }

    public void setNegativeMarkPerQues(double negativeMarkPerQues) {
        this.negativeMarkPerQues = negativeMarkPerQues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamDetailsSectionEntity that = (ExamDetailsSectionEntity) o;

        if (id != that.id) return false;
        if (examDetailsId != that.examDetailsId) return false;
        if (sectionMasterId != that.sectionMasterId) return false;
        if (noOfQuesSectionWise != that.noOfQuesSectionWise) return false;
        if (Double.compare(that.marksPerQues, marksPerQues) != 0) return false;
        if (Double.compare(that.negativeMarkPerQues, negativeMarkPerQues) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + examDetailsId;
        result = 31 * result + sectionMasterId;
        result = 31 * result + noOfQuesSectionWise;
        temp = Double.doubleToLongBits(marksPerQues);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(negativeMarkPerQues);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
