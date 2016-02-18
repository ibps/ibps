package com.ibps.db;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "ques_setion_master")
public class QuesSetionMasterEntity implements Serializable {
    private int id;
    private String sectionName;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "section_name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuesSetionMasterEntity that = (QuesSetionMasterEntity) o;

        if (id != that.id) return false;
        if (sectionName != null ? !sectionName.equals(that.sectionName) : that.sectionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sectionName != null ? sectionName.hashCode() : 0);
        return result;
    }
}
