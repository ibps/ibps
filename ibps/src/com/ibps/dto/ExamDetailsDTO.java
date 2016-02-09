package com.ibps.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Shubhasis on 2/9/2016.
 */
@Entity
@Table(name = "exam_details")
public class ExamDetailsDTO implements Serializable {

    private Integer id;
    private Integer examMasterId;
    private String examType;
    private Integer totalNumOfQues;
    private Integer totalMarks;
    private Integer totalDurationInMins;

   
   @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "exam_master_id")
    public Integer getExamMasterId() {
        return examMasterId;
    }

    public void setExamMasterId(Integer examMasterId) {
        this.examMasterId = examMasterId;
    }

    @Column(name = "exam_type")
    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    @Column(name = "total_no_of_questions")
    public Integer getTotalNumOfQues() {
        return totalNumOfQues;
    }

    public void setTotalNumOfQues(Integer totalNumOfQues) {
        this.totalNumOfQues = totalNumOfQues;
    }

    @Column(name = "total_marks")
    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Column(name = "total_duration_minute")
    public Integer getTotalDurationInMins() {
        return totalDurationInMins;
    }

    public void setTotalDurationInMins(Integer totalDurationInMins) {
        this.totalDurationInMins = totalDurationInMins;
    }


}
