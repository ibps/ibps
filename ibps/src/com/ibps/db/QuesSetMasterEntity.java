package com.ibps.db;

import javax.persistence.*;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "ques_set_master")
public class QuesSetMasterEntity implements Serializable{
    private int id;
    private String setName;
    private int examDetailsId;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "set_name", nullable = false, insertable = true, updatable = true, length = 128)
    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    @Basic
    @Column(name = "exam_details_id", nullable = false, insertable = true, updatable = true)
    public int getExamDetailsId() {
        return examDetailsId;
    }

    public void setExamDetailsId(int examDetailsId) {
        this.examDetailsId = examDetailsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuesSetMasterEntity that = (QuesSetMasterEntity) o;

        if (id != that.id) return false;
        if (examDetailsId != that.examDetailsId) return false;
        if (setName != null ? !setName.equals(that.setName) : that.setName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (setName != null ? setName.hashCode() : 0);
        result = 31 * result + examDetailsId;
        return result;
    }
}
