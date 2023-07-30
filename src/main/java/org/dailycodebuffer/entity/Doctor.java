package org.dailycodebuffer.entity;

import org.dailycodebuffer.api.Staff;

public class Doctor implements Staff {

    private String qualification;
    private Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
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
