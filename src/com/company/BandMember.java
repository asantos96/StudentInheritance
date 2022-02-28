package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BandMember extends Student {
    List<String> instruments;
    int minimumNumberOfPracticeHours;

//    public void setInstruments(String instruments) {
//        this.instruments = Collections.singletonList(instruments);
//    }
//
//    public List<String> getInstruments() {
//        return instruments;
//    }
//    public void setMinimumNumberOfPracticeHours(int minimumNumberOfPracticeHours) {
//        this.minimumNumberOfPracticeHours = minimumNumberOfPracticeHours;
//    }
//
//    public double getMinimumNumberOfPracticeHours() {
//        return minimumNumberOfPracticeHours;
//    }

    public BandMember(String name, int idNumber, List<String> instruments, int minimumNumberOfPracticeHours) {
        super(name, idNumber);
        this.instruments = instruments;
        this.minimumNumberOfPracticeHours = minimumNumberOfPracticeHours;
    }

    @Override
    public void showStudent(){
        super.showStudent();
        System.out.println("Instruments played: " + instruments + ". Min. # Of Practice Hours: " +
                minimumNumberOfPracticeHours);

    }
}