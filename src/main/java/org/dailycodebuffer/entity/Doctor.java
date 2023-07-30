package org.dailycodebuffer.entity;

import org.dailycodebuffer.api.Staff;

public class Doctor implements Staff {
    private String qualification;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void assist() {
        System.out.println("Doctor is operating!");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


}
