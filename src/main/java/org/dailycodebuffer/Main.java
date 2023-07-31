package org.dailycodebuffer;

import org.dailycodebuffer.api.Staff;
import org.dailycodebuffer.entity.Doctor;
import org.dailycodebuffer.entity.Nurse;
import org.dailycodebuffer.entity.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // region Spring introduction
        // used for xml config
//        ApplicationContext applicationContext = getPartOne();

        //region AOP
        final ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        final ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout("Canceled");
        //endregion


    }

    private static ApplicationContext getPartOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        Nurse nurse = (Nurse) context.getBean("nurse");
        nurse.assist();

        // implement with interface
        Staff staffDoc = context.getBean(Doctor.class);
        staffDoc.assist();

        Staff staffNurse = context.getBean(Nurse.class);
        staffNurse.assist();

        /**
         * Used for java configuration {@link BeanConfiguration}
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Doctor configDoctor1 = applicationContext.getBean(Doctor.class);
        configDoctor1.assist();
        configDoctor1.setQualification("MBBS");
        System.out.println(configDoctor1);

        // we are getting same object again, because we use 'singleton' bean scope
        Doctor configDoctor2 = applicationContext.getBean(Doctor.class);
        System.out.println(configDoctor2);

        // we are getting new (different) object, because we use 'prototype' bean scope (every time object is created)
        Nurse nurse1 = applicationContext.getBean(Nurse.class);
        nurse1.setQualification("MBBS2");
        System.out.println(nurse1);

        Nurse nurse2 = applicationContext.getBean(Nurse.class);
        System.out.println(nurse2);
        // endregion
        return applicationContext;
    }
}