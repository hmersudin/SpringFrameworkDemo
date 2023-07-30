package org.dailycodebuffer.entity;

import org.dailycodebuffer.api.Staff;
import org.springframework.stereotype.Component;

/**
 * @Component - we are telling spring whatever class that we created is component
 * that you can use to create the beans out of it!
 */
//@Component
public class Doctor implements Staff {
    @Override
    public void assist() {
        System.out.println("Doctor is operating!");
    }

}
