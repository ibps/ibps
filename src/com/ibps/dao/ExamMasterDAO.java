package com.ibps.dao;

import com.ibps.db.ExamDetailsEntity;
import com.ibps.persistence.hibernate.PersistenceException;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Rajesh on 24-02-2016.
 */
public class ExamMasterDAO {
    private Logger logger = Logger.getLogger("com.biz");

    private Session session;

    public ExamMasterDAO(Session session) {

        this.session = session;
    }

    public List<ExamDetailsEntity> getAllExam() throws PersistenceException{
        List<ExamDetailsEntity> examList=null;
        Criteria criteria=session.createCriteria(ExamDetailsEntity.class);
        try {
            examList=criteria.list();
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e);
            throw new com.ibps.persistence.hibernate.PersistenceException(e, "PER_001");
        }
        return examList;
    }
}
