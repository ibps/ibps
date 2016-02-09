package com.ibps.dto;
import java.io.Serializable;

import javax.persistence.Column;

/**
 * Created by Shubhasis on 2/9/2016.
 */
public class ExamDetailsSetionDTO implements Serializable {
       private Integer id;
    private Integer examDetailsId;
    private Integer sectionMasterId;
    private Integer sectionWiseQues;
    private Double marksPerQues;
    private Double negativeMarkPerQues;

   /* @Id*/
   @Column(name = "id", unique = true, nullable = false)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "exam_details_id")
    public Integer getExamDetailsId() {
        return examDetailsId;
    }

    public void setExamDetailsId(Integer examDetailsId) {
        this.examDetailsId = examDetailsId;
    }

    @Column(name = "section_master_id")
    public Integer getSectionMasterId() {
        return sectionMasterId;
    }

    public void setSectionMasterId(Integer sectionMasterId) {
        this.sectionMasterId = sectionMasterId;
    }

    @Column(name = "no_of_ques_section_wise")
    public Integer getSectionWiseQues() {
        return sectionWiseQues;
    }

    public void setSectionWiseQues(Integer sectionWiseQues) {
        this.sectionWiseQues = sectionWiseQues;
    }

    @Column(name = "marks_per_ques")
    public Double getMarksPerQues() {
        return marksPerQues;
    }

    public void setMarksPerQues(Double marksPerQues) {
        this.marksPerQues = marksPerQues;
    }

    @Column(name = "negativeMarkPerQues")
    public Double getNegativeMarkPerQues() {
        return negativeMarkPerQues;
    }

    public void setNegativeMarkPerQues(Double negativeMarkPerQues) {
        this.negativeMarkPerQues = negativeMarkPerQues;
    }

    @Override
    public String toString() {
        return "ExamDetailsSetionDTO{" +
                "id=" + id +
                ", examDetailsId=" + examDetailsId +
                ", sectionMasterId=" + sectionMasterId +
                ", sectionWiseQues=" + sectionWiseQues +
                ", marksPerQues=" + marksPerQues +
                ", negativeMarkPerQues=" + negativeMarkPerQues +
                '}';
    }
}
