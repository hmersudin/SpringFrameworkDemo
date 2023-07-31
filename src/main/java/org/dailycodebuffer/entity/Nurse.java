package org.dailycodebuffer.entity;

import org.dailycodebuffer.api.Staff;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Nurse implements Staff {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void assist() {
        System.out.println("Nurse is assisting!");
    }
}
