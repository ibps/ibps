package com.ibps.db;

import javax.persistence.*;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "student_ans_details")
public class StudentAnsDetailsEntity implements Serializable{
    private int id;
    private int studentAnsMasterId;
    private long quesMaster;
    private long givenAns;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "student_ans_master_id", nullable = false, insertable = true, updatable = true)
    public int getStudentAnsMasterId() {
        return studentAnsMasterId;
    }

    public void setStudentAnsMasterId(int studentAnsMasterId) {
        this.studentAnsMasterId = studentAnsMasterId;
    }

    @Basic
    @Column(name = "ques_master", nullable = false, insertable = true, updatable = true)
    public long getQuesMaster() {
        return quesMaster;
    }

    public void setQuesMaster(long quesMaster) {
        this.quesMaster = quesMaster;
    }

    @Basic
    @Column(name = "given_ans", nullable = false, insertable = true, updatable = true)
    public long getGivenAns() {
        return givenAns;
    }

    public void setGivenAns(long givenAns) {
        this.givenAns = givenAns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentAnsDetailsEntity that = (StudentAnsDetailsEntity) o;

        if (id != that.id) return false;
        if (studentAnsMasterId != that.studentAnsMasterId) return false;
        if (quesMaster != that.quesMaster) return false;
        if (givenAns != that.givenAns) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + studentAnsMasterId;
        result = 31 * result + (int) (quesMaster ^ (quesMaster >>> 32));
        result = 31 * result + (int) (givenAns ^ (givenAns >>> 32));
        return result;
    }
}
