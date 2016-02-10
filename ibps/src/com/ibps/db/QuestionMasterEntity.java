package com.ibps.db;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "question_master", schema = "", catalog = "ibps")
public class QuestionMasterEntity {
    private int id;
    private int quesSectionMasterId;
    private String direction;
    private byte[] commonStatement;
    private String questionStatement;
    private long ansMasterId;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ques_section_master_id", nullable = false, insertable = true, updatable = true)
    public int getQuesSectionMasterId() {
        return quesSectionMasterId;
    }

    public void setQuesSectionMasterId(int quesSectionMasterId) {
        this.quesSectionMasterId = quesSectionMasterId;
    }

    @Basic
    @Column(name = "direction", nullable = true, insertable = true, updatable = true, length = 1024)
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Basic
    @Column(name = "common_statement", nullable = true, insertable = true, updatable = true)
    public byte[] getCommonStatement() {
        return commonStatement;
    }

    public void setCommonStatement(byte[] commonStatement) {
        this.commonStatement = commonStatement;
    }

    @Basic
    @Column(name = "question_statement", nullable = false, insertable = true, updatable = true, length = 1024)
    public String getQuestionStatement() {
        return questionStatement;
    }

    public void setQuestionStatement(String questionStatement) {
        this.questionStatement = questionStatement;
    }

    @Basic
    @Column(name = "ans_master_id", nullable = false, insertable = true, updatable = true)
    public long getAnsMasterId() {
        return ansMasterId;
    }

    public void setAnsMasterId(long ansMasterId) {
        this.ansMasterId = ansMasterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionMasterEntity that = (QuestionMasterEntity) o;

        if (id != that.id) return false;
        if (quesSectionMasterId != that.quesSectionMasterId) return false;
        if (ansMasterId != that.ansMasterId) return false;
        if (direction != null ? !direction.equals(that.direction) : that.direction != null) return false;
        if (!Arrays.equals(commonStatement, that.commonStatement)) return false;
        if (questionStatement != null ? !questionStatement.equals(that.questionStatement) : that.questionStatement != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + quesSectionMasterId;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        result = 31 * result + (commonStatement != null ? Arrays.hashCode(commonStatement) : 0);
        result = 31 * result + (questionStatement != null ? questionStatement.hashCode() : 0);
        result = 31 * result + (int) (ansMasterId ^ (ansMasterId >>> 32));
        return result;
    }
}
