package com.ibps.db;

import javax.persistence.*;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "exam_details", schema = "", catalog = "ibps")
public class ExamDetailsEntity {
    private int id;
    private int examMasterId;
    private String examType;
    private int totalNoOfQuestions;
    private int totalMarks;
    private int totalDurationMinute;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "exam_master_id", nullable = false, insertable = true, updatable = true)
    public int getExamMasterId() {
        return examMasterId;
    }

    public void setExamMasterId(int examMasterId) {
        this.examMasterId = examMasterId;
    }

    @Basic
    @Column(name = "exam_type", nullable = false, insertable = true, updatable = true, length = 45)
    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    @Basic
    @Column(name = "total_no_of_questions", nullable = false, insertable = true, updatable = true)
    public int getTotalNoOfQuestions() {
        return totalNoOfQuestions;
    }

    public void setTotalNoOfQuestions(int totalNoOfQuestions) {
        this.totalNoOfQuestions = totalNoOfQuestions;
    }

    @Basic
    @Column(name = "total_marks", nullable = false, insertable = true, updatable = true)
    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Basic
    @Column(name = "total_duration_minute", nullable = false, insertable = true, updatable = true)
    public int getTotalDurationMinute() {
        return totalDurationMinute;
    }

    public void setTotalDurationMinute(int totalDurationMinute) {
        this.totalDurationMinute = totalDurationMinute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamDetailsEntity that = (ExamDetailsEntity) o;

        if (id != that.id) return false;
        if (examMasterId != that.examMasterId) return false;
        if (totalNoOfQuestions != that.totalNoOfQuestions) return false;
        if (totalMarks != that.totalMarks) return false;
        if (totalDurationMinute != that.totalDurationMinute) return false;
        if (examType != null ? !examType.equals(that.examType) : that.examType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + examMasterId;
        result = 31 * result + (examType != null ? examType.hashCode() : 0);
        result = 31 * result + totalNoOfQuestions;
        result = 31 * result + totalMarks;
        result = 31 * result + totalDurationMinute;
        return result;
    }
}
