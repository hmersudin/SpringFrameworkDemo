package org.dailycodebuffer;

import org.dailycodebuffer.api.Staff;
import org.dailycodebuffer.entity.Doctor;
import org.dailycodebuffer.entity.Nurse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // used for xml config
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

        Doctor configDoctor = applicationContext.getBean(Doctor.class);
        configDoctor.assist();
    }
}