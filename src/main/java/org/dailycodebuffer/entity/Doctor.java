package org.dailycodebuffer.entity;

import org.dailycodebuffer.api.Staff;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Component - we are telling spring whatever class that we created is component
 * that you can use to create the beans out of it!
 */
@Component
public class Doctor implements Staff, BeanNameAware {

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void assist() {
        System.out.println("Doctor is operating!");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean name method is called!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct method is called");
    }
}
