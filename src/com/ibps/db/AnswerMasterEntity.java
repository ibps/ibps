package com.ibps.db;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "answer_master")
public class AnswerMasterEntity implements Serializable {
    private long id;
    private String serialNo;
    private byte[] answerStatement;
    private int quesMasterId;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "serial_no", nullable = false, insertable = true, updatable = true, length = 1)
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    @Basic
    @Column(name = "answer_statement", nullable = false, insertable = true, updatable = true)
    public byte[] getAnswerStatement() {
        return answerStatement;
    }

    public void setAnswerStatement(byte[] answerStatement) {
        this.answerStatement = answerStatement;
    }

    @Basic
    @Column(name = "ques_master_id", nullable = false, insertable = true, updatable = true)
    public int getQuesMasterId() {
        return quesMasterId;
    }

    public void setQuesMasterId(int quesMasterId) {
        this.quesMasterId = quesMasterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnswerMasterEntity that = (AnswerMasterEntity) o;

        if (id != that.id) return false;
        if (quesMasterId != that.quesMasterId) return false;
        if (serialNo != null ? !serialNo.equals(that.serialNo) : that.serialNo != null) return false;
        if (!Arrays.equals(answerStatement, that.answerStatement)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (serialNo != null ? serialNo.hashCode() : 0);
        result = 31 * result + (answerStatement != null ? Arrays.hashCode(answerStatement) : 0);
        result = 31 * result + quesMasterId;
        return result;
    }
}
