package com.ibps.db;

import javax.persistence.*;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "student_ans_master", schema = "", catalog = "ibps")
public class StudentAnsMasterEntity {
    private int id;
    private int studentMasterId;
    private int quesSetId;
    private Double totalMarksReceived;
    private Integer totalNumCorrectAns;
    private Integer totalAttemptedQues;
    private Integer totalNumWrongAns;
    private String examinationDate;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "student_master_id", nullable = false, insertable = true, updatable = true)
    public int getStudentMasterId() {
        return studentMasterId;
    }

    public void setStudentMasterId(int studentMasterId) {
        this.studentMasterId = studentMasterId;
    }

    @Basic
    @Column(name = "ques_set_id", nullable = false, insertable = true, updatable = true)
    public int getQuesSetId() {
        return quesSetId;
    }

    public void setQuesSetId(int quesSetId) {
        this.quesSetId = quesSetId;
    }

    @Basic
    @Column(name = "total_marks_received", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getTotalMarksReceived() {
        return totalMarksReceived;
    }

    public void setTotalMarksReceived(Double totalMarksReceived) {
        this.totalMarksReceived = totalMarksReceived;
    }

    @Basic
    @Column(name = "total_num_correct_ans", nullable = true, insertable = true, updatable = true)
    public Integer getTotalNumCorrectAns() {
        return totalNumCorrectAns;
    }

    public void setTotalNumCorrectAns(Integer totalNumCorrectAns) {
        this.totalNumCorrectAns = totalNumCorrectAns;
    }

    @Basic
    @Column(name = "total_attempted_ques", nullable = true, insertable = true, updatable = true)
    public Integer getTotalAttemptedQues() {
        return totalAttemptedQues;
    }

    public void setTotalAttemptedQues(Integer totalAttemptedQues) {
        this.totalAttemptedQues = totalAttemptedQues;
    }

    @Basic
    @Column(name = "total_num_wrong_ans", nullable = true, insertable = true, updatable = true)
    public Integer getTotalNumWrongAns() {
        return totalNumWrongAns;
    }

    public void setTotalNumWrongAns(Integer totalNumWrongAns) {
        this.totalNumWrongAns = totalNumWrongAns;
    }

    @Basic
    @Column(name = "examination_date", nullable = false, insertable = true, updatable = true, length = 45)
    public String getExaminationDate() {
        return examinationDate;
    }

    public void setExaminationDate(String examinationDate) {
        this.examinationDate = examinationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentAnsMasterEntity that = (StudentAnsMasterEntity) o;

        if (id != that.id) return false;
        if (studentMasterId != that.studentMasterId) return false;
        if (quesSetId != that.quesSetId) return false;
        if (totalMarksReceived != null ? !totalMarksReceived.equals(that.totalMarksReceived) : that.totalMarksReceived != null)
            return false;
        if (totalNumCorrectAns != null ? !totalNumCorrectAns.equals(that.totalNumCorrectAns) : that.totalNumCorrectAns != null)
            return false;
        if (totalAttemptedQues != null ? !totalAttemptedQues.equals(that.totalAttemptedQues) : that.totalAttemptedQues != null)
            return false;
        if (totalNumWrongAns != null ? !totalNumWrongAns.equals(that.totalNumWrongAns) : that.totalNumWrongAns != null)
            return false;
        if (examinationDate != null ? !examinationDate.equals(that.examinationDate) : that.examinationDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + studentMasterId;
        result = 31 * result + quesSetId;
        result = 31 * result + (totalMarksReceived != null ? totalMarksReceived.hashCode() : 0);
        result = 31 * result + (totalNumCorrectAns != null ? totalNumCorrectAns.hashCode() : 0);
        result = 31 * result + (totalAttemptedQues != null ? totalAttemptedQues.hashCode() : 0);
        result = 31 * result + (totalNumWrongAns != null ? totalNumWrongAns.hashCode() : 0);
        result = 31 * result + (examinationDate != null ? examinationDate.hashCode() : 0);
        return result;
    }
}
