package com.ibps.persistence.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Created by Rajesh on 24-02-2016.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    // private static Log log = LogFactory.getLog(HibernateUtil.class);

    static {
        try {

            sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                    .buildSessionFactory();
            //logger.info("Session Factory for Remote DB...." + sessionFactory);

        } catch (Throwable ex) {
            ex.printStackTrace();
            //logger.error("Initial SessionFactory creation failed.", ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
