package com.ibps.ui;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibps.utility.Messages;
import org.apache.log4j.Logger;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Servlet implementation class LoaderServlet
 */
public class LoaderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static Logger logger = Logger.getLogger("com.biz");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Servlet#init(ServletConfig)
     */
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        logger.info("ENTRY.............");
        Messages.getInstance("ims");

        /*JobDetail job = JobBuilder.newJob(EmailJob.class)
                .withIdentity("dummyJobName", "group1").build();
*/
        //Quartz 1.6.3
        //CronTrigger trigger = new CronTrigger();
        //trigger.setName("dummyTriggerName");
        //trigger.setCronExpression("0/5 * * * * ?");

        /*Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("dummyTriggerName", "group1")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule(Messages.getString("email_shedule_time")))
                .build();
        try{
            //schedule it
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.scheduleJob(job, trigger);
            scheduler.start();

        }catch(Exception e){
            e.printStackTrace();
        }*/

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
