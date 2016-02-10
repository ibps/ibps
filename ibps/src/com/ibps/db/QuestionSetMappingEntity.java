package com.ibps.db;

import javax.persistence.*;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "question_set_mapping", schema = "", catalog = "ibps")
public class QuestionSetMappingEntity {
    private long id;
    private int quesSetMasterId;
    private long quesMasterId;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ques_set_master_id", nullable = false, insertable = true, updatable = true)
    public int getQuesSetMasterId() {
        return quesSetMasterId;
    }

    public void setQuesSetMasterId(int quesSetMasterId) {
        this.quesSetMasterId = quesSetMasterId;
    }

    @Basic
    @Column(name = "ques_master_id", nullable = false, insertable = true, updatable = true)
    public long getQuesMasterId() {
        return quesMasterId;
    }

    public void setQuesMasterId(long quesMasterId) {
        this.quesMasterId = quesMasterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionSetMappingEntity that = (QuestionSetMappingEntity) o;

        if (id != that.id) return false;
        if (quesSetMasterId != that.quesSetMasterId) return false;
        if (quesMasterId != that.quesMasterId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + quesSetMasterId;
        result = 31 * result + (int) (quesMasterId ^ (quesMasterId >>> 32));
        return result;
    }
}
