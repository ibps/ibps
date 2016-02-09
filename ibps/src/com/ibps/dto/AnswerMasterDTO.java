package com.ibps.dto;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Shubhasis on 2/9/2016.
 */


@Entity
@Table(name = "answer_master")
public class AnswerMasterDTO implements  Serializable {
    private BigInteger id;
    private String serialNumber;
    private Integer quesMasterID;
    private Blob ansStatement;

    
   @Column(name = "id", unique = true, nullable = false)
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    @Column(name = "serial_no")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Column(name = "ques_master_id")
    public Integer getQuesMasterID() {
        return quesMasterID;
    }

    public void setQuesMasterID(Integer quesMasterID) {
        this.quesMasterID = quesMasterID;
    }

    @Column(name = "answer_statement")
    public Blob getAnsStatement() {
        return ansStatement;
    }

    public void setAnsStatement(Blob ansStatement) {
        this.ansStatement = ansStatement;
    }

    @Override
    public String toString() {
        return "AnswerMasterDTO{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", quesMasterID=" + quesMasterID +
                ", ansStatement=" + ansStatement +
                '}';
    }
}