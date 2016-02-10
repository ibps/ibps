package com.ibps.db;

import javax.persistence.*;

/**
 * Created by Rajesh on 10-02-2016.
 */
@Entity
@Table(name = "user_type_master", schema = "", catalog = "ibps")
public class UserTypeMasterEntity {
    private int id;
    private String userType;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_type", nullable = false, insertable = true, updatable = true, length = 45)
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTypeMasterEntity that = (UserTypeMasterEntity) o;

        if (id != that.id) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        return result;
    }
}
